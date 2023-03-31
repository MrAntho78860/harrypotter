package com.isep.hpah.core;

import java.util.ArrayList;
import java.util.Arrays;



public class Potion {
    private static String name;
    private int lifePoint;
    private int accuracy;
    private int damage;
    private int resistance;
    private String type;
    static String[] potions = {};


    static Potion potion;

    public Potion(String name, int accuracy, int damage,  int resistance, int lifePoint) {
        this.accuracy = accuracy;
        this.damage = damage;
        this.name = name;
        this.resistance = resistance;
        this.lifePoint = Wizard.lifePoint;
    }

    public static void UsePotion() {
        Game.clearConsole();
        Game.printHeading("Which potion would you like to cast?");
        for (int i = 0; i < potions.length; i++)
            System.out.println("(" + (i + 1) + ") " + potions[i]);
        int input = Game.readInt("->", potions.length);
        //Forbiddenpotion forbiddenpotion;
        if (potions[input - 1] == "Potion of heal") {
            potion = new Potion("Potion of heal", 0, 0, 0, 40);
        } else if (potions[input - 1] == "Potion of accuracy") {
            potion = new Potion("Potion of accuracy", 10, 0, 0, 0);
        } else if (potions[input - 1] == "Potion of damage") {
            potion = new Potion("Potion of damage", 0, 10 , 0, 0 );
        } else if (potions[input - 1] == "Potion of resistance") {
            potion = new Potion("Potion of resistance", 0, 0, 10, 0);
        }else if (potions[input - 1] == "Super Potion") {
                potion = new Potion("Super Potion", 10, 10,   10, 10);

        }


    }

    public static void rndPotion(){
        int rnd = (int) (Math.random()*21);
        if (rnd <= 5)
            potions("Potion of heal");
        if (5 < rnd && rnd <= 10)
            potions("Potion of accuracy");
        if (10 < rnd && rnd <= 15)
            potions("Potion of damage");
        if (15 < rnd && rnd <= 20)
            potions("Potion of resistance");
        if (rnd == 21)
            potions("Super Potion");

    }
    public static void potions(String name){
        System.out.println("You have obtained a " + name);
        ArrayList<String> arrlistObj =
                new ArrayList<String>(Arrays.asList(name));
        // Add new element to the ArrayList
        arrlistObj.add(name);
        // Convert the ArrayList to Array
        potions = arrlistObj.toArray(new String[]{name});
    }
}
