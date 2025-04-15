package Lessons.lesson_38.src.theory.sorting_algorithms;

/**
 * Этот код демонстрирует алгоритм сортировки выбором. Он итеративно находит минимальный элемент из неотсортированной
 * части массива и меняет его с первым элементом этой части.
 */
public class SelectionSort implements Sorting {
    // Функция для выполнения сортировки выбором
    public void sort(int[] arr) {
        int n = arr.length;

        // Перебираем весь массив
        for (int i = 0; i < n - 1; i++) {
            // Находим индекс минимального элемента в неотсортированной части массива
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            // Меняем найденный минимальный элемент с первым элементом
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    // Тестирование алгоритма сортировки выбором
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        SelectionSort sort = new SelectionSort();
        sort.sort(arr);
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
