package Lessons.Lesson_43.src.classwork;

import java.util.List;
import java.util.function.Predicate;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, -4, 0, -5);

        // Функциональный подход с Predicate<Integer>:
        Predicate<Integer> isPositivePredicate = n -> n > 0;

        // Проверка всех элементов массива
        boolean allPositive = nums.stream().allMatch(isPositivePredicate);

        System.out.println("Все числа положительные? " + (allPositive ? "Да" : "Нет"));

        // Пример проверки каждого элемента
        nums.stream()
                .forEach(n -> System.out.println(n + " положительное? " + (isPositivePredicate.test(n) ? "Да" : "Нет")));

        // Императивный подход с методом isPositive:
        for (Integer num : nums) {
            System.out.println(num + " положительное? " + (isPositive(num) ? "Да" : "Нет"));
        }
    }

    static boolean isPositive(int n) {
        return n > 0;
    }
}
