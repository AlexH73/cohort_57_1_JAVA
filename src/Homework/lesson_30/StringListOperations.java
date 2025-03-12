package Homework.lesson_30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <h1>Задача 2: Основные операции со строковым списком</h1>
 * <b>Описание:<br />
 * Создайте программу, которая:<br /></b>
 *
 * Создает список строк (например, List<String>).<br />
 * Добавляет несколько строк в список.<br />
 * Выводит все строки с помощью итерации.<br />
 * Ищет конкретную строку в списке.<br />
 * Удаляет найденную строку.<br />
 * Сортирует список в лексикографическом порядке.<br />
 * Выводит отсортированный список.<br />
 */
public class StringListOperations {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        // Добавление элементов
        strings.add("Яблоко");
        strings.add("Банан");
        strings.add("Апельсин");
        strings.add("Груша");

        // Итерация по списку
        System.out.println("Все элементы:");
        for (String fruit : strings) {
            System.out.println(fruit);
        }

        // Поиск элемента
        String search = "Банан";
        boolean found = strings.contains(search);
        System.out.println("Найден '" + search + "': " + (found? "Да" : "Нет"));

        // Удаление элемента
        strings.remove(search);

        // Сортировка
        Collections.sort(strings);
        System.out.println("Отсортированный список: " + strings);
    }
}
