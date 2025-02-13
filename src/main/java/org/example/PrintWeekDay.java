package org.example;

import java.util.Scanner;

public class PrintWeekDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            System.out.println("Введите число от 1 до 7");
            int day = scanner.nextInt();

            switch (day) {
                case 1:
                    System.out.println("Понедельник");
                    break;
                case 2:
                    System.out.println("Вторник");
                    break;
                case 3:
                    System.out.println("Среда");
                    break;
                case 4:
                    System.out.println("Четверг");
                    break;
                case 5:
                    System.out.println("Пятница");
                    break;
                case 6:
                    System.out.println("Суббота");
                    break;
                case 7:
                    System.out.println("Воскресенье");
                    break;
                default:
                    System.out.println("Нужно ввести число от 1 до 7");
                    continue;
            }

            System.out.println("Хотите ввести еще одно число?");
            String answer = scanner.next();
            continueProgram = answer.equalsIgnoreCase("да");
        }
    }
}
