package Homework.lesson_30;

import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(11);
        numbers.add(22);
        numbers.add(33);
        numbers.add(44);
        numbers.add(55);
        numbers.add(66);

        System.out.println("Список: " + numbers);

        numbers.remove(2);
        System.out.println("Список после удаления элемента: " + numbers);

        // Обновление значения элемента по индексу
        numbers.set(1, 25);
        System.out.println("Список после обновления: " + numbers);

        // Содержит ли список определённое число
        boolean contains = numbers.contains(27);
        System.out.println("Список содержит число 27: " + contains);

        int size = numbers.size();
        System.out.println("Размер списка: " + size);

        numbers.clear();
        System.out.println("Список после очистки: " + numbers);
    }
}

