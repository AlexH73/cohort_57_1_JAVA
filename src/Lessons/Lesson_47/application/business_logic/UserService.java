package Lessons.Lesson_47.application.business_logic;

import Lessons.Lesson_47.application.data_access.UserRepositoryImpl;
import Lessons.Lesson_47.application.data_access.UserRepositoryInterface;
import Lessons.Lesson_47.application.models.User;

import java.util.List;

public class UserService {
    private UserRepositoryInterface userRepo = new UserRepositoryImpl();

    public boolean addUser(String name, String number) {
        if (name == null || number == null) {
            System.out.println("Имя или номер телефона не могут быть null!!");
            return false;
        }

        if (name.isBlank() || number.isBlank()) {
            System.out.println("Имя или номер телефона не могут быть пустыми!!");
            return false;
        }


        if (userRepo.getUserByNumber(number).isEmpty()) {
            User user = new User(name, number);
            return userRepo.addUser(user);
        } else {
            System.out.println("запись таким номером телефона уже есть! проверьте дубли");
            for (User user : userRepo.getUserByNumber(number)) {
                System.out.println(user);
            }
            return false;
        }
    }

    public List<User> getUserByName(String name) {
        // name not null, not empty
        // or return null or empty list

        return userRepo.getUserByName(name);
    }
}
