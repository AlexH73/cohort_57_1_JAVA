package Homework.lesson_20;

import java.util.Arrays; // для работы с массивами.
import java.util.Random; // для генерации случайных чисел.

public class ArraySortAndSearch {
    /**
     * 2. Сортировка и Поиск:
     *     Используйте Arrays.sort() для сортировки массива.
     *     Найдите максимальное и минимальное значения в массиве.
     */
    public static void main(String[] args) {
        // Создаем массив целых чисел размером 10 элементов
        int[] array = new int[10];

        // Создаем объект Random для генерации случайных чисел
        Random random = new Random();

        // Заполняем массив случайными числами от 1 до 100
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }

        // Выводим массив до сортировки
        System.out.println("Массив до сортировки: " + Arrays.toString(array));

        // Сортируем массив
        Arrays.sort(array);

        // Выводим массив после сортировки
        System.out.println("Массив после сортировки: " + Arrays.toString(array));

        // Находим минимальное и максимальное значения
        int minValue = array[0];
        int maxValue = array[array.length -1];

        // Выводим минимальное и максимальное значения
        System.out.println("Минимальное значение: " + minValue);
        System.out.println("Максимальное значение: " + maxValue);
    }
}
