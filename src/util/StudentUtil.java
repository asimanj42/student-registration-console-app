/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import beans.Student;

import main.Config;

/**
 *
 * @author ASUS
 */
public class StudentUtil {

    public static Student fillStudent() {
        String name = MenuUtil.requireName();
        String surname = MenuUtil.requireSurname();
        String className = MenuUtil.requireClassName();
        int age = MenuUtil.requireAge();

        Student st = new Student(name, surname, age, className);
        return st;
    }

    public static void printAllRegisteredStudent() {
        if (Config.students == null) {
            return;
        }
        for (int i = 0; i < Config.students.length; i++) {
            Student st = Config.students[i];
            System.out.println((i + 1) + st.getFullInfo());
        }
    }

    public static void registerStudent() {
        int count = InputUtil.requireNumber("Nece telebe qeydiyyatdan kececek?");

        Config.students = new Student[count];

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ".Register");

            Config.students[i] = StudentUtil.fillStudent();
        }
        MenuUtil.showSuccessOpMessage();
        StudentUtil.printAllRegisteredStudent();
    }

    public static void temp() {
        String text = InputUtil.requireText("type name,surname or class name");
        for (int i = 0; i < Config.students.length; i++) {
            Student st = Config.students[i];
            if (st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text));
            System.out.println(st.getFullInfo());
        }
    }

    public static Student[] findStudents(String text) {
        int count = 0;
        for (int i = 0; i < Config.students.length; i++) {
            Student st = Config.students[i];
            if (st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text)) {
                count++;
            }

        }

        Student[] result = new Student[count];

        int found = 0;
        for (int i = 0; i < Config.students.length; i++) {
            Student st = Config.students[i];
            if (st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text)) {
                result[found++] = st;
            }

        }
        return result;
    }

    public static void findStudentsAndPrint() {
        String text = InputUtil.requireText("type name,surname or class name");
        Student[] result = findStudents(text);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i].getFullInfo());
        }
    }

    public static void updateStudentWithNewObject() {

        StudentUtil.printAllRegisteredStudent();
        int i = InputUtil.requireNumber("Necenci adamda deyisiklik etmek isteyirsiniz?");
        System.out.println("Yeni melumatlari daxil edin:");
        Student s = StudentUtil.fillStudent();

        Student selectedStudent = Config.students[i - 1];
    }

    public static void updateStudentWithSameObject() {
        StudentUtil.printAllRegisteredStudent();
        int i = InputUtil.requireNumber("Necenci adamda deyisiklik etmek isteyirsiniz?");
        System.out.println("Yeni melumatlari daxil edin:");

        Student selectedStudent = Config.students[i - 1];

        String changeParam = InputUtil.requireText("Neleri deyismek istersiniz? Mes:name,surname,age");

        if (changeParam.contains("'name'")) {

        }
        if (changeParam.contains("'surname'")) {
            selectedStudent.setSurname(InputUtil.requireText("Surname"));

        }
        if (changeParam.contains("'age'")) {
            selectedStudent.setAge(InputUtil.requireNumber("age"));

        }
        if (changeParam.contains("'classname'")) {
            selectedStudent.setClassName(InputUtil.requireText("class name"));

        }
    }

    public static void updateStudentsWithSplit() {
        StudentUtil.printAllRegisteredStudent();
        int i = InputUtil.requireNumber("Necenci adamda deyisiklik etmek isteyirsiniz?");
        System.out.println("Yeni melumatlari daxil edin:");

        Student selectedStudent = Config.students[i - 1];

        String changeParam = InputUtil.requireText("Neleri deyismek istersiniz? Mes:name,surname,age");
        String[] parameters = changeParam.split(",");
        for (int j = 0; j < parameters.length; j++) {
            String param = parameters[j];
            if (param.equalsIgnoreCase("name")) {
                selectedStudent.setName(MenuUtil.requireName());

            } else if (param.equalsIgnoreCase("surname")) {
                selectedStudent.setSurname(MenuUtil.requireSurname());

            } else if (param.equalsIgnoreCase("age")) {
                selectedStudent.setAge(MenuUtil.requireAge());

            } else if (param.equalsIgnoreCase("classname")) {
                selectedStudent.setClassName(MenuUtil.requireClassName());

            }
        }
    }
}
