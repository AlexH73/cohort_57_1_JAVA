package Homework.lesson_30;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Задача 1: Основные операции с числовым списком</h1>
 * <b>Описание:<br />
 * Создайте программу, которая:<br /></b>
 *
 * Создает список чисел (например, List<Integer>).<br />
 * Добавляет несколько элементов в список.<br />
 * Выводит список на экран.<br />
 * Удаляет один из элементов.<br />
 * Обновляет значение элемента по индексу.<br />
 * Проверяет, содержит ли список определённое число.<br />
 * Выводит размер списка.<br />
 * Очищает список и выводит его окончательное состояние.<br />
 */

public class NumberListOperations {
    public static void main(String[] args) {
        // Создание списка
        List<Integer> numbers = new ArrayList<>();

        // Добавление элементов
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Вывод списка
        System.out.println("Исходный список: " + numbers);

        // Удаление элемента по индексу
        numbers.remove(2);
        System.out.println("После удаления элемента с индексом 2: " + numbers);

        // Обновление элемента
        numbers.set(1, 25);
        System.out.println("После обновления элемента: " + numbers);

        // Проверка наличия элемента
        System.out.println("Содержит 42? " + (numbers.contains(42)? "Да" : "Нет"));

        // Размер списка
        System.out.println("Размер списка: " + numbers.size());

        // Очистка списка
        numbers.clear();
        System.out.println("После очистки: " + numbers);
    }
}
