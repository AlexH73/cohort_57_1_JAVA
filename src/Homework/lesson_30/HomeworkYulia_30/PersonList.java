package Homework.lesson_30.HomeworkYulia_30;

import java.util.ArrayList;

public class PersonList {
    public static void main(String[] args) {
        ArrayList<String> personList = new ArrayList<>();

        personList.add("Ivan");
        personList.add("Maria");
        personList.add("Nik");
        personList.add("Lena");

        System.out.println("Список пользователей: " + personList);

        String searchPerson = "Ivan";
        int userIndex = personList.indexOf(searchPerson);
        if (userIndex != -1) {
            System.out.println("Пользователь '" + searchPerson + "' найден на индексе: " + userIndex);
        } else {
            System.out.println("Пользователь '" + searchPerson + "' не найден.");
        }

        if (userIndex != -1) {
            personList.set(userIndex, "Oleg");
            System.out.println("После обновления: " + personList);
        }
        String personToRemove = "Maria";
        personList.remove(personToRemove);
        System.out.println("После удаления пользователя '" + personToRemove + "': " + personList);

        // 6. Вывод итогового состояния списка
        System.out.println("Итоговый список пользователей: " + personList);
    }
}
