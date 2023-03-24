package com.isep.hpah.core;




package com.isep.hpah.core;
        import java.util.Random;

public class Pets {
    private String nom;
    Pets com.isep.hpah.core(String nom) {
        this.nom = nom;
    }
    private static final Random PRNG = new Random();
    public static Pets randomPet() {
        Pets[] pets = { new Pet("Cat"), new Pet("Owl"), new Pet("Rat"), new Pet("Toad") };
        return pets[PRNG.nextInt(pets.length)];
    }
}
