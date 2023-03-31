package com.isep.hpah.core;
import static com.isep.hpah.core.Story.wizard;
public class Level3 {
    static Wizard wizard;

    public static void Level3() {
        Game.clearConsole();
        System.out.println(" _      ________      ________ _        ____  ");
        System.out.println("| |    |  ____\\ \\    / /  ____| |      |___ \\ ");
        System.out.println("| |    | |__   \\ \\  / /| |__  | |        __) |");
        System.out.println("| |    |  __|   \\ \\/ / |  __| | |       |__ < ");
        System.out.println("| |____| |____   \\  /  | |____| |____   ___) |");
        System.out.println("|______|______|   \\/   |______|______| |____/ ");
        Game.promptEnterKey();
        Game.skiplines();
        Game.promptEnterKey();
        Spell Patronum = new Spell(100,  10, "Expecto Patronum",  10,  "defense");
        Game.textDelay("You acquire your initial incantation, " + Spell.getName(Patronum) + " in the lecture hall.");
        Game.textDelay("It' s stats are as follow:    " + Spell.getDamage(Patronum)+ "  dmg        " + Spell.getAccuracy(Patronum)+ "  Acc        " + Spell.getResistance(Patronum)+ "  Res      " + Spell.getType(Patronum)+ "  Type" );
        Game.promptEnterKey();
        Game.battle(new AbstractEnemy("Aragog", 70,70 , 20, 30, 10), wizard );
        Game.textDelay("AMAZING! That was a close call! You are fortunate to be alive!");
        Game.promptEnterKey();
        Game.printMenu();
        Game.promptEnterKey();
        Game.printSeperator(1);
        Game.battle(new AbstractEnemy("Cerberus", 50, 50, 25, 50, 15), wizard);
        Game.textDelay("AMAZING! That was a close call! You are fortunate to be alive!");
        Game.promptEnterKey();
        Game.printMenu();
        Game.promptEnterKey();
        Game.printSeperator(1);
        Game.skiplines();
        System.out.println("You now face the formidable 'Dementors', ready to engage in battle within the murky waters of the Forbidden Forest lake.");
        System.out.println("The fight is about to begin.");
        Game.promptEnterKey();
        Game.clearConsole();
        Game.battle(new Boss(100, 100,"Dementor", 50 , 20 , 0), wizard);
        System.out.println("You unleash the power of 'Expecto Patronum', casting a powerful charm that sends the 'Dementors' fleeing in terror.");
        System.out.println("The battle is won, and you stand victorious in the face of darkness.");
        Game.promptEnterKey();
        System.out.println();
        Game.printMenu();
    }
}
