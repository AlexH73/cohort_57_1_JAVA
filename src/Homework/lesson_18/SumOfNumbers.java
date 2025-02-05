//Задача 4: Подсчитать сумму чисел от 1 до N
//
//Код на Python:
//
//n = int(input("Enter a number: "))
//total = 0
//
//i = 1
//while i <= n:
//    total += i
//    i += 1
//
//print(f"The sum of numbers from 1 to {n} is {total}")

package Homework.lesson_18;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        // Создаем объект Scanner для чтения ввода пользователя
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя ввод числа
        System.out.println("Введите Ваше число: ");
        int n = scanner.nextInt();

        int total = 0;
        int i = 1;

        // Цикл while для подсчета суммы чисел от 1 до n
        while (i <= n) {
            total += i;
            i += 1;

        }
        // Вывод результата
        System.out.println("Сумма чисел от 1 до " + n + ", равна " + total);

        // Закрываем Scanner
        scanner.close();
    }
}
