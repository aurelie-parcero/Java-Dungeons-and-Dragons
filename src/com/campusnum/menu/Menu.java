package com.campusnum.menu;

import java.util.Scanner;

abstract public class Menu {
    Scanner sc = new Scanner(System.in);

    abstract protected String[] getOptions();


    /**
     * display player options, get player choice and set
     */
    public void displayMenu() {
        System.out.println(" < Q > --> QUITTER LE JEU");
            for (String options : getOptions()) {
                System.out.println(options);
            }
            String userChoice = getUserChoice();
            this.setUserChoice(userChoice);
    }
    protected String getUserChoice() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    abstract protected void setUserChoice(String choice);

    /**
     * close scanner if player wants to quit the game
     */
    protected void quitGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" --> Voulez-vous vraiment quitter?");
        System.out.println(" < O > --> OUI");
        System.out.println(" < N > --> NON");
        if(sc.nextLine().equals("o")) {
            System.out.println(" --> A bientôt!");
            sc.close();
        } else {
            this.displayMenu();
        }
    }

    /**
     * if player's choice is not valid, display the menu again
     */
    protected void wrongOption() {
        System.out.println(" --> Veuillez saisir une option valide");
        this.displayMenu();
    }
}