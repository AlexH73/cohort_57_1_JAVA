package Homework.lesson_30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StringListOperations {
    public static void main(String[] args) {
        //Создаем список строк
        List<String> phrases = new ArrayList<>();

        //Добавляем несколько строк в список.
        phrases.add("Хрустящий багет");
        phrases.add("Пряный пармезан");
        phrases.add("Вальяжный паштет");
        phrases.add("Мрачный шоколад");
        phrases.add("Сочный виноград");

        //Выводим все строки с помощью итерации.
        System.out.println("Список строк: ");
        Iterator<String> iterator = phrases.iterator();
        System.out.println(phrases);

        //Ищем конкретную строку в списке.
        String searchPhrase = "Сочный виноград";
        if (phrases.contains(searchPhrase)) {
            System.out.println("Найдена фраза: " + searchPhrase);
        }

        //Удаляем найденную строку.
        phrases.remove(searchPhrase);
        System.out.println("После удаления " + searchPhrase + ":" + phrases);

        //Сортируем список в лексикографическом порядке.
        Collections.sort(phrases);

        //Выводим отсортированный список.
        System.out.println("Выводим отсортированный список: " + phrases);
    }
}
