package Lessons.Lesson_44.src.practice.classwork;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

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
     *
     * Требуется применить: filter -> count
     */
    public static void countWordsStartingWithA() {
        List<String> words = List.of("Apple", "Banana", "Avocado", "Cherry", "apricot");
        long x = words.stream().filter(word -> word.startsWith("A")).count();
        int count = 0;
        for (String word : words) {
            if (word.startsWith("A")) {
                count++;
            }
        }
        System.out.println("Count of words starting with 'A': " + count +" und " + x);
    }

    /**
     * Задача 2.
     * Есть список чисел. Собери только чётные числа в новый список.
     *
     * Требуется применить: filter -> collect
     */
    public static void collectEvenNumbers() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> evenNumber = numbers.stream().filter(num -> num % 2 == 0).collect(toList());
        for (Integer num : numbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }
        System.out.println("Even numbers: " + evenNumbers + " " + evenNumber);
    }

    /**
     * Задача 3.
     * Есть список строк. Найди первый элемент, длина которого больше 5 символов.
     *
     * Требуется применить: filter -> findFirst
     */
    public static void findFirstLongWord() {
        List<String> words = List.of("hi", "world", "fantastic", "code", "hbgtf");
        String word1 = words.stream().filter(word -> word.length() > 5).findFirst().orElse("Not found");
        String result = "Not found";
        for (String word : words) {
            if (word.length() > 4) {
                result = word;
                break;
            }
        }
        System.out.println("First long word: " + word1 + " " + result);
    }

    /**
     * Задача 4.
     * Проверь, есть ли в списке число, делящееся на 7.
     *
     * Требуется применить: anyMatch
     */
    public static void checkDivisibleBySeven() {
        List<Integer> numbers = List.of(3, 10, 14, 18);
        boolean hasDivisibleBySevenStream = numbers.stream().anyMatch(num ->num % 7 == 0);

        System.out.println("Contains number divisible by 7: " + hasDivisibleBySevenStream);

        boolean hasDivisibleBySeven = false;
        for (Integer num : numbers) {
            if (num % 7 == 0) {
                hasDivisibleBySeven = true;
                break;
            }
        }
        System.out.println("Contains number divisible by 7: " + hasDivisibleBySeven);
    }

    /**
     * Задача 5.
     * Посчитай произведение всех чисел в списке.
     *
     * Требуется применить: reduce
     */
    public static void multiplyAllNumbers() {
        List<Integer> numbers = List.of(2, 3, 4);
        int productStream = numbers.stream().reduce((x, y) -> x * y).orElse(0);

        System.out.println("Product of all numbersStream: " + productStream);

        int product = 1;
        for (Integer num : numbers) {
            product *= num;
        }
        System.out.println("Product of all numbers: " + product);
    }
}