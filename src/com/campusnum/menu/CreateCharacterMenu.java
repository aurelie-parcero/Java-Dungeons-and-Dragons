package com.campusnum.menu;

import com.campusnum.character.Warrior;
import com.campusnum.character.Wizard;
import com.campusnum.character.Character;

public class CreateCharacterMenu extends CharacterMenu {

    private Character currentCharacter;

    public Character getCurrentCharacter() {
        return currentCharacter;
    }

    @Override
    protected String[] getOptions() {
        return new String[]{" --> Choisissez un personnage:", " < M > --> MAGICIEN", " < G > --> GUERRIER"};
    }

    @Override
    protected void setUserChoice(String choice) {
        switch (choice) {
            case "m" -> {
                currentCharacter = createWizard();
            }
            case "g" -> {
                currentCharacter = createWarrior();
            }
            case "q" -> {
                quitGame();
            }
            default -> {
                wrongOption();
            }
        }
    }

    private Character createWarrior() {
        System.out.println(" --> Veuillez nommer votre Guerrier");
        System.out.println("Nom:");
        String warriorName = sc.nextLine();
        return new Warrior(warriorName);
    }

    private Character createWizard() {
        System.out.println(" --> Veuillez nommer votre Magicien");
        System.out.println("Nom:");
        String wizardName = sc.nextLine();
        return new Wizard(wizardName);
    }
}
