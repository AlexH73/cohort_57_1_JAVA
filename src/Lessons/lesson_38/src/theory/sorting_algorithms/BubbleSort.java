package Lessons.lesson_38.src.theory.sorting_algorithms;

public class BubbleSort implements Sorting{
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        BubbleSort sort = new BubbleSort();
        sort.sort(arr);
        System.out.println("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Функция для выполнения сортировки пузырьком
    public  void sort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Перестановка элементов arr[j] и arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // Если во внутреннем цикле не было перестановок, выход
            if (!swapped)
                break;
        }
    }
}

