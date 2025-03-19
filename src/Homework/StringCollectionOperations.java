package Homework;

import java.util.List;

public interface StringCollectionOperations {
    int countDuplicatesString(List<String> list);
    List<String> unionOfStringLists(List<String> list1, List<String> list2);
    List<String> intersectionOfStringLists(List<String> list1, List<String> list2);
    List<String> differenceOfStringLists(List<String> list1, List<String> list2);
    boolean areStringElementsUnique(List<String> list);
}