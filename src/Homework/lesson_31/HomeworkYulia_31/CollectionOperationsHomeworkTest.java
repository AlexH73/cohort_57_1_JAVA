package Homework.lesson_31.HomeworkYulia_31;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

/**
 * Интерфейс для выполнения операций над коллекциями Set и List.
 * Студенты должны реализовать этот интерфейс, используя базовые операции (например, add, addAll)
 * для решения задач, связанных с дубликатами и операциями над множествами.
 * <p>
 * Примеры тестовых данных:
 * - Строки: "Apple", "Banana", "Cherry".
 * - Числа: 1, 2, 3, 4.
 */

public class CollectionOperationsHomeworkTest {
    public static void testCountDuplicatesInteger() {
        List<Integer> storage = new ArrayList<>();
        storage.add(1);
        storage.add(2);
        storage.add(3);
        storage.add(1);
        storage.add(1);

        int expectedResult = 3;

        CollectionOperationsHomework listOperations = new CollectionOperationsHomeworkImpl();
        int actualResult = listOperations.countDuplicatesInteger(storage);

        if (actualResult == expectedResult) {
            System.out.println("Тест countDuplicatesInteger пройден успешно!");
        } else {
            System.out.println("Тест countDuplicatesInteger не пройден!");
        }
    }


    public static void testUnionOfIntegerLists() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);

        List<Integer> expectedResult = Arrays.asList(1, 2, 3, 4, 5);

        CollectionOperationsHomework listOperations = new CollectionOperationsHomeworkImpl();
        List<Integer> actualResult = listOperations.unionOfIntegerLists(list1, list2);

        if (actualResult.containsAll(expectedResult)) {
            System.out.println("Тест unionOfIntegerLists пройден успешно!");
        } else {
            System.out.println("Тест unionOfIntegerLists не пройден!");
        }
    }


    public static void testIntersectionOfIntegerLists() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);
        list2.add(4);

        List<Integer> expectedResult = Arrays.asList(2, 3);

        CollectionOperationsHomework listOperations = new CollectionOperationsHomeworkImpl();
        List<Integer> actualResult = listOperations.intersectionOfIntegerLists(list1, list2);

        if (actualResult.containsAll(expectedResult)) {
            System.out.println("Тест intersectionOfIntegerLists пройден успешно!");
        } else {
            System.out.println("Тест intersectionOfIntegerLists не пройден!");
        }
    }


    public static void testDifferenceOfIntegerLists() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);

        List<Integer> expectedResult = Arrays.asList(1);

        CollectionOperationsHomework listOperations = new CollectionOperationsHomeworkImpl();
        List<Integer> actualResult = listOperations.differenceOfIntegerLists(list1, list2);

        if (actualResult.containsAll(expectedResult)) {
            System.out.println("Тест differenceOfIntegerLists пройден успешно!");
        } else {
            System.out.println("Тест differenceOfIntegerLists не пройден!");
        }
    }


    public static void testAreIntegerElementsUnique() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        boolean expectedResult1 = true;

        CollectionOperationsHomework listOperations = new CollectionOperationsHomeworkImpl();
        boolean actualResult1 = listOperations.areIntegerElementsUnique(list1);

        if (actualResult1 == expectedResult1) {
            System.out.println("Тест areIntegerElementsUnique пройден успешно!");
        } else {
            System.out.println("Тест areIntegerElementsUnique не пройден!");
        }

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(1);

        boolean expectedResult2 = false;

        boolean actualResult2 = listOperations.areIntegerElementsUnique(list2);

        if (actualResult2 == expectedResult2) {
            System.out.println("Тест areIntegerElementsUnique пройден успешно!");
        } else {
            System.out.println("Тест areIntegerElementsUnique не пройден!");
        }
    }


    public static void testCountDuplicatesString() {
        List<String> storage = new ArrayList<>();
        storage.add("Banana");
        storage.add("Banana2");
        storage.add("Banana3");
        storage.add("Banana");
        storage.add("Banana");

        int expectedResult = 3;

        CollectionOperationsHomework listOperations = new CollectionOperationsHomeworkImpl();
        int actualResult = listOperations.countDuplicatesString(storage);

        if (actualResult == expectedResult) {
            System.out.println("Тест countDuplicatesString пройден успешно!");
        } else {
            System.out.println("Тест countDuplicatesString не пройден!");
        }
    }


    public static void testUnionOfStringLists() {
        List<String> list1 = new ArrayList<>();
        list1.add("apple");
        list1.add("banana");
        list1.add("cherry");

        List<String> list2 = new ArrayList<>();
        list2.add("banana");
        list2.add("cherry");
        list2.add("date");

        List<String> expectedResult = Arrays.asList("apple", "banana", "cherry", "date");

        CollectionOperationsHomework listOperations = new CollectionOperationsHomeworkImpl();
        List<String> actualResult = listOperations.unionOfStringLists(list1, list2);

        if (actualResult.containsAll(expectedResult)) {
            System.out.println("Тест unionOfStringLists пройден успешно!");
        } else {
            System.out.println("Тест unionOfStringLists не пройден!");
        }
    }


    public static void testIntersectionOfStringLists() {
        List<String> list1 = new ArrayList<>();
        list1.add("apple");
        list1.add("banana");
        list1.add("cherry");

        List<String> list2 = new ArrayList<>();
        list2.add("banana");
        list2.add("cherry");
        list2.add("date");

        List<String> expectedResult = Arrays.asList("banana", "cherry");

        CollectionOperationsHomework listOperations = new CollectionOperationsHomeworkImpl();
        List<String> actualResult = listOperations.intersectionOfStringLists(list1, list2);

        if (actualResult.containsAll(expectedResult)) {
            System.out.println("Тест intersectionOfStringLists пройден успешно!");
        } else {
            System.out.println("Тест intersectionOfStringLists не пройден!");
        }
    }


    public static void testDifferenceOfStringLists() {
        List<String> list1 = new ArrayList<>();
        list1.add("apple");
        list1.add("banana");
        list1.add("cherry");

        List<String> list2 = new ArrayList<>();
        list2.add("banana");
        list2.add("cherry");

        List<String> expectedResult = Arrays.asList("apple");

        CollectionOperationsHomework listOperations = new CollectionOperationsHomeworkImpl();
        List<String> actualResult = listOperations.differenceOfStringLists(list1, list2);

        if (actualResult.containsAll(expectedResult)) {
            System.out.println("Тест differenceOfStringLists пройден успешно!");
        } else {
            System.out.println("Тест differenceOfStringLists не пройден!");
        }
    }


    public static void testAreStringElementsUnique() {
        List<String> list1 = new ArrayList<>();
        list1.add("apple");
        list1.add("banana");
        list1.add("cherry");

        boolean expectedResult1 = true;

        CollectionOperationsHomework listOperations = new CollectionOperationsHomeworkImpl();
        boolean actualResult1 = listOperations.areStringElementsUnique(list1);

        if (actualResult1 == expectedResult1) {
            System.out.println("Тест areStringElementsUnique пройден успешно!");
        } else {
            System.out.println("Тест areStringElementsUnique не пройден!");
        }

        List<String> list2 = new ArrayList<>();
        list2.add("apple");
        list2.add("banana");
        list2.add("apple");

        boolean expectedResult2 = false;

        boolean actualResult2 = listOperations.areStringElementsUnique(list2);

        if (actualResult2 == expectedResult2) {
            System.out.println("Тест areStringElementsUnique пройден успешно!");
        } else {
            System.out.println("Тест areStringElementsUnique не пройден!");
        }
    }
}




