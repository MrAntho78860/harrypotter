package com.isep.hpah.core;

public class House {
    public static int potionboost;
    public static int damageboost;
    public static int resistanceboost;
    public static int accuracyboost;
    public static String boostedstat = "boostedstat";

    public static final String[] HOUSES = {"Gryffindor", "Ravenclaw", "Hufflepuff", "Slitherin"};


    public void house() {
        if (Sorting_Hat.house == ("Gryffindor")) {
            potionboost = 0;
            damageboost = 0;
            resistanceboost = 25;
            accuracyboost = 0;
            boostedstat = "resistance";
        } else if (Sorting_Hat.house == ("Ravenclaw")) {
            potionboost = 0;
            damageboost = 0;
            resistanceboost = 0;
            accuracyboost = 25;
            boostedstat = "accuracy";
        } else if (Sorting_Hat.house == ("Hufflepuff")) {
            potionboost = 25;
            damageboost = 0;
            resistanceboost = 0;
            accuracyboost = 0;
            boostedstat = "potion";
        } else if (Sorting_Hat.house == ("Slitherin")) {
            potionboost = 0;
            damageboost = 25;
            resistanceboost = 0;
            accuracyboost = 0;
            boostedstat = "damage";
        }
        Game.textDelay("The house comes with a booost to certain stats.");
        Game.textDelay(Sorting_Hat.house + " gives you a 25% boost" + " to your " + boostedstat + " stat.");
    }


}