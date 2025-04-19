package Practice.cycles;

import java.util.Scanner;

/**
 * <h1>✏️ Условие:</h1>
 * Запроси у пользователя число n и выведи треугольник,
 * в котором каждая строка содержит числа от 1 до номера этой строки.
 */
public class NumberTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
/*
🔍 Пояснение:
Сначала читаем значение n от пользователя

Внешний цикл i от 1 до n создаёт строки

Внутренний цикл j от 1 до i печатает числа от 1 до i

После внутреннего цикла ставим System.out.println() — переход на новую строку
 */
