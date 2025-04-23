package Lessons.Lesson_43.src.classwork;

import java.util.Arrays;
import java.util.function.Predicate;

public class Task6 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9, 10, 12};

        // Императивный подход
        System.out.println("Императивный подход:");
        for (int num : nums) {
            System.out.println(num + " делится на 3 или 5? " + (isDivBy3Or5(num) ? "делится" : "не делится"));
        }

        // Функциональный подход
        System.out.println("\nФункциональный подход:");
        Predicate<Integer> divBy3 = n -> n % 3 == 0;
        Predicate<Integer> divBy5 = n -> n % 5 == 0;
        Predicate<Integer> divBy3Or5 = divBy3.or(divBy5);

        Arrays.stream(nums)
                .boxed()
                .forEach(n -> System.out.println(n + " делится на 3 или 5? " + (divBy3Or5.test(n) ? "делится" : "не делится")));
    }

    // Императивный метод
    static boolean isDivBy3Or5(int n) {
        return n % 3 == 0 || n % 5 == 0;
    }
}
