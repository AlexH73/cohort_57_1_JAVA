package Homework.lesson_20;

import java.util.Random; // для генерации случайных чисел.

public class RandomArrayInitializer {
    /**
     * 1. Создание и Инициализация Массива:
     *     Создайте массив целых чисел размером 10 элементов.
     *     Инициализируйте массив случайными числами от 1 до 100.
     */

    public static void main(String[] args) {
        int[] array = new int[10];
        // Создаем массив целых чисел размером 10 элементов

        // Создаем объект Random для генерации случайных чисел
        Random random = new Random();

        // Заполняем массив случайными числами от 1 до 100
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }

        // Выводим массив на консоль
        for (int i = 0; i < array.length; i++) {
            System.out.println("Элемент с индексом " + i + ": " + array[i]);
        }
    }
}
