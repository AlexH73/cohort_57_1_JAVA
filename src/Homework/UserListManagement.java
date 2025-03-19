package Homework;

import java.util.ArrayList;
import java.util.List;

public class UserListManagement {
    public static void main(String[] args) {

        List<String> users = new ArrayList<>();

        users.add("Katrin");
        users.add("Susanna");
        users.add("Anna");
        users.add("Angelina");
        users.add("Mark");
        System.out.println("Список пользователей: " + users);

        int index = users.indexOf("Susanna");
        if (index != -1) {

            users.set(index, "Julia");
            System.out.println("Список после обновления: " + users);
        }

        users.remove("Katrin");
        System.out.println("Список после удаления 'Katrin': " + users);
    }
}