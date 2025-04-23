package Lessons.Lesson_43.src.classwork;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Task2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Hi", "Stream");

        // Императивный подход
        System.out.println("Императивный подход:");
        for (String word : words) {
            System.out.println(word + " -> длина: " + lengthOf(word));
        }

        // Функциональный подход
        System.out.println("\nФункциональный подход:");
        Function<String, Integer> lengthFunction = s -> s.length();

        words.forEach(word ->
                System.out.println(word + " -> длина: " + lengthFunction.apply(word))
        );
    }

    // Императивный метод
    static int lengthOf(String s) {
        return s.length();
    }
}


