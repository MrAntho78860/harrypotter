package com.isep.hpah.core;

import java.util.Scanner;

public class Game {
    static String name;
    static String pet;
    static Scanner scanner = new Scanner(System.in);
    public static int readInt(String prompt, int userChoices) {
        int input;
        do {
            System.out.println(prompt);
            try {
                input = Integer.parseInt(scanner.next());
            } catch (Exception e) {
                input = -1;
                System.out.println("Please enter integer!");
            }

        } while (input < 1 || input > userChoices);
        return input;

    }

    public static void petinialise() {
        boolean petSet;
        petSet = false;
        do {
            for (int i = 0; i < Pet.values().length; i++)
                System.out.println("(" + (i + 1) + ")" + Pet.values()[i]);
            int input = readInt("->", 4);
            if (input == 1)
                petSet = true;
            else if (input == 2)
                petSet = true;
            else if (input == 3)
                petSet = true;
            else if (input == 4)
                petSet = true;
            else
                System.out.println("Invalid input");
            pet = String.valueOf(Pet.values()[input - 1]);
            System.out.println("You have chosen " + pet + " as your pet. Please give him a name.");
            String petName;
            petName = scanner.next();
            System.out.println("You have named your pet " + petName + ".");
        } while (!petSet);

    }
    public static void name(){
        name = scanner.nextLine();
        System.out.println("Your name is " + name + ", a splendid name indeed!");
    }
    //Method to start the game
    public static void Begin() {


        Story.printIntro();

        //setting 'Running'  to true, so the game loop
        //isRunning = true;

        //start main game loop can continue
        printMenu();
        gameLoop();

    }

    private static void gameLoop() {
    }

    private static void printMenu() {
    }

    public static void printHeading(String s) {
    }

    public static void promptEnterKey() {
    }
}