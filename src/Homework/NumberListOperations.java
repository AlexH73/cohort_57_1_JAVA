package Homework;

/*
Задача 1: Основные операции с числовым списком

Описание:
        Создайте программу, которая:
        • Создает список чисел (например, List<Integer>).
        • Добавляет несколько элементов в список.
 • Выводит список на экран.
        • Удаляет один из элементов.
        • Обновляет значение элемента по индексу.
 • Проверяет, содержит ли список определённое число.
 • Выводит размер списка.
 • Очищает список и выводит его окончательное состояние.
*/

import  java.util.ArrayList;
import java.util.List;

public class NumberListOperations {
    public static void main(String[] args)  {

        List<Integer>numbers = new ArrayList<>();

        numbers.add(7);
        numbers.add(39);
        numbers.add(53);
        numbers.add(83);
        numbers.add(91);
        System.out.println("Список чисел: " + numbers);

        numbers.remove(Integer.valueOf(39));
        System.out.println("Список после удаления 39: " + numbers);

        numbers.set(1, 8);
        System.out.println("Cписок после обновления " + numbers);

        boolean contains = numbers.contains(10);
        System.out.println("Содержит ли список 10?: " + contains);

        System.out.println("Размер списка: " + numbers.size());

        numbers.clear();
        System.out.println("Cписок очищен: " + numbers);


    }
}


