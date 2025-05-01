package Homework.lesson_44;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Function<Integer, String> func = (num) -> "Number: " + num;
        System.out.println(func.apply(5));

        Arrays Arrays = null;
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        long count = words.stream().filter(word -> word.length() > 5).count();
        System.out.println(count);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);

        List<String> words1 = Arrays.asList("apple", "banana", "cherry");
        String result = words1.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println(result);

        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);

        Predicate<String> predicate = s -> s.length() > 3;
        System.out.println(predicate.test("Hello"));

        Stream.of("one", "two", "three").forEach(System.out::println);

        String text = "apple";
        Consumer<String> consumer = System.out::println;
        consumer.accept(text);

        String result1 = Stream.of("a", "b", "c").reduce("", (s1, s2) -> s1 + s2);
        System.out.println(result1);

        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squared = numbers2.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println(squared);

        List<String> list = Arrays.asList("a", "b", "c");
        list.stream().filter(s -> s.equals("a")).map(String::toUpperCase).forEach(System.out::println);

        List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> ewenNumbersStream = list3.stream().filter(num -> num % 2 == 0).toList();
        System.out.println(ewenNumbersStream);

        List<Integer> list4 = Arrays.asList(1, 2, 3, 4, 5);
        Integer sumStream = list4.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sumStream);

        List<String> list5 = Arrays.asList("a", "b", "c", "d");
        List<String> selectedStream = list5.stream().filter(s -> s.compareTo("b") > 0).toList();
        System.out.println(selectedStream);
    }
}
