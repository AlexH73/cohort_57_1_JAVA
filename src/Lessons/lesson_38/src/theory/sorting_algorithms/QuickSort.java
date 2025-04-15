package Lessons.lesson_38.src.theory.sorting_algorithms;

/**
 * Этот код представляет собой реализацию алгоритма быстрой сортировки. Метод partition используется для распределения
 * элементов в массиве относительно опорного элемента, а quickSort - это рекурсивная функция для сортировки.
 */
public class QuickSort implements Sorting{

    // Функция для перестановки элементов
    //O (n * Log n)
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // индекс меньшего элемента
        for (int j = low; j < high; j++) {
            // Если текущий элемент меньше или равен опорному
            if (arr[j] <= pivot) {
                i++;

                // Меняем элементы местами
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Меняем опорный элемент с элементом на позиции i+1
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Основная функция для выполнения быстрой сортировки
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // pi - индекс разбиения, arr[pi] теперь на правильном месте
            int pi = partition(arr, low, high);

            // Рекурсивно сортируем элементы до и после разбиения
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public  void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    // Тестирование алгоритма
    public static void main(String args[]) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        QuickSort quickSort = new QuickSort();
        quickSort.sort(arr);

        System.out.println("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

