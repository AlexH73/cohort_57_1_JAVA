package Lessons.lesson_38.src.theory.sorting_algorithms;

/**
 * В этом коде реализуется алгоритм сортировки вставками. Он последовательно проходит через элементы массива, вставляя
 * каждый новый элемент в отсортированную часть массива.
 */
public class InsertionSort implements Sorting{
    // Метод для сортировки массива методом вставок
    public void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Перемещаем элементы arr[0..i-1], которые больше, чем key, на одну позицию вперед
            // от их текущего положения
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Тестирование метода сортировки вставками
    public static void main(String args[]) {
        int[] arr = {12, 11, 13, 5, 6};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(arr);
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
    }
}

