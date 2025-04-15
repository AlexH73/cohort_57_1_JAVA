package Lessons.lesson_38.src.teachers_code;

import java.util.Arrays;

public class TeacherSandbox38_3 {

    public static void main(String[] args) {
//        int[] sorted = {1, 1, 2, 4, 5, 7, 34, 6456, 64323};
//        int[] notSorted = {12, 5, -23, 898, 54, 4, 4, 5, 4, 0, 189};
//        int[] notSorted2 = {12, 5, -23, 898, 54, 4, 4, 5, -34, 534, -1, 0, 34534, -435,  4, 0, 189};
//
//        System.out.println("isSorted(sorted) = " + isSorted(sorted));
//        System.out.println("isSorted(notSorted) = " + isSorted(notSorted));
//
//        if (!isSorted(notSorted)) {
//            System.out.println("Before sort: " + Arrays.toString(notSorted));
//            // sort it!
//            bubbleSort(notSorted);
//            System.out.println("After sort: " + Arrays.toString(notSorted));
//        }
//
//        if (!isSorted(notSorted2)) {
//            System.out.println("Before sort: " + Arrays.toString(notSorted2));
//            // sort it!
//            bubbleSort(notSorted2);
//            System.out.println("After sort: " + Arrays.toString(notSorted2));
//        }
//
//        int[] sorted2 = getSortedArray(100);
//        System.out.println("For sorted array:");
//        System.out.println("Before sort: " + Arrays.toString(sorted2));
//        bubbleSort(sorted2);
//        System.out.println("After sort: " + Arrays.toString(sorted2));

        System.out.println("sorted:");
        int[] sorted3 = {0, 1, 2, 3, 4, 5};
        easyBubbleSort(sorted3);

        System.out.println("\n\n=============================\nnot sorted:");
        int[] notSorted3 = {20, 0, 1, 2, 3, 4, 5};
        easyBubbleSort(notSorted3);
    }

    private static boolean isSorted(int[] nums) {
        // not null not empty...
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                return false;
            }
        }

        return true;
    }

    // O(n^2)
    private static void bubbleSort(int[] nums) {
        int counter = 1;

        for (int i = 0; i < nums.length; i++) {
            System.out.println(Arrays.toString(nums));
            boolean sorted = true;

            for (int j = 1; j < nums.length; j++) {
                counter++;
                if (nums[j - 1] > nums[j]) {
                    sorted = false;
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
            if (sorted) {
               break;
            }
        }
        System.out.println("nums.length = " + nums.length);
        System.out.println("counter = " + counter);
    }

    private static void easyBubbleSort(int[] nums) {
        int counter = 1;

        for (int i = 0; i < nums.length; i++) {
            System.out.println(Arrays.toString(nums));
            for (int j = 1; j < nums.length; j++) {
                counter++;
                if (nums[j - 1] > nums[j]) {
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        System.out.println("nums.length = " + nums.length);
        System.out.println("counter = " + counter);
    }


    private static int[] getSortedArray(int size) {
        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            result[i] = i;
        }
// line from Yulianna
        return result;
    }
}
