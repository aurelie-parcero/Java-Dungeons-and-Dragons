package com.campusnum.attack;

import java.util.Random;

public class Spell extends Attack {

    private SpellList name;
    //private int power;

    /**
     * Pick a random spell name from SpellList enim
     */
    public Spell() {
        this.name = SpellList.values()[new Random().nextInt(SpellList.values().length)];
//        this.power = power;
    }

    public Spell(SpellList name) {
        this.name = name;
    }

    public SpellList getName() {
        return name;
    }

    public void setName(SpellList name) {
        this.name = name;
    }

}
