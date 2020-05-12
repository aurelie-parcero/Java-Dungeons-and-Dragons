package com.campusnum.menu;

import com.campusnum.PotionList;
import com.campusnum.ShieldList;
import com.campusnum.attack.Spell;
import com.campusnum.attack.SpellList;
import com.campusnum.attack.Weapon;
import com.campusnum.attack.WeaponList;
import com.campusnum.character.Character;
import com.campusnum.character.Warrior;
import com.campusnum.character.Wizard;

import java.util.ArrayList;

public class ModifyCharacterMenu extends CharacterMenu {

    private Character toModify;


    public ModifyCharacterMenu(Character toModify) {
        this.toModify = toModify;
    }

    public Character getToModify() {
        return toModify;
    }

    @Override
    protected String[] getOptions() {
        if (toModify.getClass().getSimpleName().equals("Warrior")) {
            return new String[]{
                    " --> Que voulez-vous modifier?",
                    " < N > --> NOM",
                    " < V > --> NIVEAU DE VIE",
                    " < F > --> FORCE D'ATTAQUE",
                    " < A > --> ARME",
                    " < B > --> BOUCLIER",
                    " < R > --> RETOUR AU MENU PRECEDENT"};
        } else {
            return new String[]{
                    " --> Que voulez-vous modifier?",
                    " < N > --> NOM",
                    " < V > --> NIVEAU DE VIE",
                    " < F > --> FORCE D'ATTAQUE",
                    " < S > --> SORT",
                    " < P > --> PHILTRE",
                    " < R > --> RETOUR AU MENU PRECEDENT"};
        }
    }

    @Override
    protected void setUserChoice(String choice) {
        switch (choice) {
            case "n" -> {
                System.out.println(toModify.getName() + " --> Entrez le nouveau nom");
                toModify.setName(sc.nextLine());
            }
            case "v" -> {
                modifyLife(toModify);
            }
            case "f" -> {
                modifyPower(toModify);
            }
            case "a" -> {
                modifyWeapon((Warrior) toModify);
            }
            case "s" -> {
                modifySpell((Wizard) toModify);
            }
            case "b" -> {
                ((Warrior) toModify).setShield(modifyShield());
            }
            case "p" -> {
                ((Wizard) toModify).setPotion(modifyPotion());
            }
            case "r" -> {

            }
            case "q" -> {
                quitGame();
            }
            default -> {
                wrongOption();
            }
        }
        System.out.println(" --> Modification(s) enregistrée(s)!");
    }

    private void modifyLife(Character character) {
        System.out.println("--> Entrez un niveau de vie entre " + character.getMinLife() + " et " + character.getMaxLife());
        try {
            character.setLife(sc.nextInt());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            modifyLife(this.toModify);
        }
    }

    private void modifyPower(Character character) {
        System.out.println("--> Entrez un niveau de force entre " + character.getMinAttack() + " et " + character.getMaxAttack());
        try {
            character.setPower(sc.nextInt());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            modifyPower(this.toModify);
        }
    }

    private void modifyWeapon(Warrior warrior) {
        ArrayList<String> weaponNameArray = new ArrayList<>();
        System.out.println(" --> Veuillez entrer votre choix");
        for (int i = 0; i < WeaponList.values().length; i++) {
            System.out.println((i + 1) + " -> " + WeaponList.values()[i]);
            weaponNameArray.add(WeaponList.values()[i].name());
        }
        int userChoice = sc.nextInt();
        Weapon newWeapon = new Weapon(WeaponList.valueOf(weaponNameArray.get(userChoice - 1)));
        warrior.setWeapon(newWeapon);
    }

    private void modifySpell(Wizard wizard) {
        ArrayList<String> spellNameArray = new ArrayList<>();
        System.out.println(" --> Veuillez entrer votre choix");
        for (int i = 0; i < SpellList.values().length; i++) {
            System.out.println((i + 1) + " -> " + SpellList.values()[i]);
            spellNameArray.add(SpellList.values()[i].name());
        }
        int userChoice = sc.nextInt();
        Spell newSpell = new Spell(SpellList.valueOf(spellNameArray.get(userChoice - 1)));
        wizard.setSpell(newSpell);

    }

    private ShieldList modifyShield() {
        System.out.println(" --> Veuillez entrer votre choix");

        for (int i = 0; i < ShieldList.values().length; i++) {
            System.out.println((i + 1) + " -> " + ShieldList.values()[i]);
        }
        int userChoice = sc.nextInt();
        return ShieldList.values()[userChoice - 1];
    }

    private PotionList modifyPotion() {
        System.out.println(" --> Veuillez entrer votre choix");
        for (int i = 0; i < PotionList.values().length; i++) {
            System.out.println((i + 1) + " -> " + PotionList.values()[i]);
        }
        int userChoice = sc.nextInt();
        return PotionList.values()[userChoice - 1];
    }
}