package Homework.lesson_31;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionOperationsHomeworkImpl implements CollectionOperationsHomework {

    @Override
    public int countDuplicatesInteger(List<Integer> list) {
        Set<Integer> uniqueSet = new HashSet<>(list);
        return list.size() - uniqueSet.size();
    }

    @Override
    public List<Integer> unionOfIntegerLists(List<Integer> list1, List<Integer> list2) {
        return List.of();
    }

    @Override
    public List<Integer> intersectionOfIntegerLists(List<Integer> list1, List<Integer> list2) {
        return List.of();
    }

    @Override
    public List<Integer> differenceOfIntegerLists(List<Integer> list1, List<Integer> list2) {
        return List.of();
    }

    @Override
    public List<Integer> intersectionOfIntegerList(List<Integer> list1, List<Integer> list2) {
        Set<Integer> unionSet = new HashSet<>(list1);
        unionSet.addAll(list2);
        return new ArrayList<>(unionSet);
    }

    @Override
    public List<Integer> unionOfIntegerList(List<Integer> list1, List<Integer> list2) {
        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);
        set1.retainAll(set2);
        return new ArrayList<>(set1);
    }

    @Override
    public List<Integer> differenceOfIntegerList(List<Integer> list1, List<Integer> list2) {
        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);
        set1.removeAll(set2);
        return new ArrayList<>(set1);
    }

    @Override
    public boolean areIntegerElementsUnique(List<Integer> list) {
        Set<Integer> uniqueSet = new HashSet<>(list);
        return list.size() == uniqueSet.size();
    }

    @Override
    public int countDuplicatesString(List<String> list) {
        Set<String> uniqueSet = new HashSet<>(list);
        return list.size() - uniqueSet.size();
    }

    @Override
    public List<String> unionOfStringLists(List<String> list1, List<String> list2) {
        return List.of();
    }

    @Override
    public List<String> intersectionOfStringLists(List<String> list1, List<String> list2) {
        return List.of();
    }

    @Override
    public List<String> differenceOfStringLists(List<String> list1, List<String> list2) {
        return List.of();
    }

    @Override
    public List<String> intersectionOfStringList(List<String> list1, List<String> list2) {
        Set<String> unionSet = new HashSet<>(list1);
        unionSet.addAll(list2);
        return new ArrayList<>(unionSet);
    }

    @Override
    public List<String> unionOfStringList(List<String> list1, List<String> list2) {
        Set<String> set1 = new HashSet<>(list1);
        Set<String> set2 = new HashSet<>(list2);
        set1.retainAll(set2);
        return new ArrayList<>(set1);
    }

    @Override
    public List<String> differenceOfStringList(List<String> list1, List<String> list2) {
        Set<String> set1 = new HashSet<>(list1);
        Set<String> set2 = new HashSet<>(list2);
        set1.removeAll(set2);
        return new ArrayList<>(set1);
    }

    @Override
    public boolean areStringElementsUnique(List<String> list) {
        Set<String> uniqueSet = new HashSet<>(list);
        return list.size() == uniqueSet.size();
    }

}


