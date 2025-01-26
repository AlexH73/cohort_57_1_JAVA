//Задача 2: Определение чётности числа
//
//Код на Python:
//
//number = int(input("Enter a number: "))
//
//if number % 2 == 0:
//print(f"{number} is even")
//else:
//print(f"{number} is odd")

package Homework.Homework_18;

import java.util.Scanner;

public class IsNumberEven {
    public static void main(String[] args) {
        // Создаем объект Scanner для чтения ввода пользователя
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя ввод числа
        System.out.println("Введите целое число: ");
        int number = scanner.nextInt();

        // Определяем чётность числа и выводим результат
        if (number % 2 == 0) {
            System.out.println(number + " число чётное");
        } else {
            System.out.println(number + " число не чётное");
        }

        // Закрываем Scanner
        scanner.close();
    }
}
