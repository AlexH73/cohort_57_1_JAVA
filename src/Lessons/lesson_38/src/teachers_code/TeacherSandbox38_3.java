package Lessons.lesson_38.src.teachers_code;

import java.util.Arrays;

public class TeacherSandbox38_3 {

    public static void main(String[] args) {
        int[] sorted = {1, 1, 2, 4, 5, 7, 34, 6456, 64323};
        int[] notSorted = {12, 5, -23, 898, 54, 4, 4, 5, 4, 0, 189};

        System.out.println("isSorted(sorted) = " + isSorted(sorted));
        System.out.println("isSorted(notSorted) = " + isSorted(notSorted));

        if (!isSorted(notSorted)) {
            System.out.println("Before sort: " + Arrays.toString(notSorted));
            // sort it!
            bubbleSort(notSorted);
            System.out.println("After sort: " + Arrays.toString(notSorted));
        }
    }

    // [1, 1, 2, 3, 4, 7]
    private static boolean isSorted(int[] nums) {
        // not null not empty...
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                return false;
            }
        }

        return true;
    }

    private static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[j - 1] > nums[j]) {
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }


}
