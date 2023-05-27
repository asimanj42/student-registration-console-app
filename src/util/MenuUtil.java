/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author ASUS
 */
public class MenuUtil {

    public static void processMenu(int selectedMenu) {

        if (selectedMenu == 1) {
            StudentUtil.registerStudent();
        } else if (selectedMenu == 2) {
            StudentUtil.printAllRegisteredStudent();
        } else if (selectedMenu == 3) {
            StudentUtil.findStudentsAndPrint();
        } else if (selectedMenu == 4) {
            StudentUtil.updateStudentsWithSplit();

        } else if (selectedMenu == 5) {
            System.exit(0);
        }

    }

    public static String requireName() {
        return InputUtil.requireText("enter name");
    }

    public static String requireSurname() {
        return InputUtil.requireText("enter surname");
    }

    public static int requireAge() {
        return InputUtil.requireNumber("enter age");
    }

    public static String requireClassName() {
        return InputUtil.requireText("enter class name");
    }

    public static void showSuccessOpMessage() {
        System.out.println("operation completed successfully");

    }
}
