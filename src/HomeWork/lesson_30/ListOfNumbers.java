package Homework.lesson_30;

import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers {
    public static void main(String[] args) {
        // Создание списка чисел
        List<Integer> numbers = new ArrayList<Integer>();

        // Добавление элементов в список
        numbers.add(11);
        numbers.add(22);
        numbers.add(33);
        numbers.add(44);
        numbers.add(55);
        numbers.add(66);

        // Вывод списка на экран
        System.out.println("Исходный список: " + numbers);

        // Удаление элемента (например, элемента с индексом 2)
        numbers.remove(2);
        System.out.println("Список после удаления элемента: " + numbers);

        // Обновление значения элемента по индексу (например, элемента с индексом 1)
        numbers.set(1, 25);
        System.out.println("Список после обновления элемента: " + numbers);

        // Проверка, содержит ли список определённое число (например, число 25)
        boolean contains25 = numbers.contains(25);
        System.out.println("Список содержит число 25: " + contains25);

        // Вывод размера списка
        int size = numbers.size();
        System.out.println("Размер списка: " + size);

        // Очистка списка и вывод его окончательного состояния
        numbers.clear();
        System.out.println("Список после очистки: " + numbers);
    }
}

