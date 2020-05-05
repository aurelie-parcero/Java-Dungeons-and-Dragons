package com.campusnum.personnage;

import com.campusnum.Personnage;

public class Magicien extends Personnage {

    private String philtre;

    public Magicien() {

        System.out.println("Magicien créé!");
    }

    public Magicien(String nom) {
        this.nom = nom;
        System.out.println("Magicien créé!");
    }

    public Magicien(String nom, String image, int vie, int force) {
        this.nom = nom;
        this.image = image;
        this.vie = vie;
        this.force = force;
        System.out.println("Magicien créé!");
    }


    public String getPhiltre() {

        return philtre;
    }

    public void setPhiltre(String philtre) {

        this.philtre = philtre;
    }

    @Override
    public String toString() {
        return "Magicien{" +
                "philtre='" + philtre + '\'' +
                ", nom='" + nom + '\'' +
                ", vie=" + vie +
                ", image='" + image + '\'' +
                ", force=" + force +
                '}';
    }
}
