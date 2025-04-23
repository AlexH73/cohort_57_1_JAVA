package Lessons.Lesson_43.src.classwork;

import java.util.function.Function;

public class Task2 {
    public static void main(String[] args) {
        Function<String, Integer> nums = (s) -> s.length();
        System.out.println("nums.apply(\" Appel\") = " + nums.apply(" Appel"));
    }

    private int lengthOf(String s) {
        return s.length();
    }
}
