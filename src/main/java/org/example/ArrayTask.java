package org.example;

import java.util.Scanner;

import java.util.Arrays;

public class ArrayTask {

    /*Задача:
    Нахождение максимального и минимального элементов массива
    Напиши программу на Java, которая будет:
    Принимать от пользователя размер массива.
    Принимать значения элементов массива.
    Определять максимальный и минимальный элементы массива.
    Выводить максимальный и минимальный элементы массива.
    Пример ввода/вывода программы:
    Введите размер массива: 5
    Введите элементы массива:
    Элемент [0]: 10
    Элемент [1]: -5
    Элемент [2]: 20
    Элемент [3]: 0
    Элемент [4]: 15
    Максимальный элемент: 20
    Минимальный элемент: -5
    Задание* (со звездочкой): Попробуй добавить обработку исключений в задаче, чтобы программа не завершалась при вводе некорректных данных!
    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        int arraySize = scanner.nextInt();

        int[] array = new int[arraySize];
        System.out.println("Введите элементы массива: ");

        for (int i = 0; i < array.length; i++) {
            {
                System.out.println("Элемент " + "[" + i + "]: ");
                array[i] = scanner.nextInt();
            }
        }

        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
    }
}


