package com.campusnum.character;

import com.campusnum.ShieldList;
import com.campusnum.attack.*;

import java.util.Random;

public class Warrior extends Character {

    static {
        minLife = 5;
        maxLife = 10;
        minAttack = 5;
        maxAttack = 10;
    }

    /**
     * Pick a random shield name from ShieldList enum
     */
    private ShieldList shield = ShieldList.values()[new Random().nextInt(ShieldList.values().length)];

    /**
     * An object Warrior has an object from class Weapon as an attribute
     */
    private Weapon weapon = new Weapon();


    public Warrior() {
        super("Guerrier");
        System.out.println(this);
    }

    public Warrior(String name) {
        super(name);
        System.out.println(this);
    }

    public Warrior(String name, String image, int life, int power) {
        super(name, image, life, power);
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "\t\t\t** Guerrier ** \n" +
                "\n\t\t\t\t\t * Nom -> " + name +
                "\n\t\t\t\t\t * Vie -> " + life +
                "\n\t\t\t\t\t * Force d'attaque -> " + power +
                "\n\t\t\t\t\t * Arme -> " + weapon.getName() +
                "\n\t\t\t\t\t * Bouclier -> " + shield +
                "\n\t\t\t\t\t * Image -> " + image +
                "\n";
    }


    public ShieldList getShield() {
        return shield;
    }

    public void setShield(ShieldList shield) {
        this.shield = shield;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }


}