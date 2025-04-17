//Задача 3: Найти максимальное из двух чисел
//
//Код на Python:
//
//a = int(input("Enter the first number: "))
//b = int(input("Enter the second number: "))
//
//if a > b:
//    print(f"The maximum is {a}")
//else:
//    print(f"The maximum is {b}")

package Homework.lesson_18;

import java.util.Scanner;

public class TheMaxNumber {
    public static void main(String[] args) {
        // Создаем объект Scanner для чтения ввода пользователя
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя ввод первого числа
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();

        // Запрашиваем у пользователя ввод второго числа
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();

        // Определяем и выводим максимальное число
        if (a > b) {
            System.out.println("Максимальное число: " + a);
        } else {
            System.out.println("Максимальное число: " + b);
        }

        // Закрываем Scanner
        scanner.close();
    }
}
