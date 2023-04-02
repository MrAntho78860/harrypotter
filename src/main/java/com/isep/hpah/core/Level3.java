package com.isep.hpah.core;
import static com.isep.hpah.core.Story.wizard;
public class Level3 {
    static Wizard wizard;

    public static void Level3() {
        wizard = new Wizard(Game.name, 200, 200);
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
        Game.printSeperator(1);
        System.out.println("One year later");
        Game.printSeperator(1);
        Game.delay(1500);
        Spell Patronum = new Spell(100,  10, "Expecto Patronum",  10,  "defense");
        Game.textDelay("You acquire your initial incantation, " + Spell.getName(Patronum) + " in the lecture hall.");
        Game.textDelay("It' s stats are as follow:    " + Spell.getDamage(Patronum)+ "  dmg        " + Spell.getAccuracy(Patronum)+ "  Acc        " + Spell.getResistance(Patronum)+ "  Res      " + Spell.getType(Patronum)+ "  Type" );
        Game.promptEnterKey();
        Game.printSeperator(1);
        Game.battle(new AbstractEnemy("Aragog", 70, 70, 25, 50, 15), wizard);
        if(wizard.lifePoint <= 0){
            System.out.println("Game over. The wizard has been defeated by the enemy.");
            return;
        }
        Game.textDelay("AMAZING! That was a close call! You are fortunate to be alive!");
        Game.promptEnterKey();
        Game.printMenu();
        Game.promptEnterKey();
        Game.printSeperator(1);
        Game.battle(new AbstractEnemy("Cerberus", 50, 50, 25, 50, 15), wizard);
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
        System.out.println("You now face the formidable 'Dementors', ready to engage in battle within the murky waters of the Forbidden Forest lake.");
        System.out.println("The fight is about to begin.");
        Game.promptEnterKey();
        Game.clearConsole();
        Game.battle(new Boss(100, 100,"Dementor", 100 , 200 , 0), wizard);
        if(wizard.lifePoint <= 0){
            System.out.println("Game over. System.out.println(\"You attempt to cast 'SpellName', but the power of the 'Dementors' overwhelms you, and you are unable to repel their darkness.\");\n" +
                    "System.out.println(\"Your soul is consumed, and you are left stranded in the abyss of your worst memories.\");\n" +
                    "System.out.println(\"Your quest has come to a devastating end.\");");
            return;
        }
        System.out.println("You unleash the power of 'Expecto Patronum', casting a powerful charm that sends the 'Dementors' fleeing in terror.");
        System.out.println("The battle is won, and you stand victorious in the face of darkness.");
        Game.promptEnterKey();
        System.out.println();
        Game.printMenu();
    }
}
