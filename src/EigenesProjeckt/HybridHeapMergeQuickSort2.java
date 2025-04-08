package EigenesProjeckt;

import java.util.Arrays;

public class HybridHeapMergeQuickSort2 {
    private static final int THRESHOLD = 10; // Ab welcher Größe Quick Sort statt Merge genutzt wird

    public static void hybridSort(int[] arr) {
        heapSort(arr); // Heap Sort zur groben Vorverarbeitung
        mergeQuickSort(arr, 0, arr.length - 1); // Dann Merge + Quick Sort anwenden
    }

    private static void heapSort(int[] arr) {
        int n = arr.length;

        // Iterative Heapify-Methode für bessere Leistung
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            swap(arr, 0, i);
            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        while (true) {
            int largest = i;
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if (left < n && arr[left] > arr[largest]) largest = left;
            if (right < n && arr[right] > arr[largest]) largest = right;

            if (largest == i) break;

            swap(arr, i, largest);
            i = largest; // Weiter iterieren statt rekursiv aufrufen
        }
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

        int pivotIndex = medianOfThree(arr, left, right);
        swap(arr, pivotIndex, right);
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

    private static int medianOfThree(int[] arr, int left, int right) {
        int mid = left + (right - left) / 2;
        if (arr[left] > arr[mid]) swap(arr, left, mid);
        if (arr[left] > arr[right]) swap(arr, left, right);
        if (arr[mid] > arr[right]) swap(arr, mid, right);
        return mid;
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = Arrays.copyOfRange(arr, left, right + 1);
        int i = left, j = mid + 1, k = left;

        while (i <= mid && j <= right) {
            arr[k++] = temp[i - left] <= temp[j - left] ? temp[i++ - left] : temp[j++ - left];
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

