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
        wizard = new Wizard(Game.name, 20, 20);

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
        Game.clearConsole();
        Game.printHeading("Later that week");
        Game.delay(1000);
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
        Game.delay(1);
        Game.printSeperator(1);
        Game.textDelay("You acquire your initial incantation, " + Spell.getName(WingardiumLeviosa) + " in the lecture hall.");
        Game.textDelay("It' s stats are as follow:    " + Spell.getDamage(WingardiumLeviosa)+ "  dmg        " + Spell.getAccuracy(WingardiumLeviosa)+ "  acc        " + Spell.getResistance(WingardiumLeviosa)+ "  res      " + Spell.getType(WingardiumLeviosa)+ "  Type" );
        Game.printSeperator(1);
        Game.textDelay("As you traverse the castle, you observe... ");
        Game.printSeperator(1);
        Game.promptEnterKey();



        Level1.Level1();
        if(wizard.lifePoint <= 0){
            return;
        }
        Level2.Level2();
        if(wizard.lifePoint <= 0){
            return;
        }
        Level3.Level3();
        if(wizard.lifePoint <= 0){
            return;
        }
        Level4.Level4();
        if(wizard.lifePoint <= 0){
            return;
        }
        Level5.Level5();
        if(wizard.lifePoint <= 0){
            return;
        }
        Level6.Level6();
        if(wizard.lifePoint <= 0){
            return;
        }
        Level2.Level2();
        if(wizard.lifePoint <= 0){
            return;
        }Level7.Level7();
        if(wizard.lifePoint <= 0){
            return;
        }


    }
}




