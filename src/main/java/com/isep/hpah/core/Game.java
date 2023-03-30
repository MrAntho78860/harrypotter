package com.isep.hpah.core;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class Game {
    static String name;
    static Wizard wizard;
    static String pet;

    static int enemycount = 0;
    static Core core;

    static Scanner scanner = new Scanner(System.in);
    public static int place = 0;

    public static int boss = 0;

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
            } else if (input == 4) {
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
            } else
                System.out.println("Invalid input");
            pet = String.valueOf(Pet.values()[input - 1]);
            System.out.println("You have chosen " + pet + " as your pet. Please give him a name.");
            String petName;
            petName = scanner.next();
            System.out.println("You have named your pet " + petName + ".");
        } while (!petSet);

    }

    public static void name() {
        name = scanner.nextLine();
        System.out.println("Your name is " + name + ", a splendid name indeed!");
    }

    //Method to start the game
    public static void Begin() {


        Story.printIntro();

        //setting 'Running'  to true, so the game loop
        isRunning = true;

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


    public static void continueJourney() {
        //check if act must be increased
        //checkAct();
        Story.printFirstActIntro();
        //print the end screen
        //Story.printEnd();
    }


    //private static void checkAct() {
    //}

    public static void characterInfo() {
        boolean returnmenu;
        clearConsole();
        printHeading("Character Info");
        System.out.println("Name: " + name);
        System.out.println("House: " + Sorting_Hat.getHouse());
        System.out.println("Pet: " + pet);
        System.out.println("Wand core: " + Wand.core + "     size: " + Wand.getSize() + " cm");
        System.out.println("Enemies killed : " + enemycount);;
        //System.out.println("Known-spells: " + wizard.getSpells().toString());
        //System.out.println("potions: " + wizard.getPotions().toString());
        System.out.println(" ");
        promptEnterKey();
        returnmenu = true;
        if (returnmenu) {
            clearConsole();
            printMenu();
        }
    }

    static void clearConsole() {
        for (int i = 0; i < 50; i++)
            System.out.println();
    }

    static void printHeading(String title) {
        printSeperator(1);
        System.out.println(title);
        printSeperator(1);
    }

    public static void printMenu() {
        isRunning = true;
        clearConsole();
        printHeading("Main Menu");
        System.out.println(places[place]);
        System.out.println("Choose an action: ");
        printSeperator(1);
        System.out.println("(1) Continue Journey");
        System.out.println("(2) Character Info");
        System.out.println("(3) Exit Game");

    }

    public static void gameLoop() {
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


//Enemies name

    public static String[] enemyNames = {"Dementor", "Basilisk", "Acromantula", "Death Eater", "Voldemort", "Dementor", "Basilisk", "Acromantula", "Death Eater", "Voldemort"};




    //method to start a battle
    public static void battle(AbstractEnemy enemy, Wizard wizard){
        //start battle
        while(true){

            clearConsole();
            Story.spider();
            printHeading("Place : " + places[boss] +" | "+" Enemy Kills : " + enemycount  );
            printHeading(enemy.getName() + " HP: " + enemy.getLifePoint() + "/" + enemy.getMaxlifePoint());
            printHeading( name + " HP: " + wizard.lifePoint+ "/" + wizard.maxLifePoint);
            System.out.println("Choose an action: ");
            printSeperator(1);
            System.out.println("(1) Attack \n(2) Potions \n(3) Run");
            int input = readInt("->", 3);
            //react according to the input
            if (input == 1){
                System.out.println();
                //Fight
                //calcultaing the damage and damage reduction
                int dmg = wizard.attack() - enemy.defend();
                int dmgTook = enemy.attack() - wizard.defend();
                //check if the damage is negative
                if(dmg < 0){
                    //add some damage if player defends well
                    dmg -= dmgTook/2;
                    dmgTook = 0;
                }
                if(dmg < 0)
                    //set damage to 0 if it is negative
                    dmg = 0;
                //deal dmg to both parties
                wizard.lifePoint -= dmgTook;
                enemy.lifePoint -= dmg;
                //print the info of this battle round
                clearConsole();
                printHeading("You used " + Spell.getName(Story.spell) + "!"
                        + "\n You attacked " + enemy.getName() + " for " + dmg + " damage!");
                printHeading(enemy.getName() + " attacked you for " + dmgTook + " damage!");
                promptEnterKey();
                //check if battle is over
                if(wizard.lifePoint <= 0){
                    //player lost
                    //wizardDied();
                    break;
                }else if(enemy.lifePoint <= 0){
                    //player won
                    enemycount += 1;
                    clearConsole();
                    printHeading("You defeated " + enemy.getName() + "!");
                    //add xp
                    //wizard.xp += enemy.xp;
                    //System.out.println("You gained " + enemy.xp + " xp!");
                    boolean addRest = (Math.random()*5 + 1 <= 2.25);
                    int goldEarned = (int)(Math.random()*10);
                    if (addRest){
                        //add rest
                        wizard.restsleft++;
                        System.out.println("You found a rest spot!");
                        wizard.lifePoint = wizard.maxLifePoint;
                    }
                    if(goldEarned > 0){
                        //add gold
                        wizard.gold += goldEarned;
                        System.out.println("You found " + goldEarned + " gold from " + enemy.getName() + "!");
                    }
                    promptEnterKey();
                    break;
                }
            }else if(input == 2) {
                //use potion
                clearConsole();
                if (wizard.pots > 0 && wizard.lifePoint < wizard.maxLifePoint) {
                    //use potion
                    wizard.pots--;
                    wizard.lifePoint += 10;
                    if (wizard.lifePoint > wizard.maxLifePoint) {
                        printHeading("Do you want to use a potion? (" + wizard.pots + " left)");
                        System.out.println("(1) Yes \n(2) No");
                        input = readInt("->", 2);
                        if (input == 1) {
                            wizard.lifePoint += 50;
                            printHeading("You used a potion back to " + wizard.maxLifePoint + " hp");
                            promptEnterKey();
                        } else {
                            //no potions
                            printHeading("You don't have any potions or you are full hp!");
                            promptEnterKey();
                        }
                    }
                }
            }
            else if(input == 3){
                clearConsole();
                //Chance of escape = 50%
                if(Math.random()*10 + 1 <= 5){
                    printHeading("You ran away from " + enemy.getName() + "!");
                    promptEnterKey();
                    break;
                }else{
                    printHeading("You couldn't escape from " + enemy.getName() + "!");
                    int dmgTook = enemy.attack();
                    System.out.println("You took " + dmgTook + " damage!");
                    promptEnterKey();
                    if(wizard.lifePoint <= 0) {
                        //player lost
                        //wizardDied();
                        break;
                    }
                }
            }
        }
    }
}
