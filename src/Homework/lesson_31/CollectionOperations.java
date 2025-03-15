package Homework.lesson_31;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionOperations implements CollectionOperationsHomework {

    //Подсчет количества дубликатов вычисляется как разница между размером списка и
    // размером множества (list.size()- uniqueElements.size()).
    @Override
    public int countDuplicatesInteger(List<Integer> list) {
        Set<Integer> uniqueElements = new HashSet<>(list);
        return list.size() - uniqueElements.size();
    }

    //Возвращает объединение двух списков целых чисел, содержащее только уникальные элементы.
    //С помощью addAll(list2) добавляются элементы list2. Set удаляет дубликаты автоматически.
    @Override
    public List<Integer> unionOfIntegerLists(List<Integer> list1, List<Integer> list2) {
        Set<Integer> unionSet = new HashSet<>(list1);
        unionSet.addAll(list2);
        return new ArrayList<>(unionSet);
    }

    //Возвращает пересечение двух списков целых чисел.Метод retainAll(list2) оставляет только те
    // элементы,которые есть в list2 (то есть выполняет пересечение множеств).
    @Override
    public List<Integer> intersectionOfIntegerLists(List<Integer> list1, List<Integer> list2) {
        Set<Integer> set1 = new HashSet<>(list1);
        set1.retainAll(list2);
        return new ArrayList<>(set1);
    }

    //Проверяет, содержатся ли в списке целых чисел только уникальные элементы.
    //Метод removeAll(list2) удаляет все элементы, которые есть в list2
    @Override
    public List<Integer> differenceOfIntegerLists(List<Integer> list1, List<Integer> list2) {
        Set<Integer> set1 = new HashSet<>(list1);
        set1.removeAll(list2);
        return new ArrayList<>(set1);
    }

    //Проверяет, содержатся ли в списке целых чисел только уникальные элементы.
    //new HashSet<>(list).size() — количество уникальных элементов.
    @Override
    public boolean areIntegerElementsUnique(List<Integer> list) {
        return list.size() == new HashSet<>(list).size();
    }

    //Определяет количество дубликатов в списке строк.
    @Override
    public int countDuplicatesString(List<String> list) {
        Set<String> uniqueElements = new HashSet<>(list);
        return list.size() - uniqueElements.size();
    }

    //Возвращает объединение двух списков строк, содержащее только уникальные элементы.
    @Override
    public List<String> unionOfStringLists(List<String> list1, List<String> list2) {
        Set<String> unionSet = new HashSet<>(list1);
        unionSet.addAll(list2);
        return new ArrayList<>(unionSet);
    }

    //Возвращает пересечение двух списков строк.
    @Override
    public List<String> intersectionOfStringLists(List<String> list1, List<String> list2) {
        Set<String> set1 = new HashSet<>(list1);
        set1.retainAll(list2);
        return new ArrayList<>(set1);
    }

    //Возвращает разность двух списков строк (элементы из list1, которых нет в list2).
    @Override
    public List<String> differenceOfStringLists(List<String> list1, List<String> list2) {
        Set<String> set1 = new HashSet<>(list1);
        set1.removeAll(list2);
        return new ArrayList<>(set1);
    }

    //Проверяет, содержатся ли в списке строк только уникальные элементы.
    @Override
    public boolean areStringElementsUnique(List<String> list) {
        return list.size() == new HashSet<>(list).size();
    }
}
