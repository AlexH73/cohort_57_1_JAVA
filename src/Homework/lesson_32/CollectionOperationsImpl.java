package Homework.lesson_32;

import java.util.*;

public class CollectionOperationsImpl implements  CollectionOperationsHomework{

    @Override
    public int countDuplicatesInteger(List<Integer>list) {
        Set<Integer> uniqueNumbers = new HashSet<>(list);
        return list.size() - uniqueNumbers.size();
    }

    @Override

    public List<Integer>unionOfIntegerLists(List<Integer> list1, List<Integer>list2)  {
        Set<Integer>resultSet = new HashSet<>(list1);
        resultSet.addAll(list2);
        return new ArrayList<>(resultSet);
    }

    @Override

    public List<Integer> intersectionOfIntegerLists(List<Integer> list1, List<Integer>list2)  {
        Set<Integer>resultSet = new HashSet<>(list1);
        resultSet.retainAll(list2);
        return new ArrayList<>(resultSet);
    }

    @Override

    public List<Integer> differenceOfIntegerLists(List<Integer>list1, List<Integer>list2)  {
        Set<Integer>resultSet = new HashSet<>(list1);
        resultSet.removeAll(list2);
        return new ArrayList<>(resultSet);
    }

    @Override
    public boolean areIntegerElementsUnique(List<Integer> list) {
        return list.size() == new HashSet<>(list).size();
    }

    @Override
    public int countDuplicatesString(List<String> list) {
        Set<String> uniqueStrings = new HashSet<>(list);
        return list.size() - uniqueStrings.size();
    }

    @Override
    public List<String> unionOfStringLists(List<String> list1, List<String>list2) {
        Set<String> resultSet = new HashSet<>(list1);
        resultSet.addAll(list2);
        return new ArrayList<>(resultSet);
    }
    @Override
    public List<String>intersectionOfStringLists(List<String>list1, List<String>list2)  {
        Set<String>resultSet = new HashSet<>(list1);
        resultSet.retainAll(list2);
        return new ArrayList<>(resultSet);
    }
    @Override
    public List<String>differenceOfStringLists(List<String>list1, List<String>list2)  {
        Set<String>resultSet = new HashSet<>(list1);
        resultSet.removeAll(list2);
        return new ArrayList<>(resultSet);
    }
    @Override
    public boolean areStringElementsUnique(List<String> list) {
        return list.size() == new HashSet<>(list).size();
    }
}

