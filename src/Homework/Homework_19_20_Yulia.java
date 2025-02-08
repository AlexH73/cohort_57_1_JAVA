package Homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework_19_20_Yulia {
    public static void main(String[] args) {

        // 1. Создание и Инициализация Массива
        int[] numberArray = new int[10];
        Random random = new Random();

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = random.nextInt(100) + 1;
        }

        System.out.println("Массив случайных чисел: " + Arrays.toString(numberArray));

        // 2. Сортировка и Поиск
        Arrays.sort(numberArray);
        System.out.println("Отсортированный массив: " + Arrays.toString(numberArray));

        System.out.println("Максимальное значение: " + numberArray[numberArray.length - 1]);
        System.out.println("Минимальное значение: " + numberArray[0]);

        // 3. Изменение и Вывод
        int[] numberArray2 = {33, 75, 49, 18, 88, 17, 56, 41, 9, 10};
        System.out.println("Исходный массив: " + Arrays.toString(numberArray2));

        for (int i = 0; i < numberArray2.length; i++) {
            numberArray2[i] *= 2;
        }

        System.out.println("Умноженный массив: " + Arrays.toString(numberArray2));

        // 4. Копирование и Сравнение
        int[] numberArray3 = Arrays.copyOf(numberArray2, numberArray2.length);
        boolean arraysEqual = Arrays.equals(numberArray2, numberArray3);
        System.out.println("Результат сравнения: " + arraysEqual);

        // 5. Процентное соотношение деталей
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите число производимых деталей: ");
        int n = scanner.nextInt();
        int[] numberArray5 = new int[n];

        for (int i = 0; i < n; i++) {
            numberArray5[i] = random.nextInt(3) - 1;
        }

        int broken = 0;
        int partial = 0;
        int perfect = 0;

        for (int temp : numberArray5) {
            if (temp == 1) {
                perfect++;
            } else if (temp == 0) {
                partial++;
            } else {
                broken++;
            }
        }

        System.out.printf("Процент идеальных деталей: %.2f%%\n", (perfect / (double) n) * 100);
        System.out.printf("Процент недоделанных деталей: %.2f%%\n", (partial / (double) n) * 100);
        System.out.printf("Процент бракованных деталей: %.2f%%\n", (broken / (double) n) * 100);

        scanner.close();
    }
}
