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





        Game.clearConsole();
        System.out.println(" _      ________      ________ _        __ ");
        System.out.println("| |    |  ____\\ \\    / /  ____| |      /_ |");
        System.out.println("| |    | |__   \\ \\  / /| |__  | |       | |");
        System.out.println("| |    |  __|   \\ \\/ / |  __| | |       | |");
        System.out.println("| |____| |____   \\  /  | |____| |____   | |");
        System.out.println("|______|______|   \\/   |______|______|  |_|");
        Game.promptEnterKey();
        Game.battle(new AbstractEnemy("Snake",40,40,60,10,0), wizard );
        Game.textDelay("AMAZING! That was a close call! You are fortunate to be alive!");
        Game.promptEnterKey();
        Game.printMenu();
        Game.promptEnterKey();
        Game.printSeperator(1);


        Game.battle(new AbstractEnemy("Acromantula", 60,60 , 60, 15, 0), wizard );
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
        Game.battle(new AbstractEnemy("Troll", 5,5, 50 , 0 , 0), wizard );
        Game.boss += 1;
        System.out.println("After a grueling battle, you emerge victorious over the mighty 'Troll', its massive form lying motionless on the cold stone floor of the 'Dungeon Bathrooms'.");
        System.out.println("As you catch your breath and take in your surroundings, you notice a small glimmer in the corner of the room. You cautiously approach and discover a treasure chest, its contents glinting in the dim light.");
        System.out.println("With a sense of satisfaction, you open the chest and claim your reward for defeating the Level 1 Boss.");
        System.out.println("You know that your journey has only just begun, but with your skill and bravery tested and proven, you are ready to face whatever challenges lie ahead.");
        Game.promptEnterKey();
        System.out.println();
        Game.printMenu();







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
        Game.textDelay("You acquire your initial incantation, " + Spell.getName(Accio) + " in the lecture hall.");
        Game.textDelay("It' s stats are as follow:    " + Spell.getDamage(Accio)+ "  dmg        " + Spell.getAccuracy(Accio)+ "  Acc        " + Spell.getResistance(Accio)+ "  Res      " + Spell.getType(Accio)+ "  Type" );
        Game.promptEnterKey();
        Game.battle(new AbstractEnemy("Cerberus", 50, 50, 25, 50, 15), wizard);
        Game.textDelay("AMAZING! That was a close call! You are fortunate to be alive!");
        Game.promptEnterKey();
        Game.printMenu();
        Game.promptEnterKey();
        Game.printSeperator(1);
        Game.battle(new AbstractEnemy("Snake",40,40,60,10,0), wizard );
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

        Game.battle(new AbstractEnemy("Basilisk", 100, 100, 50 , 20 , 0) ,wizard);
        Game.printMenu();






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
        Spell Sectumsempra = new Spell(100,  10, "Sectumsempra",  10,  "defense");
        Game.textDelay("You acquire your initial incantation, " + Spell.getName(Sectumsempra) + " in the lecture hall.");
        Game.textDelay("It' s stats are as follow:    " + Spell.getDamage(Sectumsempra)+ "  dmg        " + Spell.getAccuracy(Sectumsempra)+ "  Acc        " + Spell.getResistance(Sectumsempra)+ "  Res      " + Spell.getType(Sectumsempra)+ "  Type" );
        Game.promptEnterKey();
        Game.battle(new AbstractEnemy("Dementor", 100, 100, 50 , 20 , 0) ,wizard);
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
        Game.battle(new Boss(100, 100,"Dolores Umbridge", 50 , 20 , 0), wizard);
        System.out.println("With a burst of spells, Dolores Umbridge was defeated.");
        System.out.println("The wizard used every trick in their arsenal, from stunning spells to disarming charms, until Umbridge was left disarmed and disoriented.");
        System.out.println("The students in the room erupted in cheers, and the wizard cast a few more spells to set off fireworks, lighting up the room with a colorful celebration.");
        Game.promptEnterKey();
        System.out.println();
        Game.printMenu();





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
        Spell Expelliarmus = new Spell(100,  10, "Expelliarmus",  10,  "defense");
        Game.textDelay("You acquire your initial incantation, " + Spell.getName(Expelliarmus) + " in the lecture hall.");
        Game.textDelay("It' s stats are as follow:    " + Spell.getDamage(Expelliarmus)+ "  dmg        " + Spell.getAccuracy(Expelliarmus)+ "  Acc        " + Spell.getResistance(Expelliarmus)+ "  Res      " + Spell.getType(Expelliarmus)+ "  Type" );
        Game.promptEnterKey();
        Game.battle(new AbstractEnemy("Werewolf", 100, 100, 50 , 20 , 0) ,wizard);
        Game.textDelay("AMAZING! That was a close call! You are fortunate to be alive!");
        Game.promptEnterKey();
        Game.printMenu();
        Game.promptEnterKey();
        Game.printSeperator(1);
        Game.battle(new AbstractEnemy("Thestral", 100, 100, 50 , 20 , 0) ,wizard);
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
        Game.battle(new Boss(100, 100,"DeathEater", 50 , 20 , 0), wizard);
        System.out.println("You bravely use the powerful Sectumsempra spell, causing deep wounds to your enemies.");
        System.out.println("With quick reflexes and strategic thinking, you defeat the Death Eaters and progress to the final level.");
        Game.promptEnterKey();
        System.out.println();
        Game.printMenu();











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
        Spell AvadaKedavra = new Spell(100,  10, "Avada Kedavra",  10,  "defense");
        Game.textDelay("You acquire your initial incantation, " + Spell.getName(AvadaKedavra) + " in the lecture hall.");
        Game.textDelay("It' s stats are as follow:    " + Spell.getDamage(AvadaKedavra)+ "  dmg        " + Spell.getAccuracy(AvadaKedavra)+ "  Acc        " + Spell.getResistance(AvadaKedavra)+ "  Res      " + Spell.getType(AvadaKedavra)+ "  Type" );
        Game.promptEnterKey();
        Game.printSeperator(1);
        Game.battle(new AbstractEnemy("Nagini", 100, 100, 50 , 20 , 0) ,wizard);
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
        Game.battle(new Boss(100, 100,"Voldemort & Bellatrix", 50 , 20 , 0), wizard);
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




