package com.isep.hpah.core;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Story {

    static Wand wand;
    static Sorting_Hat sortingHat;
    static Wizard wizard;

    public static void printIntro() {
        //print title screen
        System.out.println("                                                             _ __");
        System.out.println("                            ___                             | '  \\");
        System.out.println("                       ___  \\ /  ___         ,'\\" + "_           | .-. \\        /|");
        System.out.println("                       \\ /  | |,'__ \\  ,'\\" + "_  |   \\          | | | |      ,' |_   /|");
        System.out.println("                     _ | |  | |\\/  \\ \\ |   \\ | |\\_|    _    | |_| |   _ '-. .-',' |_   _");
        System.out.println("                    // | |  | |____| | | |\\_|| |__    //    |     | ,'_`. | | '-. .-',' `. ,'\\" + "_");
        System.out.println("                    \\\\_| |_,' .-, _  | | |   | |\\ \\  //    .| |\\_/ | / \\ || |   | | / |\\  \\|   \\");
        System.out.println("                     `-. .-'| |/ / | | | |   | | \\ \\/     |  |    | | | || |   | | | |_\\ || |\\_|");
        System.out.println("                       | |  | || \\_| | | |   /_\\" + "  \\ /      | |`    | | | || |   | | | .---'| |");
        System.out.println("                       | |  | |\\___,_\\ /_\\" + "_      //       | |     | \\_/ || |   | | | |  /\\| |");
        System.out.println("                       /_\\" + "  | |           //_____//       .||`      `._,' | |   | | \\ `-' /| |");
        System.out.println("                            /_\\" + "           `------'        \\ |              `.\\\\" + "  | |  `._,' /_\\" + "");
        System.out.println("                                                           \\|                    `.");
        System.out.println("       _");
        System.out.println("      /b_,dM\\__,_");
        System.out.println("    _/MMMMMMMMMMMm,");
        System.out.println("   _YMMMMMMMMMMMM(");
        System.out.println("  `MMMMMM/   /   \\   ");
        System.out.println("   MMM|  __  / __/  ");
        System.out.println("   YMM/_/# \\__/# \\    ");
        System.out.println("   (.   \\__/  \\__/     ");
        System.out.println("     )       _,  |    ");
        System.out.println("_____/\\     _   /       ");
        System.out.println("    \\  `._____,\'");
        System.out.println("     `..___(__");
        System.out.println("              ``-.");
        System.out.println("                  \\");
        System.out.println("                   )");


        System.out.println("                                                           HARRY POTTER AT HOME"
                + "\n                                               " +
                " A game created and designed by Anthony Amar");
        System.out.println(" ");

        Game.promptEnterKey();
        Game.textDelay("Welcome to the enchanting world of Harry Potter!");
        Game.textDelay("As a young wizard, you've been granted a once-in-a-lifetime opportunity to attend Hogwarts School of Witchcraft and Wizardry.");
        Game.textDelay("This is where you'll unleash your true potential and discover the true power of magic.");
        Game.textDelay("But beware, the magical world is filled with danger and treachery, and not everyone has your best interests at heart.");
        Game.textDelay("As you navigate through the mysterious halls of Hogwarts, you'll need to hone your skills and form alliances to overcome the obstacles that lie ahead.");
        Game.textDelay("The fate of the wizarding world rests in your hands, so get ready to embark on the adventure of a lifetime and make your mark on the wizarding world!");
        Game.promptEnterKey();


    }

    public static void beginning() {


        System.out.println("May I have the pleasure of knowing your name?");
        Game.name();
        Sorting_Hat.ChooseHouse();
        Game.petinialise();
        System.out.println("Delighted to make your acquaintance! Please follow me, as we proceed to select your wand.");
        System.out.println("Welcome to the Wand Shop. We will choose your first wand here!");
        System.out.println("It is time to get you a wand.");
        System.out.println("Hmmm... Let us see which wand is best for you? Hmm...");
        Game.delay(3000);
        wand = new Wand();
        wand.wand();
        System.out.println("It's perfect!");
        Game.promptEnterKey();

    }

    public static void printFirstActIntro() {
        Game.textDelay("You are now presented with the " + Sorting_Hat.getHouse() + " communal area and living quarters.");
        Game.textDelay("The elder students are already present, and they are all discussing the recent surge in assaults by mystical creatures.");
        Game.textDelay("These attacks can occur anytime and anyplace.");
        Game.textDelay("You are advised to remain cautious and vigilant for any indication of danger.");
        Game.promptEnterKey();
        Game.printHeading("Later that week");
        Spell expelliarmus = Spell.Expelliarmus;


        Game.textDelay("You acquire your initial incantation, " +  expelliarmus+ " in the lecture hall.");
        Game.textDelay("As you traverse the castle, you observe... ");
        //Game.randomEncounter();
        Game.textDelay("AMAZING! That was a close call! You are fortunate to be alive!");
        Game.printSeperator(1);
        //Game.textDelay("the deceased " + Game.enemyNames[AbstractEnemy.enemy] + " is lying on the ground in front of you.");

    }
}




