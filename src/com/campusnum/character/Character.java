package com.campusnum.character;

import com.campusnum.PotionList;
import com.campusnum.attack.Attack;

abstract public class Character {

    protected String name, image;
    protected int life, power;

    /**
     * Each category of Character has boundries when set life and power points
     */
    protected static int minLife, maxLife, minAttack, maxAttack;

    public Character(String name) {
        this.life = generateRandom(minLife, maxLife);
        this.power = generateRandom(minAttack, maxAttack);
        this.name = name;
        this.image = "image";
        System.out.println(this.getClass().getSimpleName() + " created!");
    }

    public Character(String name, String image, int life, int power) {
        this.life = life;
        this.power = power;
        this.name = name;
        this.image = image;
        System.out.println(this.getClass().getSimpleName() + " created!");
    }

    /**
     *
     * @param min is a static attribute from a child class of Character
     * @param max is a static attribute from a child class of Character
     * @return a random integer to set life or power
     */
    protected int generateRandom(int min, int max) {
        return min + (int) (Math.random() * (max - min));
    }


    public int getMinLife() {
        return minLife;
    }
    public int getMaxLife() {
        return maxLife;
    }

    public int getMinAttack() {
        return minAttack;
    }

    public int getMaxAttack() {
        return maxAttack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    /**
     *
     * @param life must
     * @throws Exception
     */
    public void setLife(int life) throws Exception {
        if(life < minLife || life > maxLife) {
            throw new Exception("Veuillez entrer un nombre valide");
        } else {
            this.life = life;
        }
    }
    public void setPower(int power) throws Exception {
        if(power < minAttack || power > maxAttack) {
            throw new Exception("Veuillez entrer un nombre valide");
        }
        this.power = power;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getPower() {
        return power;
    }

}