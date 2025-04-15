package Lessons.lesson_38.src.theory.sorting_algorithms;

/**
 * Этот код демонстрирует реализацию алгоритма сортировки слиянием. Он включает метод merge для объединения двух
 * подмассивов и метод sort для рекурсивной сортировки и слияния.
 */
public class MergeSort implements Sorting{

    // Объединение двух подмассивов arr[]
    // Первый подмассив - arr[l..m]
    // Второй подмассив - arr[m+1..r]
    public static void merge(int arr[], int l, int m, int r) {
        // Определение размеров двух подмассивов для слияния
        int n1 = m - l + 1;
        int n2 = r - m;

        // Создание временных массивов
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Копирование данных во временные массивы
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // Слияние временных массивов

        // Начальные индексы первого и второго подмассива
        int i = 0, j = 0;

        // Начальный индекс объединенного подмассива
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Копирование оставшихся элементов L[], если таковые имеются
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Копирование оставшихся элементов R[], если таковые имеются
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Основная функция, сортирующая arr[l..r] с помощью merge()
    private static void sort(int arr[], int l, int r) {
        if (l < r) {
            // Нахождение середины
            int m = l + (r - l) / 2;

            // Сортировка первой и второй половин
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Слияние отсортированных половин
            merge(arr, l, m, r);
        }
    }

    public void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    // Тестирование кода
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        System.out.println("Given Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr);

        System.out.println("\nSorted array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

