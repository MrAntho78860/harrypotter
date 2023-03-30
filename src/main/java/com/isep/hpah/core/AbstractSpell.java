package com.isep.hpah.core;

public class AbstractSpell {
    private int damage;
    static String name;
    private int accuracy;

    private int resistance;
    private String type;
    public AbstractSpell(int accuracy, int damage, String name, int resistance, String type) {
        this.setAccuracy(accuracy);
        this.damage = damage;
        this.setName(name);
        this.setResistance(resistance);
        this.setType(type);
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setResistance(int resistance) {
        this.resistance= resistance;
    }




}


