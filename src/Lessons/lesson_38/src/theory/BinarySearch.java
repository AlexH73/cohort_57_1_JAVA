package Lessons.lesson_38.src.theory;

import java.util.ArrayList;
import java.util.Random;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = createSortedArray(100_000_000);
        int element = -31_466_239;

        // System.nanoTime() - возвращает текщее время в наносекнудах
        long startSearching = System.nanoTime();

        int index = binarySearch(array, element);

        long endSearching = System.nanoTime();

        if (index == -1) {
            System.out.printf("Бинарный поиск в отсортированном массиве длинной %d занял %d нс, " +
                    "элемент не был найден\n", array.length, endSearching - startSearching);
        } else {
            System.out.printf("Бинарный поиск в отсортированном массиве длинной %d занял %d нс, " +
                    "элемент был найден\n", array.length, endSearching - startSearching);
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        int steps = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // проверка, что середина является элементом, который ищем
            if (arr[mid] == target) {
                //System.out.printf("Элемент найден. На поиск элемента затрачено %d шагов\n", steps);
                return mid;
            }

            // если середина меньше искомого элемента, то поиск будет смещен в правую половину
            if (arr[mid] < target) {
                left = mid + 1;
            }
            // если середина больше искомого элемента, то поиск будет смещен в левую половину
            else {
                right = mid - 1;
            }
            steps++;
        }

        //System.out.printf("Элемент не был найден. На поиск элемента затрачено %d шагов\n", steps);

        // If element is not present in array
        return -1;
    }


    // 1, 2, 4, 4, 4, 5, 6, 6, 7, 8, 8, 8


    private static int[] createSortedArray(int arrayLength) {
        int[] array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            array[i] = i;
        }

        return array;
    }
}

