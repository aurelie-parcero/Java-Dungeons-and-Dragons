package com.campusnum.menu;
import com.campusnum.Menu;
import com.campusnum.Personnage;
import com.campusnum.personnage.*;

public class CreatePersonMenu extends Menu {

    @Override
    protected String[] getOptions() {
        return new String[]{"Choisissez un personnage:", "m -> Magicien", "g -> Guerrier"};
    }

    @Override
    protected void setUserChoice(String choice) {
        switch (choice) {
            case "g" -> {
                Personnage guerrier = new Guerrier();
            }
            case "m" -> {
                Personnage magicien = new Magicien();
            }
            case "q" -> System.out.println("A bientôt");
            default -> System.out.println("Veuillez saisir une option valide");
        }
    }

}

