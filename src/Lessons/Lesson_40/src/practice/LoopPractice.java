package Lessons.Lesson_40.src.practice;

import java.util.Scanner;
/*
public class LoopPractice {
    public static void main(String[] args) {
       // sumFromOneToN();
        // isPrime(11);
        // guessNumber();
        // multiplicationTable();
        // reverseDigits();
    }
*/
    /**
     * Задача 1: Сумма чисел от 1 до N
     * Напишите программу, которая запрашивает у пользователя целое число N
     * и с помощью цикла for вычисляет сумму всех чисел от 1 до N.
     * Пример: Ввод: 5 → Вывод: Сумма: 15 <p>
     * Пример: Ввод: 3 → Вывод: Сумма: 6 <p>
     * Пример: Ввод: 1 → Вывод: Сумма: 1 <p>
     *
     * @return
     */
    /*
    public static boolean sumFromOneToN() {
        try (Scanner scanner = new Scanner(System.in);) {
            System.out.print("Gib eine Zahl ein: ");
            int zahl = scanner.nextInt();
            int quersumme = 0;

            while (zahl > 0) {
                quersumme += zahl % 10; // Letzte Ziffer der Zahl addieren
                zahl = zahl / 10; // Zahl verkleinern, indem die letzte Ziffer entfernt wird
            }

            System.out.println("Die Quersumme ist: " + quersumme);
            //  TODO: Реализуйте решение здесь
        }
    }
}
*/

    /**
     * Задача 2: Проверка на простое число
     * С помощью цикла while определите, является ли переданное число n простым.
     * Простое число делится только на 1 и само на себя.
     * Пример: Ввод: 1 → Вывод: true <p>
     * Пример: Ввод: 7 → Вывод: true <p>
     * Пример: Ввод: 12 → Вывод: false <p>
     */
    /*
    public static boolean isPrime(int n) {
            // Число меньше 2 не считается простым
        if (n < 2) {
            return false;
        }

        int divisor = 2; // Начальный делитель
            // Проверка, делится ли число на любой делитель от 2 до n-1
        while (divisor <= Math.sqrt(n)) { // Оптимизация: до квадратного корня числа
            if (n % divisor == 0) {
                return false; // Нашли делитель, число не простое
            }
                divisor++; // Увеличиваем делитель
            }

            return true; // Если делителей нет, число простое
        }

     */


        /**
         * Задача 3: Угадай число
         * Компьютер "загадывает" число от 1 до 100. Пользователь вводит попытки угадать число,
         * а программа подсказывает: больше или меньше. Цикл продолжается, пока пользователь не угадает.
         */
        /*
    public static void guessNumber() {Scanner scanner = new Scanner(System.in);
            int secretNumber = (int) (Math.random() * 100) + 1; // Генерация случайного числа от 1 до 100
            int userGuess = 0; // Переменная для попыток пользователя

            System.out.println("Компьютер загадал число от 1 до 100. Попробуйте угадать!");

            while (userGuess != secretNumber) { // Цикл продолжается, пока число не угадано
                System.out.print("Ваше предположение: ");
                userGuess = scanner.nextInt();

                if (userGuess < secretNumber) {
                    System.out.println("Загаданное число больше!");
                } else if (userGuess > secretNumber) {
                    System.out.println("Загаданное число меньше!");
                } else {
                    System.out.println("Поздравляю! Вы угадали число: " + secretNumber);
                }
            }

         */
        // TODO: Реализуйте решение здесь



    /**
     * Задача 4: Таблица умножения на число N
     * С помощью цикла for выведите таблицу умножения на заданное число N от 1 до 10.
     * Пример: Ввод: 3 → Вывод:
     * 3 * 1 = 3
     * 3 * 2 = 6
     * ...
     * 3 * 10 = 30
     */
  //  public static void multiplicationTable(int n) {
        // TODO: Реализуйте решение здесь
 //   }

    /**
     * Задача 5: Обратный порядок цифр
     * Запросите у пользователя целое положительное число и выведите его цифры в обратном порядке.
     * Используйте цикл while.
     * Пример: Ввод: 12345 → Вывод: 54321
     */
 //   public static void reverseDigits() {
        // TODO: Реализуйте решение здесь
 //   }
 //   }