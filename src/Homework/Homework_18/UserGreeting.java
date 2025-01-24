//Задача 1:
//Приветствие пользователя
//
//Код на
//Python:
//
//name = input("Enter your name: ")
//
//print(f"Hello, {name}!")

package Homework.Homework_18;

import java.util.Scanner;

public class UserGreeting {
    public static void main(String[] args) {
        // Создаем объект Scanner для чтения ввода пользователя
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя ввод имени
        System.out.print("Ведите своё имя: ");
        String name = scanner.nextLine();

        // Приветствуем пользователя
        System.out.println("Привет, " + name + "!");

        // Закрываем Scanner
        scanner.close();
    }
}
