package Practice.cycles;

import java.util.Scanner;

/**
 * <h1>Условие:</h1>
 * Запроси у пользователя два числа start и end, а затем выведи все чётные числа из этого
 * диапазона и подсчитай их количество.
 */
public class EvenCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начало диапазона: ");
        int start = scanner.nextInt();

        System.out.println("Введите конец диапазона: ");
        int end = scanner.nextInt();

        int count = 0;

        System.out.print("Чётные числа: ");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nКоличество: " + count);
    }
}
/*
🔍 Пояснение:
Вводим start и end с клавиатуры

Цикл перебирает все числа от start до end

i % 2 == 0 — проверка на чётность

Для каждого чётного числа:

Выводим его через System.out.print()

Увеличиваем счётчик count

В конце выводим итоговое количество
 */