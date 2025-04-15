package Lessons.Lesson_40.src.practice;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        long startTimeHashSet = System.nanoTime();

        for (int i = 0; i < 1_000_000; i++) {
            int num = rand.nextInt(10_000);// числа от 0 до 999
            if (!hashSet.contains(num))
                hashSet.add(num);
        }

        long endTimeHashSet = System.nanoTime();
        System.out.println(String.format("Time taken with HashSet:       %012d ns", endTimeHashSet - startTimeHashSet));

        long startTimeTreeSet = System.nanoTime();

        for (int i = 0; i < 1_000_000; i++) {
            int num = rand.nextInt(10_000);// числа от 0 до 999
            if (!treeSet.contains(num))
                treeSet.add(num);
        }

        long endTimeTreeSet = System.nanoTime();
        System.out.println(String.format("Time taken with TreeSet:       %012d ns", endTimeTreeSet - startTimeTreeSet));

        long startTimeLinkedHashSet = System.nanoTime();

        for (int i = 0; i < 1_000_000; i++) {
            int num = rand.nextInt(10_000);// числа от 0 до 999
            if (!linkedHashSet.contains(num))
                linkedHashSet.add(num);
        }

        long endTimeLinkedHashSet = System.nanoTime();
        System.out.println(String.format("Time taken with LinkedHashSet: %012d ns", endTimeLinkedHashSet - startTimeLinkedHashSet));


        // Добавляем только уникальные числа в лист
        long startTimeArrayList = System.nanoTime();

        for (int i = 0; i < 1_000_000; i++) {
            int num = rand.nextInt(10_000);// числа от 0 до 999
            if(!arrayList.contains(num))
                arrayList.add(num);
        }
        long endTimeArrayList = System.nanoTime();
        System.out.println(String.format("Time taken with ArrayList:     %012d ns", endTimeArrayList - startTimeArrayList));


        // Добавляем только уникальные числа в лист
        long startTimeLinkedList = System.nanoTime();

        for (int i = 0; i < 1_000_000; i++) {
            int num = rand.nextInt(10_000);// числа от 0 до 999
            if(!linkedList.contains(num))
                linkedList.add(num);
        }
        long endTimeLinkedList = System.nanoTime();
        System.out.println(String.format("Time taken with LinkedList:    %012d ns", endTimeLinkedList - startTimeLinkedList));
    }
}

