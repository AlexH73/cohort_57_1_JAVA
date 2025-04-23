package Lessons.Lesson_43.src.classwork;

import java.util.Arrays;
import java.util.function.Consumer;

public class Task3 {
    public static void main(String[] args) {
        String[] names = { "Alice", "Bob", "Eve" };

        // Императивный подход
        System.out.println("Императивный подход:");
        for (String name : names) {
            greet(name);
        }

        // Функциональный подход
        System.out.println("\nФункциональный подход:");
        Consumer<String> greetConsumer = name -> System.out.println("Hello " + name + "!");
        Arrays.stream(names).forEach(greetConsumer);
    }

    // Императивный метод
    static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
