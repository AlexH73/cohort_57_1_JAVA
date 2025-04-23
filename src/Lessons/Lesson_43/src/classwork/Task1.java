package Lessons.Lesson_43.src.classwork;

import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, -4, 0, -5);

        for (Integer num : nums) {
            System.out.println("isPositive(num) = " + isPositive(num));
        }
    }


    static boolean isPositive(int n) {
        if (n > 0) {
            return true;
        } else {
            return false;
        }
    }
}
