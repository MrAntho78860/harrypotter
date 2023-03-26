package com.isep.hpah.core;



public enum Pet {
    OWL("Owl"),
    RAT("Rat"),

    CAT("Cat"),

    TOAD("Toad");

    private String nom;
    Pet(String nom) {
        this.nom = nom;
    }
}
