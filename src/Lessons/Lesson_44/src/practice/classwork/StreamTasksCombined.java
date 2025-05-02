package Lessons.Lesson_44.src.practice.classwork;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class StreamTasksCombined {
    public static void main(String[] args) {
        System.out.println("filterAndMapToUpper() = " + filterAndMapToUpper());
        System.out.println("oddPlusFive() = " + oddPlusFive());
        System.out.println("sortByLengthAndLimit() = " + sortByLengthAndLimit());
        System.out.println("sumOfEvenSquares() = " + sumOfEvenSquares());
        System.out.println("allShorterThanTen() = " + allShorterThanTen());
    }

    /**
     * Задача 1:
     * Из списка строк выбрать только те, которые начинаются с "A",
     * привести их к верхнему регистру и собрать в новый список.
     *
     * Требуется применить: filter -> map -> collect
     */
    public static List<String> filterAndMapToUpper() {
        List<String> words = List.of("Apple", "apricot", "Banana", "Avocado", "cherry");
        return words.stream()
                .filter(word -> word.startsWith("A"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    /**
     * Задача 2:
     * Из списка чисел оставить только нечётные,
     * увеличить их на 5 и собрать в новый список.
     *
     * Требуется применить: filter -> map -> collect
     */
    public static List<Integer> oddPlusFive() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7);
        return numbers.stream()
                .filter(number -> number % 2 != 0)
                .map(number -> number + 5)
                .collect(Collectors.toList());
    }

    /**
     * Задача 3:
     * Отсортировать список строк по убыванию длины,
     * взять первые три строки и собрать их в список.
     *
     * Требуется применить: sorted -> limit -> collect
     */
    public static List<String> sortByLengthAndLimit() {
        List<String> words = List.of("cat", "elephant", "tiger", "mouse", "lion");
        return words.stream()
                .sorted((s1, s2) -> Integer.compare(s2.length(), s1.length()))
                .limit(3)
                .collect(Collectors.toList());
    }

    /**
     * Задача 4:
     * Найти сумму квадратов всех чётных чисел в списке.
     *
     * Требуется применить: filter -> map -> reduce
     */
    public static int sumOfEvenSquares() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        return numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .reduce(0, Integer::sum);
    }

    /**
     * Задача 5:
     * Проверить, что все строки в списке короче 10 символов
     * (используя allMatch).
     *
     * Требуется применить: allMatch
     */
    public static boolean allShorterThanTen() {
        List<String> words = List.of("dog", "elephant", "tiger", "bat");
        return words.stream()
                .allMatch(word -> word.length() < 10);
    }
}
