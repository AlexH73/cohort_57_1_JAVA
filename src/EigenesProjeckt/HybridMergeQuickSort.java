package EigenesProjeckt;

import java.util.Arrays;

public class HybridMergeQuickSort {
    private static final int THRESHOLD = 10; // Wenn Array < THRESHOLD, dann Quick Sort nutzen

    public static void hybridSort(int[] arr) {
        mergeQuickSort(arr, 0, arr.length - 1);
    }

    private static void mergeQuickSort(int[] arr, int left, int right) {
        if (right - left < THRESHOLD) {
            quickSort(arr, left, right);
            return;
        }

        if (left >= right) return;

        int mid = left + (right - left) / 2;

        mergeQuickSort(arr, left, mid);
        mergeQuickSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    private static void quickSort(int[] arr, int left, int right) {
        if (left >= right) return;

        int pivot = arr[right];
        int partitionIndex = left;

        for (int i = left; i < right; i++) {
            if (arr[i] < pivot) {
                swap(arr, i, partitionIndex);
                partitionIndex++;
            }
        }
        swap(arr, partitionIndex, right);

        quickSort(arr, left, partitionIndex - 1);
        quickSort(arr, partitionIndex + 1, right);
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = Arrays.copyOfRange(arr, left, right + 1);
        int i = left, j = mid + 1, k = left;

        while (i <= mid && j <= right) {
            arr[k++] = (temp[i - left] <= temp[j - left]) ? temp[i++ - left] : temp[j++ - left];
        }

        while (i <= mid) arr[k++] = temp[i++ - left];
        while (j <= right) arr[k++] = temp[j++ - left];
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {100, 23, 45, 2, 6, -343, 66, -4, 1, 56, 90, 100, 5, 3, -2, 45, 76};
        hybridSort(arr);
        System.out.println("Sortiertes Array: " + Arrays.toString(arr));
    }
}

