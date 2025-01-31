package Homework.Homework_20;

import java.util.Arrays; // для работы с массивами.
import java.util.Random; // для генерации случайных чисел.

public class ArrayModification {
/**
 * 3. Изменение и Вывод:
 *     Умножьте каждый элемент массива на число 2.
 *     Выведите исходный и измененный массивы в консоль.
 */
public static void main(String[] args) {
    // Создаем массив целых чисел размером 10 элементов
    int array[] = new int[10];

    // Создаем объект Random для генерации случайных чисел
    Random random = new Random();

    // Заполняем массив случайными числами от 1 до 100
    for (int i = 0; i < array.length; i++) {
        array[i] = random.nextInt(100) + 1;
    }

    // Выводим исходный массив на консоль
    System.out.println("Исходный массив: " + Arrays.toString(array));

    // Умножаем каждый элемент массива на 2
    int[] modifiedArray = new int[array.length];
    for (int i = 0; i < array.length; i++) {
        modifiedArray[i] = array[i] *2;
    }

    // Выводим измененный массив на консоль
    System.out.println("Измененный массив: " + Arrays.toString(modifiedArray));

}
}
