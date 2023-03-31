package com.isep.hpah.core;
import static com.isep.hpah.core.Story.wizard;

public class Level6 {
    static Wizard wizard;

    public static void Level6() {
        Game.clearConsole();
        System.out.println(" _      _____ _   _ _____ _        ____ ");
        System.out.println("| |    |  ___| | | |  ___| |      / ___|");
        System.out.println("| |    | |__ | | | | |__ | |     / /___ ");
        System.out.println("| |    |  __|| | | |  __|| |     | ___ \\");
        System.out.println("| |____| |___\\ \\_/ / |___| |____ | \\_/ |");
        System.out.println("\\_____/\\____/ \\___/\\____/\\_____/ \\____/ ");
        Game.promptEnterKey();
        Game.skiplines();
        Game.promptEnterKey();
        Spell Expelliarmus = new Spell(100, 10, "Expelliarmus", 10, "defense");
        Game.textDelay("You acquire your initial incantation, " + Spell.getName(Expelliarmus) + " in the lecture hall.");
        Game.textDelay("It' s stats are as follow:    " + Spell.getDamage(Expelliarmus) + "  dmg        " + Spell.getAccuracy(Expelliarmus) + "  Acc        " + Spell.getResistance(Expelliarmus) + "  Res      " + Spell.getType(Expelliarmus) + "  Type");
        Game.promptEnterKey();
        Game.battle(new AbstractEnemy("Werewolf", 100, 100, 50, 20, 0), wizard);
        Game.textDelay("AMAZING! That was a close call! You are fortunate to be alive!");
        Game.promptEnterKey();
        Game.printMenu();
        Game.promptEnterKey();
        Game.printSeperator(1);
        Game.battle(new AbstractEnemy("Thestral", 100, 100, 50, 20, 0), wizard);
        Game.textDelay("AMAZING! That was a close call! You are fortunate to be alive!");
        Game.promptEnterKey();
        Game.printMenu();
        Game.promptEnterKey();
        Game.printSeperator(1);
        Game.skiplines();
        System.out.println("As you climb the winding stairs of the Astronomy Tower, you hear the faint echoes of laughter and whispers growing louder with each step.");
        System.out.println("At the top, you find yourself face to face with a group of menacing Death Eaters, their wands at the ready.");
        System.out.println("The battle begins.");
        Game.promptEnterKey();
        Game.clearConsole();
        Game.battle(new Boss(100, 100, "DeathEater", 50, 20, 0), wizard);
        System.out.println("You bravely use the powerful Sectumsempra spell, causing deep wounds to your enemies.");
        System.out.println("With quick reflexes and strategic thinking, you defeat the Death Eaters and progress to the final level.");
        Game.promptEnterKey();
        System.out.println();
        Game.printMenu();
    }
}