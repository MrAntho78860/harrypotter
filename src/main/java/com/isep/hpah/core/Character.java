package com.isep.hpah.core;

public class Character {
    private String name;
    private int lifePoint;
    private int maxlifePoint;
    private int accuracy;
    private int power;
    private int efficiencyPotions;
    private int resistance;

    public Character(String name, int lifePoint, int maxLifePoint, int accuracy, int damage, int efficiencyPotions, int resistance) {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifePoint() {
        return lifePoint;
    }

    public void setLifePoint(int lifePoint) {
        this.lifePoint = lifePoint;
    }
}
