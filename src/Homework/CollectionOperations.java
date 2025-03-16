package Homework;

import java.util.*;

public class CollectionOperations implements IntegerCollectionOperations, StringCollectionOperations {

    // Реализация методов для целых чисел
    @Override
    public int countDuplicatesInteger(List<Integer> list) {
        Set<Integer> uniqueElements = new HashSet<>(list);
        return list.size() - uniqueElements.size();
    }

    @Override
    public List<Integer> unionOfIntegerLists(List<Integer> list1, List<Integer> list2) {
        Set<Integer> resultSet = new HashSet<>(list1);
        resultSet.addAll(list2);
        return new ArrayList<>(resultSet);
    }

    @Override
    public List<Integer> intersectionOfIntegerLists(List<Integer> list1, List<Integer> list2) {
        Set<Integer> set1 = new HashSet<>(list1);
        set1.retainAll(list2);
        return new ArrayList<>(set1);
    }

    @Override
    public List<Integer> differenceOfIntegerLists(List<Integer> list1, List<Integer> list2) {
        Set<Integer> resultSet = new HashSet<>(list1);
        resultSet.removeAll(list2);
        return new ArrayList<>(resultSet);
    }

    @Override
    public boolean areIntegerElementsUnique(List<Integer> list) {
        return list.size() == new HashSet<>(list).size();
    }

    // Реализация методов для строк
    @Override
    public int countDuplicatesString(List<String> list) {
        Set<String> uniqueElements = new HashSet<>(list);
        return list.size() - uniqueElements.size();
    }

    @Override
    public List<String> unionOfStringLists(List<String> list1, List<String> list2) {
        Set<String> resultSet = new HashSet<>(list1);
        resultSet.addAll(list2);
        return new ArrayList<>(resultSet);
    }

    @Override
    public List<String> intersectionOfStringLists(List<String> list1, List<String> list2) {
        Set<String> set1 = new HashSet<>(list1);
        set1.retainAll(list2);
        return new ArrayList<>(set1);
    }

    @Override
    public List<String> differenceOfStringLists(List<String> list1, List<String> list2) {
        Set<String> resultSet = new HashSet<>(list1);
        resultSet.removeAll(list2);
        return new ArrayList<>(resultSet);
    }

    @Override
    public boolean areStringElementsUnique(List<String> list) {
        return list.size() == new HashSet<>(list).size();
    }
}
