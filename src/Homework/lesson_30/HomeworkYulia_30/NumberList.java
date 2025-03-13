package Homework.lesson_30.HomeworkYulia_30;

import java.util.ArrayList;

public class NumberList {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<>();

        arrayList.add(50);
        arrayList.add(80);
        arrayList.add(90);
        System.out.println("Список чисел: " + arrayList);

        arrayList.remove(2);
        System.out.println("После удаления элемента с индексом 2: " + arrayList);

        arrayList.set(1, 7);
        System.out.println("После обновления элемента с индексом 1: " + arrayList);

        boolean contains20 = arrayList.contains(20);
        System.out.println("Список содержит число 20: " + contains20);

        System.out.println("Размер списка: " + arrayList.size());

        arrayList.clear();
        System.out.println("Список после очищения: " + arrayList);
    }
}
