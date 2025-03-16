package Homework.lesson_31.HomeworkYulia_31;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class CollectionOperationsHomeworkImpl implements CollectionOperationsHomework {

    // Методы для работы с числами

    @Override
    public int countDuplicatesInteger(List<Integer> list) {
        Set<Integer> uniqueElements = new HashSet<>(list);
        return list.size() - uniqueElements.size();
    }

    @Override
    public List<Integer> unionOfIntegerLists(List<Integer> list1, List<Integer> list2) {
        Set<Integer> set = new HashSet<>(list1);
        set.addAll(list2);
        return new ArrayList<>(set);
    }

    @Override
    public List<Integer> intersectionOfIntegerLists(List<Integer> list1, List<Integer> list2) {
        Set<Integer> set1 = new HashSet<>(list1);
        set1.retainAll(list2);
        return new ArrayList<>(set1);
    }

    @Override
    public List<Integer> differenceOfIntegerLists(List<Integer> list1, List<Integer> list2) {
        Set<Integer> set1 = new HashSet<>(list1);
        set1.removeAll(list2);
        return new ArrayList<>(set1);
    }

    @Override
    public boolean areIntegerElementsUnique(List<Integer> list) {
        return new HashSet<>(list).size() == list.size();
    }






    // Методы для работы со строками

    @Override
    public int countDuplicatesString(List<String> list) {
        Set<String> uniqueElements = new HashSet<>(list);
        return list.size() - uniqueElements.size();
    }

    @Override
    public List<String> unionOfStringLists(List<String> list1, List<String> list2) {
        Set<String> set = new HashSet<>(list1);
        set.addAll(list2);
        return new ArrayList<>(set);
    }

    @Override
    public List<String> intersectionOfStringLists(List<String> list1, List<String> list2) {
        Set<String> set1 = new HashSet<>(list1);
        set1.retainAll(list2);
        return new ArrayList<>(set1);
    }

    @Override
    public List<String> differenceOfStringLists(List<String> list1, List<String> list2) {
        Set<String> set1 = new HashSet<>(list1);
        set1.removeAll(list2);
        return new ArrayList<>(set1);
    }

    @Override
    public boolean areStringElementsUnique(List<String> list) {
        return new HashSet<>(list).size() == list.size();
    }
}
