package com.isep.hpah.core;


public class Enemy extends Character {
    private int lifePoint;
    private int maxLifePoint;
    private String name;
    private int accuracy;
    private int damage;
    private int resistance;

    public Enemy(int lifePoint, int maxLifePoint, String name, int accuracy, int power, int efficiencyPotions, int resistance) {
        super(name,lifePoint, maxLifePoint,  accuracy, power, efficiencyPotions, resistance);
    }




    //@Override
    public int attack() {
        return 0;
    }

    //@Override
    public int defend() {
        return 0;
    }
}
