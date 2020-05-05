package com.campusnum.menu;

import com.campusnum.Menu;
import java.util.Scanner;

public class StartMenu extends Menu {

    @Override
    protected String[] getOptions() {
        return new String[]{"Bienvenue!", "p -> Créer un personnage"};
    }

    @Override
    protected void setUserChoice(String choice) {
        if (choice.equals("p")) {
            Menu createPerson = new CreatePersonMenu();
            createPerson.displayMenu();
        } else if (choice.equals("q")) {
            System.out.println("A bientôt!");
        } else {
            System.out.println("Veuillez saisir une option valide");
        }
    }
}
