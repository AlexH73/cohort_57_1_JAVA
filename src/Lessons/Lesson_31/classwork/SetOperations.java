package Lessons.Lesson_31.classwork;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static void main(String[] args) {
        // Создаем первый HashSet и заполняем его элементами
        Set<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Cherry");
        set1.add("Apple"); // Дубликат: не будет добавлен

        System.out.println("Содержимое set1: " + set1);

        // Проверка наличия элемента "Banana"
        if (set1.contains("Banana")) {
            System.out.println("Элемент 'Banana' найден в set1.");
        }

        // Удаление элемента "Cherry"
        set1.remove("Cherry");
        System.out.println("После удаления 'Cherry' из set1: " + set1);

        // Добавление нескольких элементов с помощью addAll
        Set<String> additional = new HashSet<>();
        additional.add("Date");
        additional.add("Elderberry");
        set1.addAll(additional);
        System.out.println("После добавления дополнительных элементов в set1: " + set1);

        // Итерация по элементам set1
        System.out.println("Итерация по элементам set1:");
        for (String fruit : set1) {
            System.out.println(fruit);
        }

        // Вывод размера set1
        System.out.println("Размер set1: " + set1.size());

        // Создаем второй HashSet для демонстрации операций пересечения, разности и проверки
        Set<String> set2 = new HashSet<>();
        set2.add("Banana");
        set2.add("Date");
        set2.add("Fig");
        System.out.println("\nСодержимое set2: " + set2);

        // Пересечение set1 и set2 (оставляем только общие элементы)
        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Пересечение set1 и set2: " + intersection);

        // Разность set1 и set2 (удаляем из set1 все элементы, присутствующие в set2)
        Set<String> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Разность set1 - set2 (элементы из set1, которых нет в set2): " + difference);

        // Проверка, содержатся ли все элементы set2 в set1
        boolean containsAll = set1.containsAll(set2);
        System.out.println("Содержит ли set1 все элементы set2? " + containsAll);

        // Объединение set1 и set2 (union) - все уникальные элементы из обоих наборов
        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Объединение set1 и set2: " + union);
    }
}