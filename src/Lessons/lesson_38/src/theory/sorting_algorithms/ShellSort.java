package Lessons.lesson_38.src.theory.sorting_algorithms;

/**
 * Этот код демонстрирует реализацию алгоритма сортировки Шелла, который является улучшенной версией сортировки
 * вставками. Алгоритм начинает сортировку с некоторого большого интервала между сравниваемыми элементами и постепенно
 * уменьшает этот интервал.
 */
public class ShellSort implements Sorting {

    public  void sort(int[] arr) {
        int n = arr.length;

        // Начинаем с большого интервала, затем уменьшаем его
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Выполняем сортировку вставками для этого интервала
            for (int i = gap; i < n; i++) {
                int temp = arr[i];

                // Сдвигаем ранее отсортированные элементы вверх до нахождения правильного места для arr[i]
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }

                // Помещаем temp (оригинальный arr[i]) на его правильное место
                arr[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 54, 2, 3};
        System.out.println("Original Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        ShellSort sort = new ShellSort();
        sort.sort(arr);

        System.out.println("\nSorted Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

