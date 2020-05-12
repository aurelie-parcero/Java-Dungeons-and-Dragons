package com.campusnum.character;

import com.campusnum.PotionList;
import com.campusnum.attack.*;

import java.util.Random;

public class Wizard extends Character {

    static {
        minLife = 3;
        maxLife = 6;
        minAttack = 8;
        maxAttack = 15;
    }

    /**
     * Pick a random potion name from PotionList enum
     */
    private PotionList potion = PotionList.values()[new Random().nextInt(PotionList.values().length)];

    /**
     * An object Wizard has an object from class Potion as an attribute
     */
    private Spell spell = new Spell();


    public Wizard() {
        super("Magicien");
        System.out.println(this);
    }


    public Wizard(String name) {
        super(name);
        System.out.println(this);
    }

    public Wizard(String name, String image, int life, int power) {
        super(name, image, life, power);
        System.out.println("Magicien créé!");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "\t\t\t** Magicien ** \n" +
                "\n\t\t\t\t\t * Nom -> " + name +
                "\n\t\t\t\t\t * Vie -> " + life +
                "\n\t\t\t\t\t * Force d'attaque -> " + power +
                "\n\t\t\t\t\t * Sort -> " + spell.getName() +
                "\n\t\t\t\t\t * Philtre -> " + potion +
                "\n\t\t\t\t\t * Image -> " + image +
                "\n";
    }

    public PotionList getPotion() {
        return potion;
    }

    public void setPotion(PotionList potion) {
        this.potion = potion;
    }

    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }


}
