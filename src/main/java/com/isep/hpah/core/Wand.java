package com.isep.hpah.core;


import java.util.Random;


public class Wand {
    static int size;
    static Core core;




    public void wand() {
        Random random = new Random();
        core = Core.values()[random.nextInt(Core.values().length)];
        size = random.nextInt(15) + 22;
        System.out.println("Your wand measures " + size + "cm and is made of " + core.getName() + " core."+" It is often said that a wand chooses its wielder!");

    }

    public static Core getCore() {
        return core;
    }
}
