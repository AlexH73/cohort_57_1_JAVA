package Homework.lesson_31;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CollectionOperationsHomework operations = new CollectionOperationsHomeworkImpl();

        // Тестовые данные для чисел
        List<Integer> numberWithDuplicates = Arrays.asList(1, 2, 3, 2, 4, 3);
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> numbers2 = Arrays.asList(3, 4, 5, 6);

        // Тестовые данные для строк
        List<String> fruitsWithDuplicates = Arrays.asList("Apple", "Banana", "Cherry", "Apple");
        List<String> fruits1 = Arrays.asList("Apple", "Banana", "Cherry");
        List<String> fruits2 = Arrays.asList("Banana", "Cherry", "Date");

        System.out.println("=== ТЕСТИРОВАНИЕ ЧИСЕЛ ===");
        testIntegerOperations(operations, numberWithDuplicates, numbers1, numbers2);

        System.out.println("\n=== ТЕСТИРОВАНИЕ СТРОК ===");
        testStringOperations(operations, fruitsWithDuplicates, fruits1, fruits2);
    }

    private static void testIntegerOperations(CollectionOperationsHomework ops,
                                              List<Integer> withDupes,
                                              List<Integer> list1,
                                              List<Integer> list2) {
        System.out.println("\nТест дубликатов:");
        System.out.println("Дубликатов в " + withDupes + " -> " + ops.countDuplicatesInteger(withDupes));

        System.out.println("\nОбъединение:");
        System.out.println(list1 + " ∪ " + list2 + " = " + ops.unionOfIntegerLists(list1, list2));

        System.out.println("\nПересечение:");
        System.out.println(list1 + " ∩ " + list2 + " = " + ops.intersectionOfIntegerLists(list1, list2));

        System.out.println("\nРазность:");
        System.out.println(list1 + " ∖ " + list2 + " = " + ops.differenceOfIntegerLists(list1, list2));

        System.out.println("\nПроверка уникальности:");
        System.out.println("Уникальны ли " + list1 + "? -> " + (ops.areIntegerElementsUnique(list1)? "Да" : "Нет"));
        System.out.println("Уникальны ли " + withDupes + "? -> " + (ops.areIntegerElementsUnique(withDupes)? "Да" : "Нет"));
    }

    private static void testStringOperations(CollectionOperationsHomework ops,
                                             List<String> withDupes,
                                             List<String> list1,
                                             List<String> list2) {
        System.out.println("\nТест дубликатов:");
        System.out.println("Дубликатов в " + withDupes + " -> " + ops.countDuplicatesString(withDupes));

        System.out.println("\nОбъединение:");
        System.out.println(list1 + " ∪ " + list2 + " = " + ops.unionOfStringLists(list1, list2));

        System.out.println("\nПересечение:");
        System.out.println(list1 + " ∩ " + list2 + " = " + ops.intersectionOfStringLists(list1, list2));

        System.out.println("\nРазность:");
        System.out.println(list1 + " ∖ " + list2 + " = " + ops.differenceOfStringLists(list1, list2));

        System.out.println("\nПроверка уникальности:");
        System.out.println("Уникальны ли " + list1 + "? -> " + (ops.areStringElementsUnique(list1)? "Да" : "Нет"));
        System.out.println("Уникальны ли " + withDupes + "? -> " + (ops.areStringElementsUnique(withDupes)? "Да" : "Нет"));
    }
}
