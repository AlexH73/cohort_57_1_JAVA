package Lessons.Lesson_20.code.theory;

import java.util.Arrays;

public class Classwork3 {
    public static void main(String[] args) {
        int[] nums  = {1, 2, 3};

        printArr(nums);

        nums[2] = 234;

        printArr(nums);

        //nums[3] = 11;
        printArr(nums);

        int[] temp = new int[nums.length + 1]; // [0, 0, 0, 0]

        for (int i = 0; i < nums.length; i++) {
            temp[i] = nums[i];
        }

        printArr(temp);
        printArr(nums);

        nums = temp;

        printArr(nums);
        nums[3] = 11;

        System.out.print("nums = ");
        printArr(nums);

        System.out.print("temp = ");
        printArr(temp);

        temp[0] = -56789;

        System.out.print("nums = ");
        printArr(nums);

        nums = Arrays.copyOf(nums, 4);

        System.out.print("nums = ");
        printArr(nums);
    }

    public static void printArr(int[] nums) {
        System.out.println(Arrays.toString(nums));
    }
}
