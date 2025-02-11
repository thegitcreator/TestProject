package org.example;
import java.util.Scanner;

public class HelloUser {
    /*
    Задача
    Напишите программу, которая:
    1. Принимает от пользователя его имя, возраст и вес.
    2. Переводит строковое значение веса в целое число.
    3. Вычисляет, сколько лет осталось до достижения 100 лет.
    4. Выводит сообщение, используя введённые данные, в формате: "Привет, Имя! Через Х лет тебе будет 100 лет. Сейчас ты весишь Y кг."
    */

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Запрашиваем имя пользователя
            System.out.print("Имя: ");
            String userName = scanner.nextLine();

            // Запрашиваем возраст пользователя
            System.out.print("Возраст: ");
            byte age = scanner.nextByte();

            // Запрашиваем вес пользователя
            System.out.print("Вес: ");
            String weight = scanner.next();

            int userWeight = Integer.parseInt(weight);

            int userAge = 100 - age;

            System.out.println("Привет, " + userName + "! " + "Через " + userAge + " лет тебе будет 100 лет. Сейчас ты весишь " + userWeight + " кг.");
        }
    }


