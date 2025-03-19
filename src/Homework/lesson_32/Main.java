package Homework.lesson_32;

import  java.util.*;

public class Main {
    public static void main(String[] args) {
        CollectionOperationsImpl operations = new CollectionOperationsImpl();

        List<Integer> numbers1 = Arrays.asList(1, 2, 2, 3, 4, 4, 4, 5);
        List<Integer> numbers2 = Arrays.asList(3, 4, 5, 6, 7, 8);

        System.out.println("Количество дубликатов в списке чисел: " + operations.countDuplicatesInteger(numbers1));
        System.out.println("Объединение двух списков чисел: " + operations.unionOfIntegerLists(numbers1, numbers2));
        System.out.println("Пересечение двух списков чисел: " + operations.intersectionOfIntegerLists(numbers1, numbers2));
        System.out.println("Разность двух списков чисел (numbers1 - numbers2): " + operations.differenceOfIntegerLists(numbers1, numbers2));
        System.out.println("Содержит ли список чисел только уникальные элементы: " + operations.areIntegerElementsUnique(numbers1));


        List<String> fruits1 = Arrays.asList("Apple", "Banana", "Cherry", "Apple", "Banana");
        List<String> fruits2 = Arrays.asList("Cherry", "Mango", "Banana", "Peach");

        System.out.println("Количество дубликатов в списке фруктов: " + operations.countDuplicatesString(fruits1));
        System.out.println("Объединение двух списков фруктов: " + operations.unionOfStringLists(fruits1, fruits2));
        System.out.println("Пересечение двух списков фруктов: " + operations.intersectionOfStringLists(fruits1, fruits2));
        System.out.println("Разность двух списков фруктов (fruits1 - fruits2): " + operations.differenceOfStringLists(fruits1, fruits2));
        System.out.println("Содержит ли список фруктов только уникальные элементы: " + operations.areStringElementsUnique(fruits1));
    }
}