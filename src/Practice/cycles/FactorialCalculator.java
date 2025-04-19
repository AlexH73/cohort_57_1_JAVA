package Practice.cycles;

import java.util.Scanner;

/**
 * <h1>✏️ Условие:</h1>
 * Напиши программу, которая запрашивает у пользователя число N и выводит факториал этого числа.
 * Факториал — это произведение всех чисел от 1 до N.
 * Обозначается как N!
 */
public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число N:");
        int n = scanner.nextInt();

        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(n+"! = " + factorial);
    }
    /**
     * <h1> Пояснение:</h1>
     * Переменная factorial: начальное значение 1, так как 0 было бы ошибкой (умножение на 0).
     * <p>
     * Цикл for: от 1 до n, каждый шаг умножаем factorial *= i.
     * <p>
     */
}
