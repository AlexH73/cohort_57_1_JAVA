//Задача 5: Таблица умножения для числа
//
//Код на Python:
//
//number = int(input("Enter a number: "))
//
//i = 1
//while i <= 10:
//    print(f"{number} x {i} = {number * i}")
//    i += 1

package Homework.Homework_18;

import java.util.Scanner;

public class MultiplyingANumber {
    public static void main(String[] args) {
        // Создаем объект Scanner для чтения ввода пользователя
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя ввод числа
        System.out.println("Введите Ваше число: ");
        int number = scanner.nextInt();

        // Переменная счетчика
        int i = 1;

        // Цикл while для создания таблицы умножения
        while (i <= 10) {
            System.out.println(number + " x " + i + " = " + (number * i));
            i++;
        }

        // Закрываем Scanner
        scanner.close();
    }
}
