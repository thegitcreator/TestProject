package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {

    /*
    ######### Задача #######
    Напишите программу, которая работает с простым списком имен студентов. Программа должна:
    Добавлять имя студента в список.
    Удалять имя студента по запросу.
    Выводить текущий список студентов.
    */

    ArrayList<String> students = new ArrayList<>();

    public void addStudent(String name){
        students.add(name);
        System.out.println(name + " добавлен в список студентов");
    }

    public void deleteStudent(String name){
        if (students.remove(name)) {
            System.out.println(name + " удален из списка студентов");
        } else {
            System.out.println(name + " не найден в списке студентов студентов");
        }
    }

    public void showStudentList(){
        if (students.isEmpty()){
            System.out.println("отсутствуют добавленные студенты");
        } else {
            for (String student : students) {
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args){
        StudentList studentsListMy = new StudentList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите действие: 1 - добавить студента в список, 2 - убрать студента из списка, 3 - показать список студентов");
            String command = scanner.next();

        switch (command) {
            case ("1"):
                System.out.println("Введите имя студента: ");
                String addName = scanner.next();
                studentsListMy.addStudent(addName);
                break;
            case ("2"):
                System.out.println("Введите имя студента: ");
                String deleteName = scanner.next();
                studentsListMy.deleteStudent(deleteName);
                break;
            case ("3"):
                System.out.println("Список студентов: ");
                studentsListMy.showStudentList();
                break;
            default:
                System.out.println("Нет такого действия");
            }
        }
    }
}

