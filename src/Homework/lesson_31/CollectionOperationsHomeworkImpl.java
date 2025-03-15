package Homework.lesson_31;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionOperationsHomeworkImpl implements CollectionOperationsHomework {

    // Реализация методов для Integer
    @Override
    public boolean areIntegerElementsUnique(List<Integer> list) {
        // Вызов метода валидации на null
        // Это просто как идея, можно так же внедрить во все методы.
        validateInput(list);
        return new HashSet<>(list).size() == list.size();
    }

    @Override
    public int countDuplicatesInteger(List<Integer> list) {
        return list.size() - new HashSet<>(list).size();
    }

    @Override
    public List<Integer> unionOfIntegerLists(List<Integer> list1, List<Integer> list2) {
        Set<Integer> union = new HashSet<>(list1);
        union.addAll(list2);
        return new ArrayList<>(union);
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

    // Реализация методов для String
    @Override
    public int countDuplicatesString(List<String> list) {
        return list.size() - new HashSet<>(list).size();
    }

    @Override
    public List<String> unionOfStringLists(List<String> list1, List<String> list2) {
        Set<String> union = new HashSet<>(list1);
        union.addAll(list2);
        return new ArrayList<>(union);
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
        validateInput(list);
        return new HashSet<>(list).size() == list.size();
    }

    // Валидация на null
    private void validateInput(List<?> list) {
        if (list == null) {
            throw new IllegalArgumentException("Входной список не должен быть null");
        }
    }
}
