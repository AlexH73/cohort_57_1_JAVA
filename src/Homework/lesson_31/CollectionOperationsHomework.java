package Homework.lesson_31;

import java.util.List;

public interface CollectionOperationsHomework {
    // Методы для работы с числами
    int countDuplicatesInteger(List<Integer> list);
    List<Integer> unionOfIntegerLists(List<Integer> list1, List<Integer> list2);
    List<Integer> intersectionOfIntegerLists(List<Integer> list1, List<Integer> list2);
    List<Integer> differenceOfIntegerLists(List<Integer> list1, List<Integer> list2);
    boolean areIntegerElementsUnique(List<Integer> list);

    // Методы для работы со строками
    int countDuplicatesString(List<String> list);
    List<String> unionOfStringLists(List<String> list1, List<String> list2);
    List<String> intersectionOfStringLists(List<String> list1, List<String> list2);
    List<String> differenceOfStringLists(List<String> list1, List<String> list2);
    boolean areStringElementsUnique(List<String> list);
}
