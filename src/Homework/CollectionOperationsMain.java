package Homework;

import java.util.Arrays;
import java.util.List;

public class CollectionOperationsMain {
    public static void main(String[] args) {
        CollectionOperations operations = new CollectionOperations();

        System.out.println("Тест для целых чисел:");

        List<Integer> integerList1 = Arrays.asList(1, 2, 3, 4, 1, 2);
        List<Integer> integerList2 = Arrays.asList(3, 4, 5, 6);

        System.out.println("Количество дубликатов: " + operations.countDuplicatesInteger(integerList1));
        System.out.println("Объединение: " + operations.unionOfIntegerLists(integerList1, integerList2));
        System.out.println("Пересечение: " + operations.intersectionOfIntegerLists(integerList1, integerList2));
        System.out.println("Разница: " + operations.differenceOfIntegerLists(integerList1, integerList2));
        System.out.println("Уникальность: " + operations.areIntegerElementsUnique(integerList1));

        System.out.println("\nТест для строк:");

        List<String> stringList1 = Arrays.asList("Apple", "Banana", "Cherry", "Apple");
        List<String> stringList2 = Arrays.asList("Banana", "Cherry", "Date", "Apple");

        System.out.println("Количество дубликатов: " + operations.countDuplicatesString(stringList1));
        System.out.println("Объединение: " + operations.unionOfStringLists(stringList1, stringList2));
        System.out.println("Пересечение: " + operations.intersectionOfStringLists(stringList1, stringList2));
        System.out.println("Разница: " + operations.differenceOfStringLists(stringList1, stringList2));
        System.out.println("Уникальность: " + operations.areStringElementsUnique(stringList1));
    }
}
