package com.isep.hpah.core;

import java.util.Random;
import java.util.Scanner;

public class Story {

    static Wand wand;
    static Sorting_Hat sortingHat;
    static Wizard wizard;
    public static void printIntro() {
        //print title screen
        System.out.println("     ___      ___         _          ________      ________    __       __             ________     ________     ____________    ____________    __________     ________              ");
        System.out.println("     | |      | |        / \\        / /    \\ \\    / /    \\ \\   \\ \\     / /            / /    \\ \\   / /_____\\ \\  |____________|  |____________|  |  ________|   / /    \\ \\          ");
        System.out.println("     | |      | |       / _ \\       | |     | |   | |     | |   \\ \\   / /             | |     | |  | |     | |        | |             | |       | |            | |     | |                   ");
        System.out.println("     | |______| |      / / \\ \\      | |____/ /    | |____/ /     \\_\\ /_/              | |____/ /   | |     | |        | |             | |       | |________    | |____/ /         ");
        System.out.println("     | |______| |     / /___\\ \\     | |___/ /     | |___/ /        | |                | |___/_/    | |     | |        | |             | |       |  ________|   | |___/ /");
        System.out.println("     | |      | |    / /_____\\ \\    | |   \\ \\     | |   \\ \\        | |                | |          | |     | |        | |             | |       | |            | |   \\ \\      ");
        System.out.println("     | |      | |   / /       \\ \\   | |    \\ \\    | |    \\ \\       | |                | |          | |_____| |        | |             | |       | |________    | |    \\ \\             ");
        System.out.println("     |_|      |_|  /_/         \\_\\  |_|     \\_\\   |_|     \\_\\      |_|                |_|          \\_\\_____/_/        |_|             |_|       |__________|   |_|     \\_\\                             ");
        System.out.println("                                                                                                                          ");
        System.out.println("                                                                               /-\\                                  ");
        System.out.println("                                                                              /   \\                            ");
        System.out.println("                                                                             /     \\                         ");
        System.out.println("                                                                            /       \\                         ");
        System.out.println("                                                                           /         \\                       ");
        System.out.println("                                                                          /           \\                      ");
        System.out.println("                                                                         /             \\                      ");
        System.out.println("                                                                        /               \\                      ");
        System.out.println("                                                                       /                 \\                      ");
        System.out.println("                                                                      /                   \\                      ");
        System.out.println("                                                                     /                     \\                      ");
        System.out.println("                                                                    /                       \\                      ");
        System.out.println("                                                                 |||||||||||||||||||||||||||||||                     ");
        System.out.println("                                                                      |                   |            ");
        System.out.println("                                                                      |    __       __    |            ");
        System.out.println("                                                                     /|   |  |     |  |   |\\       ");
        System.out.println("                                                                     \\|   |__| / \\ |__|   |/          ");
        System.out.println("                                                                      |       /___\\       |         ");
        System.out.println("                                                                      |                   |         ");
        System.out.println("                                                                       \\     _______     /         ");
        System.out.println("                                                                        \\   [_______]   /         ");
        System.out.println("                                                                         \\             /         ");
        System.out.println("                                                                          \\___________/         ");

        Game.printHeading("                                                                        HARRY POTTER AT HOME"
                + "\n                                                           A game created and designed by Anthony Amar");
        System.out.println(" ");

        Game.promptEnterKey();





    //public static void beginning() {
        System.out.println("Greetings, and welcome to Poudlard! I am Dumbledore, the headmaster.");
        Wait.wait(2000);
        System.out.println("May I have the pleasure of knowing your name?");
        Wait.wait(2000);
        Game.name();
        Sorting_Hat.ChooseHouse();
        Game.petinialise();
        Wait.wait(2000);
        System.out.println("Delighted to make your acquaintance! Please follow me, as we proceed to select your wand.");
    }

    public static void beginning() {
    }
    }



