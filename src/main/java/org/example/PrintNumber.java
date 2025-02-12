package org.example;
import java.util.Scanner;

public class PrintNumber {

    /*
    Задача №1:
    Напишите программу, которая выводит все числа от 1 до N, где N — заданное пользователем число.
    Если N меньше 1, программа должна вывести сообщение, что числа для вывода отсутствуют.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number >= 1) {
            for (int i = 1; i <= number; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("Числа для вывода отсутствуют");
        }
    }


}
