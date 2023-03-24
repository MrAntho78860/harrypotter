package com.isep.hpah.core;
import java.util.ArrayList;
import java.util.Random;

public class Sorting_Hat {



    public static void ChooseHouse() {
        System.out.println("Here is the Sorting Hat which will decide which House you go to.");
        Wait.wait(2000);
        ArrayList<String> houses = new ArrayList<>();
        houses.add("Gryffindor");
        houses.add("Slytherin");
        houses.add("Ravenclaw");
        houses.add("Hufflepuff");
        Random rand = new Random();
        int chosenHouse = rand.nextInt(houses.size());
        String house = houses.get(chosenHouse);
        System.out.println("The Sorting Hat has chosen your House! Lucky you! Your House is: " + house);
    }
}
