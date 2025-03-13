package Homework.lesson_30;

import java.util.ArrayList;
import java.util.List;

public class UserListManager {
    public static void main(String[] args) {
        //Создаем список пользователей (List<String> с именами)
        List<String> users = new ArrayList<>();

        //Добавляет несколько имен в список.
        users.add("Алексей");
        users.add("Марк");
        users.add("Ольга");
        users.add("Мария");
        users.add("Дмитрий");
        System.out.println(users);

        //индекс определённого пользователя.
        String searchUser = "Марк";
        //Проверяем, есть ли пользователь в списке (булевое значение)
        boolean exist = users.contains(searchUser);
        //Если пользователь есть, получаем его индекс
        if (exist) {
            int index = users.indexOf(searchUser);
            System.out.println("Пользователь " + searchUser + " найден на индексе: " + index);
        } else {
            System.out.println("Пользователь " + searchUser + " не найден.");
        }

        //Обновляем имя пользователя по индексу.
        int indexToUpdate = 0;
        String newName = "Alf";
        String oldName = users.set(indexToUpdate, newName);
        //Вывод информации:
        System.out.println("Изменено: индекс " + indexToUpdate + ", " + oldName + "->" + newName);
        System.out.println("Обновленный список пользователей: " + users);

        //или второй вариант:
        String setUser = users.set(3, "Татьяна");
        System.out.println("Обновленный список пользователей: " + users);

        //Удаляем пользователя из списка.
        String removeUser = "Ольга";
        if (users.remove(removeUser)) {
            System.out.println("Пользователь " + removeUser + " удален из списка");
        } else {
            System.out.println("Пользователь " + removeUser + " не найден");
        }

        //Выводим итоговое состояние списка.
        System.out.println("Итоговый список пользователей: " + users);
    }
}
