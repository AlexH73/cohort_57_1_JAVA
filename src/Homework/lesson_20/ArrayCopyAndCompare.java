package Homework.lesson_20;


import java.util.Arrays; //для работы с массивами.
import java.util.Random; //для генерации случайных чисел.

public class ArrayCopyAndCompare {
/**
 * 4. Копирование и Сравнение:
 *     Создайте копию исходного массива используя Arrays.copyOf().
 *     Сравните исходный массив и его копию с помощью Arrays.equals() и выведите результат сравнения.
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

        // Выводим исходный массив на консоль
        System.out.println("Исходный массив: " + Arrays.toString(array));

        // Создаем копию исходного массива
        int[] copiedArray = Arrays.copyOf(array, array.length);

        // Выводим копию массива на консоль
        System.out.println("Копия массива: " + Arrays.toString(copiedArray));

        // Сравниваем исходный массив и его копию
        boolean arraysAreEqual = Arrays.equals(array, copiedArray);

        // Выводим результат сравнения
        //System.out.println("Массивы равны: " + arraysAreEqual);
        if (arraysAreEqual) {
            System.out.println("Массивы равны ;)");
        } else {
            System.out.println("Массивы не равны ;(");
        }
    }
}
