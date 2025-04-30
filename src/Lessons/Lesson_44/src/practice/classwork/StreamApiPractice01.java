package Lessons.Lesson_44.src.practice.classwork;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiPractice01 {
    public static void main(String[] args) {
        countWordsStartingWithA();
        collectEvenNumbers();
        findFirstLongWord();
        checkDivisibleBySeven();
        multiplyAllNumbers();
    }

    /**
     * Задача 1.
     * Есть список строк. Посчитай, сколько строк начинаются с буквы "A".
     * <p>
     * Требуется применить: filter -> count
     */
    public static void countWordsStartingWithA() {
        List<String> words = List.of("Apple", "Banana", "Avocado", "Cherry", "apricot");

        long count = words.stream()
                .filter(word -> word.startsWith("A"))
                .count();

        System.out.println("Count of words starting with 'A': " + count);
    }

    /**
     * Задача 2.
     * Есть список чисел. Собери только чётные числа в новый список.
     * <p>
     * Требуется применить: filter -> collect
     */
    public static void collectEvenNumbers() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even numbers: " + evenNumbers);
    }

    /**
     * Задача 3.
     * Есть список строк. Найди первый элемент, длина которого больше 5 символов.
     * <p>
     * Требуется применить: filter -> findFirst
     */
    public static void findFirstLongWord() {
        List<String> words = List.of("hi", "world", "fantastic", "code");
        String result = words.stream()
                .filter(word -> word.length() > 5)
                .findFirst()
                .orElse("Not found");

        System.out.println("First long word: " + result);
    }

    /**
     * Задача 4.
     * Проверь, есть ли в списке число, делящееся на 7.
     * <p>
     * Требуется применить: anyMatch
     */
    public static void checkDivisibleBySeven() {
        List<Integer> numbers = List.of(3, 10, 14, 18);
        boolean hasDivisibleBySeven = numbers.stream()
                .anyMatch(num -> num % 7 == 0);

        System.out.println("Contains number divisible by 7: " + hasDivisibleBySeven);
    }

    /**
     * Задача 5.
     * Посчитай произведение всех чисел в списке.
     * <p>
     * Требуется применить: reduce
     */
    public static void multiplyAllNumbers() {
        List<Integer> numbers = List.of(2, 3, 4);
        int product = numbers.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println("Product of all numbers: " + product);
    }
}


