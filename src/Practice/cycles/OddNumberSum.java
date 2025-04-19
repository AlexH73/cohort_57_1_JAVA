package Practice.cycles;

import java.util.Scanner;

/**
 * <h1>✏️ Условие: </h1>
 * <p>
 * Напиши программу, которая запрашивает у пользователя число N,
 * а затем считает сумму всех нечётных чисел от 1 до N.</p>
 */
public class OddNumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        System.out.println("Сумма нечётных чисел от 1 до " + n + " = " + sum);
    }
}

/**
 * <h1> Пояснение:</h1>
 * Цикл начинается с i = 1 и увеличивается на +2 каждый раз — так мы проходим только нечётные числа.
 * <p>
 * Переменная sum накапливает сумму.
 * <p>
 * Используется Scanner для ввода числа пользователем.
 */
