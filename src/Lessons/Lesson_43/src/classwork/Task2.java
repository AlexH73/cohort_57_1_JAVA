package Lessons.Lesson_43.src.classwork;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Task2 {
    public static void main(String[] args) {
        Function<String, Integer> nums = (s) -> s.length();

        List<String> words = Arrays.asList("Java", "Hi", "Stream");

        for (String word : words) {
            System.out.println("nums.apply(word) = " + nums.apply(word));
            System.out.println("lengthOf(word) = " + lengthOf(word) + "\n");

        }

    }

    private static int lengthOf(String s) {
        return s.length();
    }
}
