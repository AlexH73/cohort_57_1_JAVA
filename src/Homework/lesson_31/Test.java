package Homework.lesson_31;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        CollectionOperationsHomework operations = new CollectionOperations();
        List<Integer> numbers1 = new ArrayList<>();
        List<Integer> numbers2 = new ArrayList<>();
        List<String> words1 = new ArrayList<>();
        List<String> words2 = new ArrayList<>();

        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);
        numbers1.add(4);
        numbers1.add(2);
        numbers1.add(3);

        numbers2.add(1);
        numbers2.add(2);
        numbers2.add(3);
        numbers2.add(4);

        System.out.println("Duplicates in numbers1: " + operations.countDuplicatesInteger(numbers1));
        System.out.println("Duplicates in numbers2: " + operations.countDuplicatesInteger(numbers2));
        System.out.println("Union of numbers1 and numbers2: " + operations.unionOfIntegerLists(numbers1, numbers2));
        System.out.println("Intersection of numbers1 and numbers2: " + operations.intersectionOfIntegerLists(numbers1, numbers2));
        System.out.println("Difference of numbers1 and numbers2: " + operations.differenceOfIntegerLists(numbers1, numbers2));
        System.out.println("Are elements in numbers1 unique? " + operations.areIntegerElementsUnique(numbers1));
        System.out.println("Are elements in numbers2 unique? " + operations.areIntegerElementsUnique(numbers2));
        System.out.println("------------------------------------------------------------");

        words1.add("Apple");
        words1.add("Banana");
        words1.add("Cherry");
        words1.add("Apple");

        words2.add("Banana");
        words2.add("Cherry");
        words2.add("Syshi");

        System.out.println("Duplicates in words1: " + operations.countDuplicatesString(words1));
        System.out.println("Duplicates in words2: " + operations.countDuplicatesString(words2));
        System.out.println("Union of words1 and words2: " + operations.unionOfStringLists(words1, words2));
        System.out.println("Intersection of words1 and words2: " + operations.intersectionOfStringLists(words1, words2));
        System.out.println("Defference of words1 and words2: " + operations.differenceOfStringLists(words1, words2));
        System.out.println("Are elements in numbers1 unique? " + operations.areStringElementsUnique(words1));
        System.out.println("Are elements in numbers2 unique? " + operations.areStringElementsUnique(words2));

    }
}
