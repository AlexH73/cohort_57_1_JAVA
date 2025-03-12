package Homework.lesson_30;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Задача 3: Простое управление списком пользователей</h1>
 * <b>Описание:<br>
 * Создайте программу, которая:<br></b>
 *
 * Создает список пользователей (List<String> с именами).<br>
 * Добавляет несколько имен в список.<br>
 * Находит индекс определённого пользователя.<br>
 * Обновляет имя пользователя по индексу.<br>
 * Удаляет пользователя из списка.<br>
 * Выводит итоговое состояние списка.<br>
 */
public class UserManager {
    public static void main(String[] args) {
        List<String> users = new ArrayList<>();

        // Добавление пользователей
        users.add("Алексей");
        users.add("Мария");
        users.add("Иван");
        users.add("Ольга");

        System.out.println("Исходный список: " + users);

        // Поиск индекса
        String targetUser = "Иван";
        int index = users.indexOf(targetUser);
        System.out.println("Индекс пользователя " + targetUser + ": " + index);

        // Обновление имени
        if(index != -1) {
            users.set(index, "Иван Петров");
        }

        // Удаление пользователя
        users.remove("Ольга");

        System.out.println("Итоговый список: " + users);
    }
}
