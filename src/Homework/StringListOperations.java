package Homework;
/*Задача 2: Основные операции со строковым списком
        Описание:
        Создайте программу, которая:
        • Создает список строк (например, List<String>).
        • Добавляет несколько строк в список.
        • Выводит все строки с помощью итерации.
        • Ищет конкретную строку в списке.
        • Удаляет найденную строку.
        • Сортирует список в лексикографическом порядке.
        • Выводит отсортированный список.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringListOperations {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>();

        words.add("Тарелка");
        words.add("Чайник");
        words.add("Кастрюля");
        words.add("Половник");
        words.add("Вилка");
        System.out.println("Список после добавления: " + words);


        System.out.println("Элементы списка:");
        for (String word : words) {
            System.out.println(word);
        }

        if (words.contains("Чайник")) {
            words.remove("Чайник");
            System.out.println("Список после удаления 'Чайник': " + words);
        }

        Collections.sort(words);
        System.out.println("Отсортированный список: " + words);
    }
}

