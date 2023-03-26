package com.isep.hpah.core;

import java.util.Scanner;

public class Story {
    static String name;
    static void Begin() {
        Scanner Objet = new Scanner(System.in);


        System.out.println("Greetings, and welcome to Poudlard! I am Dumbledore, the headmaster.");
        Wait.wait(2000);
        System.out.println("May I have the pleasure of knowing your name?");
        name = Objet.nextLine();
        System.out.println("Your name is " + name + ", a splendid name indeed!");
        Wait.wait(2000);
        Pet petsName = Pet.randomPets();
        System.out.println("Ah, I see that your companion is named " + petsName + ".");
        Wait.wait(2000);
        System.out.println("Delighted to make your acquaintance! Please follow me, as we proceed to select your wand.");
    }
}
