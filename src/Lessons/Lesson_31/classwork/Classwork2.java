package Lessons.Lesson_31.classwork;

import java.util.*;

public class Classwork2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        setElements(list);
        setElements(set);

        System.out.println("list.size() = " + list.size());
        System.out.println("set.size() = " + set.size());

        iterCollection(set);
        iterCollection(list);
    }

    private static Collection<Integer> setElements(Collection<Integer> collection) {
        collection.add(1);
        collection.add(1);
        collection.add(1);

        collection.add(2);
        collection.add(2);
        collection.add(2);

        collection.add(3);
        collection.add(3);
        collection.add(3);

        collection.add(4);

        return collection;
    }

    private static void iterCollection(Collection<Integer> collection) {
        for (Object o : collection.toArray()) {
            System.out.print(o + " ");
        }
        System.out.println();
    }
}
