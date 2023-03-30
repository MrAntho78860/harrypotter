package com.isep.hpah.core;

import java.util.Random;


public class AbstractEnemy extends Character {
    int lifePoint;
    private final int maxLifePoint;
    private final String name;
    private int accuracy;
    private int damage;
    private int resistance;
    private int efficiencyPotions;
    public static int enemy;

    public AbstractEnemy(String name, int lifePoint, int maxLifePoint, int accuracy, int damage, int resistance) {
        super(name, lifePoint, maxLifePoint);
        this.lifePoint = lifePoint;
        this.maxLifePoint = maxLifePoint;
        this.name = name;
        this.accuracy = accuracy;
        this.damage = damage;
        this.resistance = resistance;
    }

    public static void enemy() {
        Random random = new Random();
        //random number between 0 and length of encounters array
        enemy = random.nextInt(Game.enemyNames.length);
        for (int i = enemy; i < Game.enemyNames.length - 1; i++) {
            Game.enemyNames[i] = Game.enemyNames[i + 1];
            System.out.println("a " + Game.enemyNames[enemy] + "!");
        }
    }

    public int getLifePoint() {
        return lifePoint;
    }

    public void setLifePoint(int lifePoint) {
        this.lifePoint = lifePoint;
    }

    public int getMaxLifePoint() {
        return maxLifePoint;
    }

    public String getName() {
        return name;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public int getDamage() {
        return damage;
    }

    public void setPower(int damage) {
        this.damage = damage;
    }

    public int getResistance() {
        return resistance;
    }

    public void setResistance(int resistance) {
        this.resistance = resistance;
    }

    //Enemy specific attack and defence calculations
    @Override
    public int attack() {
        if(Math.random()*100 +1 <= accuracy){
            System.out.println(name +  " attacked you!");
            return damage;
        }else {
            System.out.println("He misses");
            return 0;
        }
    }

    @Override
    public int defend() {
        return resistance;
    }
}




