package com.isep.hpah.core;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class Game {
    static String name;
    static String pet;
    static Scanner scanner = new Scanner(System.in);
    static int place = 0;


    public static String[] places = {"Dungeon bathrooms", "Chamber of Secrets", "Lake in Forbidden Forrest", "Little Hangleton cemetery", "Exam Room Hogwarts", "Astronomy tower", "Hogwarts"};
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
        System.out.print("Please choose below an animal from 4 options. Enter the corresponding number.\n");
        boolean petSet;
        petSet = false;
        do {
            for (int i = 0; i < Pet.values().length; i++)
                System.out.println("(" + (i + 1) + ")" + Pet.values()[i]);
            int input = readInt("->", 4);
            promptEnterKey();
            clearConsole();
            if (input == 1) {

                System.out.println("\t\t  , _ , ");
                System.out.println("\t\t ( o o )");
                System.out.println("\t\t/'` ' `'");
                System.out.println("\t\t|'''''''|");
                System.out.println("\t\t|\\\\'''//|");
                System.out.println("\t\t   \"\"\"");
                petSet = true;
            } else if (input == 2) {

                System.out.println("               _     __,..---\"\"-._                 ';-,");
                System.out.println("        ,    _/_),-\"`             '-.                `\\\\");
                System.out.println("       \\|.-\"`    -_)                 '.                ||");
                System.out.println("       /`       ,                      \\              .'/");
                System.out.println("       '.___,__/                 .-'    \\_        _.-'.");
                System.out.println("          |\\  \\      \\         /`        _`\"\"\"\"\"`_.-'");
                System.out.println("             _/;--._, >        |   --.__/ `\"\"\"\"\"\"\"");
                System.out.println("           (((-'  __//`'-......-;\\      )");
                System.out.println("                (((-'       __//  '--. /");
                System.out.println("                          (((-'    __//");



                petSet = true;
             } else if (input == 3) {
                System.out.println("\t\t   ,-\"\"\"\"\"\"-.");
                System.out.println("\t\t     /\\j__/\t(  \\`--.");
                System.out.println("\t\t     \\`@_@'/\t  _)  >--.`.");
                System.out.println("\t\t    _{.:Y:_}_{{_,'\t    ) )");
                System.out.println("\t\t   {_}`-^{_}\t ```\t (_/");

                petSet = true;
            } else if (input == 4){
                System.out.println("\t                             .-----.\n"
                        + "\t                            /7  .  (\n"
                        + "\t                           /   .-.  \\\n"
                        + "\t                          /   /   \\  \\\n"
                        + "\t                         / `  )   (   )\n"
                        + "\t                        / `   )   ).  \\\n"
                        + "\t                      .'  _.   \\_/  . |\n"
                        + "\t     .--.           .' _.' )`.        |\n"
                        + "\t    (    `---...._.'   `---.'_)    ..  \\\n"
                        + "\t     \\            `----....___    `. \\  |\n"
                        + "\t      `.           _ ----- _   `._  )/)  |\n"
                        + "\t        `.       /\"  \\   /\"  \\`.  `._   |\n"
                        + "\t          `.    ((O)` ) ((O)` ) `.   `._\\\n"
                        + "\t            `-- '`---'   `---' )  `.    `-. \n"
                        + "\t               /                  ` \\      `-. \n"
                        + "\t             .'                      `.       `.\n"
                        + "\t            /                     `  ` `.       `-. \n"
                        + "\t     .--.   \\ ===._____.======. `    `   `. .___.--`     .''''.\n"
                        + "\t    ' .` `-. `.                )`. `   ` ` \\          .' . '  8)\n"
                        + "\t   (8  .  ` `-.`.               ( .  ` `  .`\\      .'  '    ' /\n"
                        + "\t    \\  `. `    `-.               ) ` .   ` ` \\  .'   ' .  '  /\n"
                        + "\t     \\ ` `.  ` . \\.    .--.     |  ` ) `   .``/   '  // .  /\n"
                        + "\t      `.  ``. .   \\ \\   .-- `.  (  ` /_   ` . / ' .  '/   .'\n"
                        + "\t        `. ` \\  `  \\ \\  '-.   `-'  .'  `-.  `   .  .'/  .'\n"
                        + "\t          \\ `.`.  ` \\ \\    ) /`._.`       `.  ` .  .'  /\n"
                        + "\t           |  `.`. . \\ \\  (.'               `.   .'  .'\n"
                        + "\t        __/  .. \\ \\ ` ) \\                     \\.' .. \\__\n"
                        + "\t .-._.-'     '\"  ) .-'   `.                   (  '\"     `-._.--.\n"
                        + "\t(_________.-====' / .' /\\_)`--..__________..-- `====-. _________)\n"
                        + "\t                 (.'(.'");
            petSet = true;
        }else
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


    }
    public static void delay(int n) {
        try {
            Thread.sleep(n);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void printSeperator(int n) {
        System.out.println("------------------------------------------------------------------------------------");
    }

    public static void startGame() {
        Story.printIntro();
        Story.beginning();
        isRunning = true;
        printMenu();
        gameLoop();

    }


    public static void textDelay(String text) {
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
            delay(0);
        }
        System.out.println("");
    }

    //method to stop the game until user enters anything
    public static void promptEnterKey() {
        System.out.println("Appuyez sur Entrée pour continuer...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }


    public static void continueJourney(){
        //check if act must be increased
        //checkAct();
        Story.printFirstActIntro();
            //print the end screen
            //Story.printEnd();
        }



    //private static void checkAct() {
    //}

    public static void characterInfo(){
        boolean returnmenu;
        clearConsole();
        printHeading("Character Info");
        System.out.println("Name: " + wizard.getName());
        System.out.println("House: " + Sorting_Hat.getHouse());
        System.out.println("Pet: "+ pet);
        System.out.println("Wand: " + wizard.getWand().afficheTailleNomWand());
        //System.out.println("Known-spells: " + wizard.getSpells().toString());
        //System.out.println("potions: " + wizard.getPotions().toString());
        System.out.println(" ");
        promptEnterKey();
        returnmenu = true;
        if (returnmenu){
            clearConsole();
            printMenu();
        }
    }

    static void clearConsole() {
        for(int i = 0; i < 50; i++)
            System.out.println();
    }

    static void printHeading(String title) {
        printSeperator(1);
        System.out.println(title);
        printSeperator(1);
    }

    public static void printMenu() {
        clearConsole();
        printHeading("Main Menu");
        System.out.println(places[place]);
        System.out.println("Choose an action: ");
        printSeperator(1);
        System.out.println("(1) Continue Journey");
        System.out.println("(2) Character Info");
        System.out.println("(3) Exit Game");
    }
        public static void gameLoop () {
            while (isRunning) {
                //print the main menu
                int input = readInt("->", 3);
                if (input == 1) {
                    //start the game
                    continueJourney();
                } else if (input == 2) {
                    characterInfo();
                    //exit the game
                } else if (input == 3) {
                    isRunning = false;
                }
            }
        }
}