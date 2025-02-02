package Practice.Practice_20;

import java.util.Arrays;

public class ArrayOperations {
    /**
     * <h1>Практика: </h1>
     * Создайте массив, отсортируйте его и найдите максимальный элемент.
     */
    public static void main(String[] args) {
        // Создаем массив целых чисел
        int[] numbers = {3, 5, 1, 8, 2, 9, 4, 7, 6};

        // Выводим исходный массив
        System.out.println("Исходный массив: " + Arrays.toString(numbers));

        // Сортируем массив
        Arrays.sort(numbers);

        // Выводим отсортированный массив
        System.out.println("Отсортированный массив: " + Arrays.toString(numbers));

        // Находим максимальный элемент в отсортированном массиве
        int maxElement = numbers[numbers.length - 1];

        // Выводим максимальный элемент
        System.out.println("Максимальный элемент: " + maxElement);
    }
}
