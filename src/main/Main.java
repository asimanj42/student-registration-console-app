/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import util.InputUtil;
import util.MenuUtil;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu = 0;

        while (true) {
            menu = InputUtil.requireNumber("What do you want to do?"
                    + "\n1. Register student"
                    + "\n2. Show all students"
                    + "\n3. Find students"
                    + "\n4. Update student"
                    + "\n5. Exit");

            MenuUtil.processMenu(menu);
        }

    }

}
