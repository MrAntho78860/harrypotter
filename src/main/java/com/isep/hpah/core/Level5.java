package com.isep.hpah.core;

import static com.isep.hpah.core.Story.wizard;
public class Level5 {
    static Wizard wizard;

    public static void Level5() {
        Game.clearConsole();
        System.out.println(" _      ________      ________ _        _____ ");
        System.out.println("| |    |  ____\\ \\    / /  ____| |      | ____|");
        System.out.println("| |    | |__   \\ \\  / /| |__  | |      | |__  ");
        System.out.println("| |    |  __|   \\ \\/ / |  __| | |      |___ \\ ");
        System.out.println("| |____| |____   \\  /  | |____| |____   ___) |");
        System.out.println("|______|______|   \\/   |______|______| |____/ ");
        Game.promptEnterKey();
        Game.skiplines();
        Game.promptEnterKey();
        Spell Sectumsempra = new Spell(100, 10, "Sectumsempra", 10, "defense");
        Game.textDelay("You acquire your initial incantation, " + Spell.getName(Sectumsempra) + " in the lecture hall.");
        Game.textDelay("It' s stats are as follow:    " + Spell.getDamage(Sectumsempra) + "  dmg        " + Spell.getAccuracy(Sectumsempra) + "  Acc        " + Spell.getResistance(Sectumsempra) + "  Res      " + Spell.getType(Sectumsempra) + "  Type");
        Game.promptEnterKey();
        Game.battle(new AbstractEnemy("Dementor", 100, 100, 50, 20, 0), wizard);
        Game.textDelay("AMAZING! That was a close call! You are fortunate to be alive!");
        Game.promptEnterKey();
        Game.printMenu();
        Game.promptEnterKey();
        Game.printSeperator(1);
        Game.skiplines();
        System.out.println("You enter the Examination Room at Hogwarts to face your final challenge against the tyrannical Dolores Umbridge.");
        System.out.println("The tension is palpable as the battle is about to begin.");
        Game.promptEnterKey();
        Game.clearConsole();
        Game.battle(new Boss(100, 100, "Dolores Umbridge", 50, 20, 0), wizard);
        System.out.println("With a burst of spells, Dolores Umbridge was defeated.");
        System.out.println("The wizard used every trick in their arsenal, from stunning spells to disarming charms, until Umbridge was left disarmed and disoriented.");
        System.out.println("The students in the room erupted in cheers, and the wizard cast a few more spells to set off fireworks, lighting up the room with a colorful celebration.");
        Game.promptEnterKey();
        System.out.println();
        Game.printMenu();
    }
}
