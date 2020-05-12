package com.campusnum.menu;

import com.campusnum.character.Character;

import java.util.ArrayList;

public class CharacterMenu extends Menu {
    protected ArrayList<Character> characterArray = new ArrayList<>();

    @Override
    protected String[] getOptions() {
        return new String[]{" --> Que voulez-vous faire?",
                " < C > --> CREER NOUVEAU PERSONNAGE",
                " < A > --> AFFICHER PERSONNAGES",
                " < M > --> MODIFIER PERSONNAGES",
                " < R > --> RETOUR"
                };
    }

    @Override
    protected void setUserChoice(String choice) {
        switch (choice) {
            case "a" -> {
                if (characterArray.isEmpty()) {
                    System.out.println(" ** Vous n'avez pas encore créé de personnage ** ");
                } else {
                    this.displayCharacterArray();
                }

            }
            case "m" -> {
                if (characterArray.isEmpty()) {
                    System.out.println(" ** Vous n'avez pas encore créé de personnage ** ");
                } else {
                    System.out.println(" --> Quel personnage souhaitez-vous modifier?");
                    this.displayCharacterArray();
                    int character = (sc.nextInt() - 1);
                    if (character >= 0 && character < characterArray.size()) {
                        ModifyCharacterMenu modif = new ModifyCharacterMenu(characterArray.get(character));
                        modif.displayMenu();
                        Character modifiedCharacter = modif.getToModify();
                        characterArray.set(character, modifiedCharacter);
                    } else {
                        wrongOption();
                    }
                }
            }
            case "c" -> {
                CreateCharacterMenu create = new CreateCharacterMenu();

                do {
                    create.displayMenu();
                    addToCharacterList(create.getCurrentCharacter());
                    System.out.println(" --> Voulez-vous créer un autre personnage?");
                    System.out.println(" < O > --> OUI");
                    System.out.println(" < N > --> NON");
                }
                while (sc.nextLine().equals("o"));

            }
            case "q" -> {
                quitGame();
            }
            case "r" -> {

            }
            default -> {
                wrongOption();
            }
        }
        //this.displayMenu();
    }

    public void addToCharacterList(Character character) {
        characterArray.add(character);
    }

    public void displayCharacterArray() {
        System.out.println(" \t\t\t\t\t --> Vos personnages <--");
        for (int i = 0; i < characterArray.size(); i++) {
            System.out.println("[" + (i + 1) + "] -->    --*--*--*--*--*--*--*--*--*--*--*--*--*--*");
            System.out.println(characterArray.get(i));
        }
    }
}