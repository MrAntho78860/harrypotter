package com.isep.hpah.core;
import static com.isep.hpah.core.Story.wizard;
public class Level2 {

    static Wizard wizard;

    public static void Level2() {

        wizard =new

        Wizard(Game.name, 200,200);
    Game.clearConsole();
        System.out.println(" _      ________      ________ _        ___  ");
        System.out.println("| |    |  ____\\ \\    / /  ____| |      |__ \\ ");
        System.out.println("| |    | |__   \\ \\  / /| |__  | |         ) |");
        System.out.println("| |    |  __|   \\ \\/ / |  __| | |        / / ");
        System.out.println("| |____| |____   \\  /  | |____| |____   / /_ ");
        System.out.println("|______|______|   \\/   |______|______| |____|");
        Game.promptEnterKey();
        Game.skiplines();
        Game.promptEnterKey();
        Spell Accio = new Spell(50, 50, "Accio", 0, "attack");
        Game.textDelay("You acquire your initial incantation, "+Spell.getName(Accio)+" in the lecture hall.");
        Game.textDelay("It' s stats are as follow:    "+Spell.getDamage(Accio)+"  dmg        "+Spell.getAccuracy(Accio)+"  Acc        "+Spell.getResistance(Accio)+"  Res      "+Spell.getType(Accio)+"  Type");
        Game.promptEnterKey();
        Game.battle(new

        AbstractEnemy("Cerberus",50,50,25,50,15),wizard);
        Game.textDelay("AMAZING! That was a close call! You are fortunate to be alive!");
        Game.promptEnterKey();
        Game.printMenu();
        Game.promptEnterKey();
        Game.printSeperator(1);
        Game.battle(new

        AbstractEnemy("Snake",40,40,60,10,0),wizard );
        Game.textDelay("AMAZING! That was a close call! You are fortunate to be alive!");
        Game.promptEnterKey();
        Game.printMenu();
        Game.promptEnterKey();
        Game.printSeperator(1);
        System.out.println("You cautiously make your way through the dark and musty corridors of Hogwarts, your heart racing with anticipation and fear.");
        System.out.println("Your quest has led you to the infamous 'Chamber of Secrets', where an ancient and deadly creature lies in wait.");
        System.out.println("You can hear the sound of its slithering body moving through the shadows, and you grip your wand tightly, preparing for the fight of your life.");
        System.out.println("As you enter the chamber, you catch a glimpse of the creature's glowing eyes and razor-sharp fangs, and you know that this will be a battle like no other.");
        System.out.println("With your courage and magic as your only weapons, you step forward to face the fearsome 'Basilisk', determined to emerge victorious and save the school from its deadly grasp.");
        Game.promptEnterKey();

        Game.battle(new

        AbstractEnemy("Basilisk",100,100,50,20,0) ,wizard);
        Game.printMenu();
    }
}
