package com.campusnum.attack;

import java.util.Random;

public class Weapon extends Attack {

    private WeaponList name;

    /***
     * Pick a random Weapon name from WeaponList enum
     */
    public Weapon() {
        this.name = WeaponList.values()[new Random().nextInt(WeaponList.values().length)];
//        this.power = power;
    }

    public Weapon (WeaponList name) {
        this.name = name;
    }


    public WeaponList getName() {
        return name;
    }

    public void setName(WeaponList name) {
        this.name = name;
    }

}
