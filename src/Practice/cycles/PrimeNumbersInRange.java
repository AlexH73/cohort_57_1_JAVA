package Practice.cycles;

import java.util.Scanner;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начало диапазона: ");
        int start = scanner.nextInt();

        System.out.println("Введите конец диапазона:");
        int end = scanner.nextInt();

        System.out.print("Простые числа: ");
        for (int i = start; i <= end; i++) {
            if (i < 2) {
                continue;
            }

            boolean isPrime = true;

            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
/*
🔍 Пояснение:
Цикл i идёт по числам от start до end

Для каждого i создаём флаг isPrime, по умолчанию — true

Проверяем все делители от 2 до i - 1. Если делится без остатка — isPrime = false

Если число не оказалось делимым — оно простое, выводим его
 */