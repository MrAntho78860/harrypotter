package com.isep.hpah.core;

public class AbstractSpell {
    private int accuracy;
    private int damage;
    private String name;
    private int resistance;
    private String type;

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
