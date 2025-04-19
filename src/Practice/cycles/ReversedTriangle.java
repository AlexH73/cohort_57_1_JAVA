package Practice.cycles;

import java.util.Scanner;

/**
 * <h1>✏️ Условие:</h1>
 * Запроси у пользователя число n и выведи перевёрнутый треугольник:
 * первая строка содержит числа от 1 до n, следующая — до n-1 и так далее.
 */
public class ReversedTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int n = scanner.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

/*
🔍 Пояснение:
Цикл i идёт от n вниз до 1, тем самым сокращая длину строк

Цикл j всегда начинается с 1 и идёт до текущего значения i

После внутреннего цикла добавляем перевод строки
 */
