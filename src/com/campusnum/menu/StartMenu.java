package com.campusnum.menu;

public class StartMenu extends Menu {

    @Override
    protected String[] getOptions() {
        return new String[]{
                "                    ___====-_  _-====___ ",
                "              __--^^^     /     \\     ^^^--_",
                "             _-^         / (    ) \\         ^-_",
                "            -           /  | ^^/|  \\           -",
                "          _/           /   (♦::♦)   \\            _",
                "         /            ((    \\||/     ))              ",
                "       -               \\    (••)     /               -",
                "      -                 \\  / '' \\  /                 -",
                "     -                   \\/      \\/                   -",
                "   / /|           /|     (        )      /|           || ",
                "   |/ | / _/ _/ _/   _/  (   / |  )  / _/   _/ _/ _/  |  |",
                "   `  |/  V  V  `    V  _(| |  | |)_/  V    '  V  V   |  '",
                "      `   `  `       `  / | |  | |  |   '       '  '   '",
                "                      <(  | |  | |  )>    ",
                "                     <__\\_| |  | |_\\__>   ",
                "                    ^^^^^ ^^^  ^^^ ^^^^^",
                "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -",
                " ----------------------> BIENVENUE! <--------------------------",
                " \n< J > --> JOUER"};
    }

    @Override
    protected void setUserChoice(String choice) {
        if (choice.equals("j")) {
            Menu createPerson = new CharacterMenu();
            createPerson.displayMenu();
        } else if (choice.equals("q")) {
            this.quitGame();
        } else {
            wrongOption();
        }
    }
}