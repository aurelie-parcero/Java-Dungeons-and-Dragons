package com.campusnum.personnage;
import com.campusnum.Personnage;
import com.campusnum.attaque.Arme;

public class Guerrier extends Personnage {


    public String bouclier;

    public Guerrier() {

        System.out.println("Guerrier créé!");
    }

    public Guerrier(String nom) {
        this.nom = nom;
        System.out.println("Guerrier créé!");
    }

    public Guerrier(String nom, String image, int vie, int force) {
        this.nom = nom;
        this.image = image;
        this.vie = vie;
        this.force = force;
        System.out.println("Guerrier créé!");
    }

    public String getBouclier() {
        return bouclier;
    }

    public void setBouclier(String bouclier) {
        this.bouclier = bouclier;
    }

    @Override
    public String toString() {
        return "Guerrier{" +
                "bouclier='" + bouclier + '\'' +
                "nom='" + nom + '\'' +
                ", vie=" + vie +
                ", image='" + image + '\'' +
                ", force=" + force +
                '}';
    }
}
