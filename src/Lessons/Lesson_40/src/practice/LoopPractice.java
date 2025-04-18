package Lessons.Lesson_40.src.practice;

import java.util.Scanner;

public class LoopPractice {
    public static void main(String[] args) {
        //sumFromOneToN();
        System.out.println(isPrime(11));
        //guessNumber();
        multiplicationTable(3);
        reverseDigits();
    }

    /**
     * Задача 1: Сумма чисел от 1 до N.
     * Напишите программу, которая запрашивает у пользователя целое число N
     * и с помощью цикла for вычисляет сумму всех чисел от 1 до N.
     * Пример: Ввод: 5 → Вывод: Сумма: 15 ----> 1+2+3+4+5=15 <p>
     * Пример: Ввод: 3 → Вывод: Сумма: 6 ----> 1+2+3=6 <p>
     * Пример: Ввод: 1 → Вывод: Сумма: 1 ----> 1=1 <p>
     */
    public static void sumFromOneToN() {
        System.out.println("Задача 1: Сумма чисел от 1 до N.");
        try (Scanner scanner = new Scanner(System.in);) {
            System.out.println("Введите число N: ");
            int n = scanner.nextInt();
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            System.out.println("Сумма чисел от 1 до " + n + " равна " + sum);
        }
    }

    /**
     * Задача 2: Проверка на простое число
     * С помощью цикла while определите, является ли переданное число n простым.
     * Простое число делится только на 1 и само на себя.
     * Пример: Ввод: 1 → Вывод: true <p>
     * Пример: Ввод: 7 → Вывод: true <p>
     * Пример: Ввод: 12 → Вывод: false <p>
     */
    public static boolean isPrime(int n) {
        System.out.println("Задача 2: Проверка на простое число");
        if (n <= 1) {
            return false;
        }
        int x = 2;
        // Примитивный вариант
        //while (x < n) {
        while (x <= Math.sqrt(n)) {
            if (n % x == 0) {
                return false;
            }
            x++;
        }
        return true;
    }

    /**
     * Задача 3: Угадай число
     * Компьютер "загадывает" число от 1 до 100. Пользователь вводит попытки угадать число,
     * а программа подсказывает: больше или меньше. Цикл продолжается, пока пользователь не угадает.
     */
    public static void guessNumber() {
        System.out.println("Задача 3: Угадай число");
        try (Scanner scanner = new Scanner(System.in);) {
            int random = (int) (Math.random() * 100) + 1;
            System.out.println("Введите число: ");
            int n = scanner.nextInt();
            while (true) {
                if (n == random) {
                    System.out.println("Урааа!!!");
                    break;
                } else if (random < n) {
                    System.out.println("Число n больше загаданного. Попробуй еще раз.");
                } else {
                    System.out.println("Число n меньше загаданного. Попробуй еще раз.");
                }
                n = scanner.nextInt();
            }

        }

    }

    /**
     * Задача 4: Таблица умножения на число N
     * С помощью цикла for выведите таблицу умножения на заданное число N от 1 до 10.
     * Пример: Ввод: 3 → Вывод:
     * 3 * 1 = 3
     * 3 * 2 = 6
     * ...
     * 3 * 10 = 30
     */
    public static void multiplicationTable(int n) {
        System.out.println("Задача 4: Таблица умножения на число N");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }

    /**
     * Задача 5: Обратный порядок цифр.
     * Запросите у пользователя целое положительное число и выведите его цифры в обратном порядке.
     * Используйте цикл while.
     * Пример: Ввод: 12345 → Вывод: 54321
     */
    public static void reverseDigits() {
        System.out.println("Задача 5: Обратный порядок цифр.");
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите положительное число: ");
            int number = scanner.nextInt();
            if (number <= 0) {
                System.err.println("Допустимо только положительное число больше нуля!");
                return;
            }

            int reversed = 0;
            int original = number;

            while (original != 0) {
                int digit = original % 10;
                reversed = reversed * 10 + digit;
                original /= 10;
            }
            System.out.println("Результат: " + reversed);
        }
    }
}
