package Lessons.lesson_38.src.teachers_code;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = {100, 23, 45, 2, 6, -343, 66, -4, 1, 56, 90, 100};
        //int arr[] = {100, 2, 3, 4, 5, 6, 7, 8, 9, -10};

        int step = 0;

        // n * logn  to  n^2
        Arrays.sort(arr);

        // временная сложность от n, когда массив отсортирован, до ±n^2, когда массив не отсортирован
        for (int i = 0; i < arr.length -1; i++) {
            int lastIndexForJ = arr.length -1;
            boolean isSorted = true;

            for (int j = 0; j < lastIndexForJ; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];

                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;
                }
                step++;
            }

            if (isSorted) {
                break;
            }
            lastIndexForJ--;
        }

        System.out.println(Arrays.toString(arr));
        String format = "Для сортировки массива длинно %d, затрачено %d шагов\n";

        System.out.printf(format, arr.length, step);
    }
}
