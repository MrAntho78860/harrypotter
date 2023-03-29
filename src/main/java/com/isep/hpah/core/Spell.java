package com.isep.hpah.core;

public class Spell extends AbstractSpell{
    private int damage;

    public static Spell WingardiumLeviosa = new Spell(100, 10,"Wingardium Leviosa", 0 , "attack");
    public static Spell Expelliarmus = new Spell(80, 20,"Expelliarmus", 0 , "turnskip");
    public static Spell Protego = new Spell(100, 0,"Protego", 50 , "defense");
    public static Spell Stupefy = new Spell(60, 30,"Stupefy", 0 , "attack");
    public static Spell Sectumsempra = new Spell(40, 40,"Sectumsempra", 0 , "attack");


    public Spell(int accuracy, int damage, String name, int resistance, String type) {
        this.setAccuracy(accuracy);
        this.damage = damage;
        this.setName(name);
        this.setResistance(resistance);
        this.setType(type);
    }



}


