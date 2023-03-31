package com.isep.hpah.core;
import static com.isep.hpah.core.Story.wizard;
public class Level4 {
    static Wizard wizard;

    public static void Level4() {
        Game.clearConsole();

        System.out.println(" _      ________      ________ _        _  _   ");
        System.out.println("| |    |  ____\\ \\    / /  ____| |      | || |  ");
        System.out.println("| |    | |__   \\ \\  / /| |__  | |      | || |_|");
        System.out.println("| |    |  __|   \\ \\/ / |  __| | |      |__   _|");
        System.out.println("| |____| |____   \\  /  | |____| |____     | |  ");
        System.out.println("|______|______|   \\/   |______|______|    |_|  ");
        Game.promptEnterKey();
        Game.skiplines();
        Game.promptEnterKey();
        Spell Stupefy= new Spell(100,  10, "Stupefy",  10,  "defense");
        Game.textDelay("You acquire your initial incantation, " + Spell.getName(Stupefy) + " in the lecture hall.");
        Game.textDelay("It' s stats are as follow:    " + Spell.getDamage(Stupefy)+ "  dmg        " + Spell.getAccuracy(Stupefy)+ "  Acc        " + Spell.getResistance(Stupefy)+ "  Res      " + Spell.getType(Stupefy)+ "  Type" );
        Game.promptEnterKey();
        Game.battle(new AbstractEnemy("Werewolf", 100, 100, 50 , 20 , 0) ,wizard);
        Game.textDelay("AMAZING! That was a close call! You are fortunate to be alive!");
        Game.promptEnterKey();
        Game.printMenu();
        Game.promptEnterKey();
        Game.printSeperator(1);
        Game.battle(new AbstractEnemy("Dragon", 50, 50, 25, 50, 15), wizard);
        Game.textDelay("AMAZING! That was a close call! You are fortunate to be alive!");
        Game.promptEnterKey();
        Game.printMenu();
        Game.promptEnterKey();
        Game.printSeperator(1);
        Game.skiplines();
        System.out.println("You find yourself in the eerie graveyard of Little Hangleton,");
        System.out.println("facing the ultimate challenge: the infamous Dark Lord Voldemort and his loyal follower, Peter Pettigrew.");
        System.out.println("Your battle begins.");
        Game.promptEnterKey();
        Game.clearConsole();
        Game.battle(new Boss(100, 100,"Voldemort & Peter Pettigrew", 50 , 20 , 0), wizard);
        System.out.println("With all your might, you cast the Accio spell to draw the Portkey closer to you.");
        System.out.println("Voldemort and Pettigrew are closing in, but you manage to grab the Portkey and escape just in time.");
        System.out.println("Victory is yours, but the memory of this battle will haunt you forever.");
        Game.promptEnterKey();
        System.out.println();
        Game.printMenu();
    }
}
