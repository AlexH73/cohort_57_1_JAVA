package Homework.lesson_30;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPerformance {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        int elementsCount = 100000; //количество элементов

        //Заполняем списки элементами
        for (int i = 0; i < elementsCount; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
        System.out.println("Сравнение ArrayList и LinkedList:");

        // 1. Получение элемента из середины списка
        System.out.println("\nПолучение элемента по индексу:");

        long start = System.currentTimeMillis();
        arrayList.get(elementsCount / 2);
        long end = System.currentTimeMillis();
        System.out.println("ArrayList: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        linkedList.get(elementsCount / 2);
        end = System.currentTimeMillis();
        System.out.println("LinkedList: " + (end - start) + " ms");

        // 2. Вставка элемента в середину списка
        System.out.println("\nВставка элемента в середину:");

        start =System.currentTimeMillis();
        arrayList.add(elementsCount / 2, -1);
        end = System.currentTimeMillis();
        System.out.println("ArrayList: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        linkedList.add(elementsCount /2, -1);
        end = System.currentTimeMillis();
        System.out.println("LinkedList: " + (end - start) + " ms");

        // 3. Удаление элемента из середины списка
        System.out.println("\nУдаление элемента из середины:");

        start = System.currentTimeMillis();
        arrayList.remove(elementsCount / 2);
        end = System.currentTimeMillis();
        System.out.println("ArrayList: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        linkedList.remove(elementsCount / 2);
        end = System.currentTimeMillis();
        System.out.println("LinkedList: " + (end - start) + " ms");
    }
}























