package Homework.lesson_31;

import java.util.Arrays;
import java.util.List;

public class CollectionOperationsHomeworkUsage {
    public static void main(String[] args) {
        CollectionOperationsHomeworkImpl operations = new CollectionOperationsHomeworkImpl();

        List<Integer> intList1 = Arrays.asList(1,2,3,4,1,2,3);
        List<Integer> intList2 = Arrays.asList(3,4,5,6);

        System.out.println("Количество дубликатов в intList1: " + operations.countDuplicatesInteger(intList1));
        System.out.println("Объединение intList1 и intList2: " + operations.intersectionOfIntegerList(intList1, intList2));
        System.out.println("Пересечение intList1 и intList2: " + operations.unionOfIntegerList(intList1, intList2));
        System.out.println("Разность intList1 и intList2: " + operations.differenceOfIntegerList(intList1,intList2));
        System.out.println("Проверка все ли элементы intList1 уникальны? " + operations.areIntegerElementsUnique(intList1));

        List<String> strList1 = Arrays.asList("Apple", "Banana", "Cherry", "Apple");
        List<String> strList2 = Arrays.asList("Banana", "Chery", "Date");

        System.out.println("Количество дубликатов в intList1: " + operations.countDuplicatesString(strList1));
        System.out.println("Объединение intList1 и intList2: " + operations.intersectionOfStringList(strList1, strList2));
        System.out.println("Пересечение intList1 и intList2: " + operations.unionOfStringList(strList1, strList2));
        System.out.println("Разность intList1 и intList2: " + operations.differenceOfStringList(strList1, strList2));
        System.out.println("Проверка все ли элементы intList1 уникальны? " + operations.areStringElementsUnique(strList1));




    }
}
