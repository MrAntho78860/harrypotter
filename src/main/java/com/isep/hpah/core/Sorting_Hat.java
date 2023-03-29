package com.isep.hpah.core;
import java.util.ArrayList;
import java.util.Random;

public class Sorting_Hat {
    static String house;
    public static void ChooseHouse() {
        System.out.println("Here is the Sorting Hat which will decide which House you go to.");
        Random rand = new Random();
        int chosenHouse = rand.nextInt(House.HOUSES.length);
        house = House.HOUSES[chosenHouse];
        System.out.println("The Sorting Hat has chosen your House! Lucky you! Your House is: " + house);
    }
}
