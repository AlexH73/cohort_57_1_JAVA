package Homework;

import java.util.List;

public interface IntegerCollectionOperations {
    int countDuplicatesInteger(List<Integer> list);
    List<Integer> unionOfIntegerLists(List<Integer> list1, List<Integer> list2);
    List<Integer> intersectionOfIntegerLists(List<Integer> list1, List<Integer> list2);
    List<Integer> differenceOfIntegerLists(List<Integer> list1, List<Integer> list2);
    boolean areIntegerElementsUnique(List<Integer> list);
}
