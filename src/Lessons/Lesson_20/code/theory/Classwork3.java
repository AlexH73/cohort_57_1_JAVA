package Lessons.Lesson_20.code.theory;

import java.util.Arrays;

public class Classwork3 {
    public static void main(String[] args) {
        int[] nums  = {1, 2, 3};

        printArr(nums);

        nums[2] = 234;

        printArr(nums);
    }

    public static void printArr(int[] nums) {
        System.out.println(Arrays.toString(nums));
    }
}
