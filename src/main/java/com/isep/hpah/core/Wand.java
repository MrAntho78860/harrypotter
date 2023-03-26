package com.isep.hpah.core;

import lombok.*;
import java.util.Scanner;


public class Wand {
    private static int size;
    private static Core core;

    public static void main(String[] args) {
        System.out.println("Welcome to the Wand Shop. You will choose your first wand here!");
        displayAvailableCores();
        chooseCore();
        chooseSize();
        System.out.println("Congratulations, your wand has a " + core.toString().replace("_", " ") +
                " core and a length of " + size + " centimeters!");
    }

    private static void displayAvailableCores() {
        System.out.println("Here are the different wand cores we have:");
        for (Core c : Core.values()) {
            System.out.println(c.toString().replace("_", " "));
            wait(500);
        }
    }

    private static void chooseCore() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which wand core would you like to choose?");
        String input = scanner.nextLine().trim().toLowerCase();
        while (true) {
            switch (input) {
                case "drake's heart":
                    core = Core.coeur_dragon;
                    break;
                case "griffon's leaf":
                    core = Core.plume_griffon;
                    break;
                case "phoenix's feather":
                    core = Core.plume_phoenix;
                    break;
                case "drake's fruit":
                    core = Core.fruit_dragon;
                    break;
                default:
                    System.out.println("Sorry, we don't have that core. Please choose from the available options.");
                    displayAvailableCores();
                    input = scanner.nextLine().trim().toLowerCase();
                    continue;
            }
            break;
        }
        System.out.println("You have chosen a " + core.toString().replace("_", " ") + " wand core.");
    }

    private static void chooseSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Now choose the length of your wand (in centimeters):");
        while (true) {
            try {
                int input = Integer.parseInt(scanner.nextLine().trim());
                if (input >= 20 && input <= 35) {
                    size = input;
                    break;
                } else {
                    System.out.println("Sorry, that's not a valid size. Please choose a size between 20 and 35 centimeters.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Sorry, that's not a valid size. Please enter a number between 20 and 40.");
            }
        }
        System.out.println("You have chosen a wand with a length of " + size + " centimeters.");
    }

    private static void wait(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            // do nothing

        }
    }
}
