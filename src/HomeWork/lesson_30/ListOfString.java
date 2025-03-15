package Homework.lesson_30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListOfString {
    public static void main(String[] args) {
        // Создаем список строк
        List<String> stringList = new ArrayList<>();

        // Добавляем строки в список
        stringList.add("Mercedes");
        stringList.add("BMW");
        stringList.add("Opel");
        stringList.add("Volkswagen");
        stringList.add("Porsche");

       // Выводим все строки с помощью итерации
        System.out.println("Строки в списке:");
        for (String carMake : stringList) {
            System.out.println("Марка машины - " + carMake);
        }

        // Ищем конкретную строку в списке
        String searchString = "Opel";
        if (stringList.contains(searchString)) {
            System.out.println("\nСтрока \"" + searchString + "\" найдена в списке.");
        } else {
            System.out.println("\nСтрока \"" + searchString + "\" не найдена в списке.");
        }

        // Удаляем найденную строку
        if (stringList.remove(searchString)) {
            System.out.println("Строка \"" + searchString + "\" удалена из списка.");
        } else {
            System.out.println("Строка \"" + searchString + "\" не была удалена, так как не найдена.");
        }

        // Сортируем список в лексикографическом порядке
        Collections.sort(stringList);

        // Выводим отсортированный список
        System.out.println("\nОтсортированный список:");
        for (String str : stringList) {
            System.out.println(str);
        }
    }
}
