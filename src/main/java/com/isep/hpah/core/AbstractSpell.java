package com.isep.hpah.core;

public class AbstractSpell {
    public static int damage;
    public static int resistance;
    public static int accuracy;
    public static String name;
    public static String type;
    public static int input;
    static String[] spells = {};
    static Spell spell;
  //  static ForbiddenSpell forbiddenSpell;
    static House houses;

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
        this.resistance = resistance;
    }
    public AbstractSpell(String name, int damage, int accuracy, int resistance, String type) {
        AbstractSpell.name = name;
        AbstractSpell.damage = damage + (damage*houses.damageboost)/100;
        AbstractSpell.accuracy = accuracy + (accuracy*houses.accuracyboost)/100;
        AbstractSpell.resistance = resistance + (resistance*houses.resistanceboost)/100;
        AbstractSpell.type = type;
    }

    public static void castSpell() {
        Game.clearConsole();
        Game.printHeading("Which spell would you like to cast?");
        for (int i = 0; i < spells.length; i++)
            System.out.println("(" + (i + 1) + ") " + spells[i]);
        input = Game.readInt("->", spells.length);
        //ForbiddenSpell forbiddenSpell;
        if (spells[input - 1] == "Wingardium Leviosa") {
            spell = new Spell(90, damage = 10, "Wingardium Leviosa", resistance = 0, type = "attack");
        } else if (spells[input - 1] == "Accio") {
            spell = new Spell(50, 50, "Accio", 0, "attack");
        } else if (spells[input - 1] == "Expecto Patronum") {
            spell = new Spell(100, damage = 10, "Patronum", resistance = 10, type = "defense");
        } else if (spells[input - 1] == "Stupefy") {
            spell = new Spell(100, damage = 30, "Stupefy", resistance = 0, type = "attack");
        } else if (spells[input - 1] == "Sectumsempra") {
            spell = new Spell(100, damage = 40, "Sectumsempra", resistance = 0, type = "attack");
         } else if (spells[input - 1] =="Expelliarmus") {
            spell = new Spell(100, damage = 40, "Expelliarmus", resistance = 0, type = "attack");
        } else if (spells[input - 1] =="Avada Kedavra") {
            spell = new Spell(100, damage = 40, "AvadaKedavra", resistance = 0, type = "attack");

    }

}
}

