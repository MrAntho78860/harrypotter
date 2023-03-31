package com.isep.hpah.core;



public class Story {

    static Wand wand;
    static Sorting_Hat sortingHat;
    static Wizard wizard;
    static Spell spell;



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
                " A game created and designed by Anthony Amar");Game.promptEnterKey();
        Game.clearConsole();
        System.out.println("               _____");
        System.out.println("              /     \\");
        System.out.println("            /- (*) |*)\\");
        System.out.println("            |/\\.  _>/\\|");
        System.out.println("                \\__/    |\\");
        System.out.println("               _| |_   \\-/");
        System.out.println("              /|\\__|\\  //");
        System.out.println("             |/|   |\\\\//");
        System.out.println("             |||   | ~'");
        System.out.println("             ||| __|");
        System.out.println("             /_\\| ||");
        System.out.println("             \\_/| ||");
        System.out.println("               |7 |7");
        System.out.println("               || ||");
        System.out.println("               || ||");
        System.out.println("               /\\ \\ \\");
        System.out.println("              ^^^^ ^^^");

        Potion.rndPotion();
        Potion.rndPotion();
        Potion.rndPotion();
        Potion.rndPotion();
        Potion.rndPotion();

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
        wizard = new Wizard(Game.name, 200, 200);

        Game.promptEnterKey();
        Game.clearConsole();
        System.out.println("\t\t           ,---.");
        System.out.println("\t\t          /    |");
        System.out.println("\t\t         /     |");
        System.out.println("\t\t        /      |");
        System.out.println("\t\t       /       |");
        System.out.println("\t\t     ,'        |");
        System.out.println("\t\t  ,-'          :");
        System.out.println("\t\t `-.__..--'``-,_\\_");

        Sorting_Hat.ChooseHouse();

        Game.petinialise();
        System.out.println("Delighted to make your acquaintance! Please follow me, as we proceed to select your wand.");
        Game.promptEnterKey();
        Game.clearConsole();
        System.out.println("                  .");
        System.out.println("                   .");
        System.out.println("         /^\\     .");
        System.out.println("    /\\   \"V\"");
        System.out.println("   /__\\   I      O  o");
        System.out.println("  //..\\\\  I     .");
        System.out.println("  \\].`[/  I");
        System.out.println("  /l\\/j\\  (]    .  O");
        System.out.println(" /. ~~ ,\\/I          .");
        System.out.println(" \\\\L__j^\\/I       o   ");
        System.out.println("  \\/--v}  I     o   .");
        System.out.println("  |    |  I   _________");
        System.out.println("  |    |  I c(`       ')o");
        System.out.println("  |    l  I   \\.     ,/");
        System.out.println("_/j  L l\\_!  _//^---^\\\\_ ");


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
        Game.textDelay("Welcome to the communal area and living quarters of the " + Sorting_Hat.getHouse() + " house.");
        Game.textDelay("The senior students are already here, discussing the recent increase in attacks by mystical creatures.");
        Game.textDelay("These attacks can happen at any time and anywhere.");
        Game.textDelay("It is advisable to be cautious and vigilant for any signs of danger.");
        Game.promptEnterKey();

        Game.printHeading("Later that week");
        Spell WingardiumLeviosa = new Spell(100, 10,"Wingardium Leviosa", 0 , "attack");

        System.out.println("\t\t                          ,---.");
        System.out.println("\t\t                         /   |");
        System.out.println("\t\t                        /    |");
        System.out.println("\t\t                       /     |");
        System.out.println("\t\t                      /      |");
        System.out.println("\t\t                     /       |");
        System.out.println("\t\t                ___,'        |");
        System.out.println("\t\t              <  -'          :");
        System.out.println("\t\t               `-.__..--'``-,_\\_");
        System.out.println("\t\t                  |o/ ` :,.)_`>");
        System.out.println("\t\t                  :/ `     ||/)");
        System.out.println("\t\t                  (_.).__,-` |\\");
        System.out.println("\t\t                  /( `.``   `| :");
        System.out.println("\t\t                  \\'`-.)  `  ; ;");
        System.out.println("\t\t                  | `       /-<");
        System.out.println("\t\t                  |     `  /   `.");
        System.out.println("\t\t  ,-_-..____     /|  `    :__..-'\\");
        System.out.println("\t\t /,'-.__\\\\  ``-./ :`      ;       \\");
        System.out.println("\t\t `\\ `\\  `\\\\  \\ :  (   `  /  ,   `. \\");
        System.out.println("\t\t   `\\ `\\_  ))  :  ;     |  |      ): :");
        System.out.println("\t\t   (`-.-'\\ ||  |\\ \\   ` ;  ;       | |");
        System.out.println("\t\t    \\-_   `;;._   ( `  /  /_       | |");
        System.out.println("\t\t     `-.-.// ,'`-._\\__/_,'         ; |");
        System.out.println("\t\t        \\:: :     /     `     ,   /  |");
        System.out.println("\t\t         || |    (        ,' /   /   |");
        System.out.println("\t\t         ||                ,'   /    |");

        Game.textDelay("You acquire your initial incantation, " + Spell.getName(WingardiumLeviosa) + " in the lecture hall.");
        Game.textDelay("It' s stats are as follow:    " + Spell.getDamage(WingardiumLeviosa)+ "  dmg        " + Spell.getAccuracy(WingardiumLeviosa)+ "  Acc        " + Spell.getResistance(WingardiumLeviosa)+ "  Res      " + Spell.getType(WingardiumLeviosa)+ "  Type" );
        Game.textDelay("As you traverse the castle, you observe... ");
        Game.battle(new AbstractEnemy("Snake",40,40,60,10,0), wizard );
        Game.printMenu();
        Game.promptEnterKey();
        Game.textDelay("AMAZING! That was a close call! You are fortunate to be alive!");
        Game.printSeperator(1);


        Game.battle(new AbstractEnemy("Acromantula", 60,60 , 60, 15, 0), wizard );
        Game.printMenu();
        Game.skiplines();
        System.out.println("As you emerge victorious from your battle against the fearsome 'Snake' and the deadly 'Acromantula', your quest leads you deeper into the dark and foreboding dungeons.");
        System.out.println("Suddenly, you hear a loud thud echoing from the end of the corridor, and you instinctively take cover behind a nearby pillar.");
        System.out.println("As you pick around the corner, you catch a glimpse of the massive 'Troll' lumbering towards you. You steel yourself for the fight of your life as you enter the 'Dungeon Bathrooms'.");
        System.out.println("Ready to face the Level 1 Boss and prove your worth as a true hero.");
        Game.promptEnterKey();
        Game.battle(new AbstractEnemy("Troll", 5,5, 50 , 0 , 0), wizard );
        Game.boss += 1;
        Game.printMenu();
        Game.skiplines();
        Game.promptEnterKey();
        Spell Accio = new Spell(50, 50, "Accio", 0, "attack");
        Game.textDelay("You acquire your initial incantation, " + Spell.getName(Accio) + " in the lecture hall.");
        Game.textDelay("It' s stats are as follow:    " + Spell.getDamage(Accio)+ "  dmg        " + Spell.getAccuracy(Accio)+ "  Acc        " + Spell.getResistance(Accio)+ "  Res      " + Spell.getType(Accio)+ "  Type" );
        Game.promptEnterKey();
        Game.battle(new AbstractEnemy("Cerberus", 50, 50, 25, 50, 15), wizard);
        //Game.textDelay("the deceased " + Game.enemyNames[AbstractEnemy.enemy] + " is lying on the ground in front of you.");
        Game.battle(new AbstractEnemy("Snake",40,40,60,10,0), wizard );
        Game.printMenu();
        Game.promptEnterKey();
        Game.battle(new AbstractEnemy("Basilisk", 100, 100, 50 , 20 , 0) ,wizard);
        Game.printMenu();
        Game.battle(new AbstractEnemy("Aragog", 70,70 , 20, 30, 10), wizard );
        Game.printMenu();
    }
}




