package com.isep.hpah.core;


import static com.isep.hpah.core.Story.wizard;
public class Level1 {





    public static void Level1() {
        wizard = new Wizard(Game.name, 200, 200);
        Game.clearConsole();
        System.out.println(" _      ________      ________ _        __ ");
        System.out.println("| |    |  ____\\ \\    / /  ____| |      /_ |");
        System.out.println("| |    | |__   \\ \\  / /| |__  | |       | |");
        System.out.println("| |    |  __|   \\ \\/ / |  __| | |       | |");
        System.out.println("| |____| |____   \\  /  | |____| |____   | |");
        System.out.println("|______|______|   \\/   |______|______|  |_|");
        Game.promptEnterKey();
        Game.battle(new AbstractEnemy("Snake", 40, 40, 60, 0, 0), wizard);
        if(wizard.lifePoint <= 0){
            System.out.println("Game over. The wizard has been defeated by the enemy.");
            return;
        }
        Game.textDelay("AMAZING! That was a close call! You are fortunate to be alive!");
        Potion tempPotion = Potion.rndPotion();
        Potion.potionsAdd(tempPotion, wizard);
        //System.out.println(tempPotion.getName());
        Game.promptEnterKey();
        Game.printMenu();
        Game.promptEnterKey();
        Game.printSeperator(1);
        Game.battle(new AbstractEnemy("Acromantula", 60, 60, 60, 15, 0), wizard);
        if(wizard.lifePoint <= 0){
            System.out.println("Game over. The wizard has been defeated by the enemy.");
            return;
        }
        Game.textDelay("AMAZING! That was a close call! You are fortunate to be alive!");
        Game.promptEnterKey();
        Game.printMenu();
        Game.promptEnterKey();
        Game.printSeperator(1);
        Game.skiplines();
        System.out.println("As you emerge victorious from your battle against the fearsome 'Snake' and the deadly 'Acromantula', your quest leads you deeper into the dark and foreboding dungeons.");
        System.out.println("Suddenly, you hear a loud thud echoing from the end of the corridor, and you instinctively take cover behind a nearby pillar.");
        System.out.println("As you pick around the corner, you catch a glimpse of the massive 'Troll' lumbering towards you. You steel yourself for the fight of your life as you enter the 'Dungeon Bathrooms'.");
        System.out.println("Ready to face the Level 1 Boss and prove your worth as a true hero.");
        Game.promptEnterKey();
        Game.clearConsole();
        System.out.println("With your wand at the ready, you begin to cast 'Wingardium Leviosa',");
        System.out.println("lifting nearby objects into the air and directing them towards the Troll's head.");
        Game.delay(1000);
        Game.promptEnterKey();
        Game.battle(new AbstractEnemy("Troll", 5, 5, 50, 0, 0), wizard);
        Game.boss += 1;
        System.out.println("After a grueling battle, you emerge victorious over the mighty 'Troll', its massive form lying motionless on the cold stone floor of the 'Dungeon Bathrooms'.");
        System.out.println("As you catch your breath and take in your surroundings, you notice a small glimmer in the corner of the room. You cautiously approach and discover a treasure chest, its contents glinting in the dim light.");
        System.out.println("With a sense of satisfaction, you open the chest and claim your reward for defeating the Level 1 Boss.");
        System.out.println("You know that your journey has only just begun, but with your skill and bravery tested and proven, you are ready to face whatever challenges lie ahead.");
        Game.promptEnterKey();
        System.out.println();
        Game.printMenu();
    }

}