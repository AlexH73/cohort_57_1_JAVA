package Lessons.Lesson_44.src.practice.classwork;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTasksCombined {
    public static void main(String[] args) {
        System.out.println("filterAndMapToUpperStream() = " + filterAndMapToUpperStream());
        System.out.println("filterAndMapToUpper() = " + filterAndMapToUpper());
        System.out.println("oddPlusFiveStream() = " + oddPlusFiveStream());
        System.out.println("oddPlusFive() = " + oddPlusFive());
        System.out.println("sortByLengthAndLimit() = " + sortByLengthAndLimit());
        System.out.println("sumOfEvenSquaresStream() = " + sumOfEvenSquaresStream());
        System.out.println("sumOfEvenSquares() = " + sumOfEvenSquares());
        System.out.println("allShorterThanTenStream() = " + allShorterThanTenStream());
        System.out.println("allShorterThanTen() = " + allShorterThanTen());

    }

    /**
     * Задача 1:
     * Из списка строк выбрать только те, которые начинаются с "A",
     * привести их к верхнему регистру и собрать в новый список.
     * <p>
     * Требуется применить: filter -> map -> collect
     */
    public static List<String> filterAndMapToUpperStream() {
        List<String> words = List.of("Apple", "apricot", "Banana", "Avocado", "cherry");
        return words.stream()
                .filter(word -> word.startsWith("A"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static List<String> filterAndMapToUpper() {
        List<String> words = List.of("Apple", "apricot", "Banana", "Avocado", "cherry");
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (word.startsWith("A")) {
                result.add(word.toUpperCase());
            }
        }
        return result;
    }

    /**
     * Задача 2:
     * Из списка чисел оставить только нечётные,
     * увеличить их на 5 и собрать в новый список.
     * <p>
     * Требуется применить: filter -> map -> collect
     */
    public static List<Integer> oddPlusFiveStream() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7);
        return numbers.stream()
                .filter(number -> number % 2 != 0)
                .map(number -> number + 5)
                .collect(Collectors.toList());
    }

    public static List<Integer> oddPlusFive() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7);
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 != 0) {
                result.add(number + 5);
            }
        }
        return result;
    }

    /**
     * Задача 3:
     * Отсортировать список строк по убыванию длины,
     * взять первые три строки и собрать их в список.
     * <p>
     * Требуется применить: sorted -> limit -> collect
     */
    public static List<String> sortByLengthAndLimit() {
        List<String> words = List.of("cat", "elephant", "tiger", "mouse", "lion");
        List<String> sorted = new ArrayList<>(words);
        sorted.sort((s1, s2) -> Integer.compare(s2.length(), s1.length()));
        return sorted.subList(0, Math.min(3, sorted.size()));
    }

    /**
     * Задача 4:
     * Найти сумму квадратов всех чётных чисел в списке.
     * <p>
     * Требуется применить: filter -> map -> reduce
     */
    public static int sumOfEvenSquaresStream() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        return numbers.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * num)
                .reduce(0, Integer::sum);
    }

    public static int sumOfEvenSquares() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        int sum = 0;
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                sum += number * number;
            }
        }
        return sum;
    }

    /**
     * Задача 5:
     * Проверить, что все строки в списке короче 10 символов
     * (используя allMatch).
     * <p>
     * Требуется применить: allMatch
     */
    public static boolean allShorterThanTenStream() {
        List<String> words = List.of("dog", "elephant", "tiger", "bat");

        return words.stream().allMatch(word -> word.length() < 10);
    }

    public static boolean allShorterThanTen() {
        List<String> words = List.of("dog", "elephant", "tiger", "bat");
        for (String word : words) {
            if (word.length() >= 10) {
                return false;
            }
        }
        return true;
    }
}
