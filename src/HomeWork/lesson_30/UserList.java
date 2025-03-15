package Homework.lesson_30;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UserList {
    public static void main(String[] args) {
        List<String> userList = new LinkedList<>();

        userList.add("Petrow");
        userList.add("Iwanow");
        userList.add("Sidorow");
        userList.add("Neumann");
        userList.add("Gofman");

        System.out.println("Список пользователей: ");
        for (String user : userList) {
            System.out.println(user);
        }

        int index = userList.indexOf("Neumann");
        System.out.println("\nNeumann находится под индексом  " + index);

        userList.add(4,"Smirnof");
        System.out.println("\nОбновляет имя пользователя по 4 индексу " +userList);

        userList.remove(3);
        System.out.println("\nУдалён объект `Neumann` " + userList);

        System.out.println("\nНовый cписок пользователей: ");
        for (String user : userList) {
            System.out.println(user);
        }

    }
}
