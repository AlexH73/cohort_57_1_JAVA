package Lessons.Lesson_47.application.data_access;

import Lessons.Lesson_47.application.models.User;

import java.util.List;

public interface UserRepositoryInterface {
    boolean addUser(User user);
    List<User> getUserByName(String name);
    List<User> getUserByNumber(String number);
    List<User> getOnlineUsers();
    void  updateUser(User user);
    boolean deleteUser(User user);
}
