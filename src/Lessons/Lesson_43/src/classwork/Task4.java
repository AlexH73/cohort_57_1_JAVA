package Lessons.Lesson_43.src.classwork;

import java.util.Random;
import java.util.function.Supplier;

public class Task4 {
    private static final Random random = new Random();

    public static void main(String[] args) {
        // Императивный подход
        System.out.println("Императивный подход:");
        System.out.println("Случайное число: " + getRandom());

        // Функциональный подход
        System.out.println("\nФункциональный подход:");
        Supplier<Integer> randomSupplier = () -> random.nextInt(101);
        System.out.println("Случайное число: " + randomSupplier.get());
    }

    // Императивный метод
    static int getRandom() {
        return random.nextInt(101);
    }
}
