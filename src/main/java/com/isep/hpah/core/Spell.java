package com.isep.hpah.core;

public class Spell extends AbstractSpell{

    public static int resistance;
    static int damage;
    static int accuracy;

    static String name, type;



    public static Spell Expelliarmus = new Spell(80, 20,"Expelliarmus", 0 , "turnskip");
    public static Spell Protego = new Spell(100, 0,"Protego", 50 , "defense");
    public static Spell Stupefy = new Spell(60, 30,"Stupefy", 0 , "attack");
    public static Spell Sectumsempra = new Spell(40, 40,"Sectumsempra", 0 , "attack");



    public Spell(int accuracy, int damage, String name, int resistance, String type) {
        super(accuracy, damage, name, resistance, type);
        this.accuracy = accuracy;
        this.damage = damage;
        this.name = name;
        this.resistance = resistance;
        this.type = type;
    }

    public void setType(String type) {
    }

    public void setResistance(int resistance) {
    }


    public static String getName(Spell name) {

        return Spell.name;
    }
    public static int getDamage(Spell name) {

        return Spell.damage;
    }
    public static int getAccuracy(Spell accuracy) {

        return Spell.accuracy;
    }
    public static int getResistance(Spell resistance) {

        return Spell.resistance;
    }

    public static String getType(Spell type) {

        return Spell.type;
    }



}


