package com.campusnum;

import com.campusnum.menu.StartMenu;
import com.campusnum.personnage.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Menu start = new StartMenu();
//        start.displayMenu();
        Personnage newguerrier = new Guerrier("Potter", "imagePotter", 12,20);
        System.out.println(newguerrier);
    }
}
