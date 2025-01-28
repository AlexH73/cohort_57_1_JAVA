// 1. Напишите программу, которая определяет, является ли введённое число положительным, отрицательным или равным нулю, используя if-else.

package Practice.Practice_17;

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {

        // Создаем объект Scanner для чтения ввода пользователя
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя ввод числа
        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        // Проверяем, является ли число положительным, отрицательным или нулем
        if (number > 0) {
            System.out.println("Число " + number + " положительное.");
        } else if (number < 0) {
            System.out.println("Число " + number + " отрицательное.");
        } else {
            System.out.println("Число равно нулю.");
        }

        // Закрываем Scanner
        scanner.close();
    }
}
