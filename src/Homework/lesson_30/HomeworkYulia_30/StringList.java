package Homework.lesson_30.HomeworkYulia_30;

import java.util.ArrayList;
import java.util.Collections;

public class StringList {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();

        stringList.add("Первый");
        stringList.add("Второй");
        stringList.add("Третий");

        System.out.println("Список строк: ");
        for (String str : stringList) {
            System.out.println(str);
        }
        String searchString = "Второй";
        if (stringList.contains(searchString)) {
            System.out.println("Строка '" + searchString + "' найдена в списке.");

            stringList.remove(searchString);
            System.out.println("После удаления строки '" + searchString + "': " + stringList);
        } else {
            System.out.println("Строка '" + searchString + "' не найдена в списке.");
        }

        Collections.sort(stringList);

        System.out.println("Отсортированный список: " + stringList);
    }
}
