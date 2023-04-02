package com.isep.hpah.core;
import static com.isep.hpah.core.Story.wizard;

public class Level7 {
    static Wizard wizard;

    public static void Level7() {
        wizard = new Wizard(Game.name, 200, 200);
        Game.clearConsole();
        System.out.println(" _      ________      ________ _        ______ ");
        System.out.println("| |    |  ____\\ \\    / /  ____| |      |____  |");
        System.out.println("| |    | |__   \\ \\  / /| |__  | |          / / ");
        System.out.println("| |    |  __|   \\ \\/ / |  __| | |         / /  ");
        System.out.println("| |____| |____   \\  /  | |____| |____    / /   ");
        System.out.println("|______|______|   \\/   |______|______|  /_/    ");
        Game.promptEnterKey();
        Game.skiplines();
        Game.promptEnterKey();
        Game.printSeperator(1);
        System.out.println("One year later");
        Game.printSeperator(1);
        Game.delay(1500);
        Spell AvadaKedavra = new Spell(100, 10, "Avada Kedavra", 10, "defense");
        Game.textDelay("You acquire your initial incantation, " + Spell.getName(AvadaKedavra) + " in the lecture hall.");
        Game.textDelay("It' s stats are as follow:    " + Spell.getDamage(AvadaKedavra) + "  dmg        " + Spell.getAccuracy(AvadaKedavra) + "  Acc        " + Spell.getResistance(AvadaKedavra) + "  Res      " + Spell.getType(AvadaKedavra) + "  Type");
        Game.promptEnterKey();
        Game.printSeperator(1);
        Game.battle(new AbstractEnemy("Nagini", 100, 100, 50, 20, 0), wizard);
        Game.textDelay("AMAZING! That was a close call! You are fortunate to be alive!");
        Game.promptEnterKey();
        Game.printMenu();
        Game.promptEnterKey();
        Game.printSeperator(1);
        Game.skiplines();
        System.out.println("The final battle against the ultimate evil has arrived.");
        System.out.println("The fate of the wizarding world rests on your shoulders as you stand face to face with the Dark Lord himself, Voldemort, and his most loyal follower, Bellatrix Lestrange.");
        System.out.println("The tension is palpable as you draw your wand and prepare to give it your all.");
        System.out.println("It's time to show them what a true wizard is made of.");
        System.out.println("Are you ready to face your destiny and save the wizarding world once and for all ?");
        Game.promptEnterKey();
        Game.clearConsole();
        Game.battle(new Boss(100, 100, "Voldemort & Bellatrix", 50, 20, 0), wizard);
        System.out.println("The wizard, armed with courage and determination, is about to face the two most formidable foes of the wizarding world.");
        System.out.println("They must act with caution and speed, for the slightest mistake can be fatal.");
        System.out.println("Spells come from all sides, but the wizard avoids them with ease.");
        System.out.println("They respond with a series of well-placed spells that incapacitate Bellatrix Lestrange and Voldemort.");
        System.out.println("The sorcerer managed to avoid the Avada Kedavra and defeat Hogwarts' two greatest enemies.");
        Game.promptEnterKey();
        Game.clearConsole();
        System.out.println("As the wizard stands victorious over the defeated forms of Bellatrix Lestrange and Voldemort, he feels a surge of triumph and relief.");
        System.out.println("He had faced his greatest challenge and emerged victorious, thanks to his courage, quick reflexes, and mastery of spells.");
        System.out.println("The wizard's name will forever be remembered as the hero who saved the wizarding world from the darkness of the Dark Lord.");
        Game.delay(3000);
        System.out.println("As he walks out of the ruins of Hogwarts, the wizard is greeted by cheers and applause from his fellow students and teachers.");
        System.out.println("He is hailed as a champion, a savior, and a true wizard in every sense of the word.");
        System.out.println("The wizard knows that his journey is far from over, but for now, he revels in the glory of his triumph and the knowledge that he has brought hope and light to a world once shrouded in darkness.");
        Game.promptEnterKey();
        Game.delay(5000);
        System.out.println(" _______  _    _  ______    ______  _   _  _____   ");
        System.out.println(" |__   __|| |  | ||  ____|  |  ____|| \\ | ||  __ \\  ");
        System.out.println("    | |   | |__| || |__     | |__   |  \\| || |  | | ");
        System.out.println("    | |   |  __  ||  __|    |  __|  | . ` || |  | | ");
        System.out.println("    | |   | |  | || |____   | |____ | |\\  || |__| | ");
        System.out.println("    |_|   |_|  |_||______|  |______||_| \\_||_____/  ");

    }
}