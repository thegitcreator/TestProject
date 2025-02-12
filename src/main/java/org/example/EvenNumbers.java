package org.example;

public class EvenNumbers {
    public static void main(String[] args) {

    /* Задача №2:
    написать программу, которая будет вычислять сумму всех четных чисел от 1 до 100,
    а также выводить, сколько четных чисел было найдено.
    (для проверки числа на четность используем условие i % 2 == 0 , что значит что число делится на 2 без остатка)
     */

    int count = 0;
    int sum = 0;

    for (int i = 1; i <= 100; i++) {
        if (i % 2 == 0) {
            sum = sum + i;
            count++;
        }
    }

    System.out.println("Сумма четных чисел = " + sum);
    System.out.println("Количество четных чисел = " + count);

    }
}
