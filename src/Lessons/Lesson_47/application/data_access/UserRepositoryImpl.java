package Lessons.Lesson_47.application.data_access;

import Lessons.Lesson_47.application.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepositoryInterface{
    private List<User> users;

    public UserRepositoryImpl() {
        users = new ArrayList<>();
    }

    @Override
    public boolean addUser(User user) {
        if (users.contains(user)) {
            return false;
        }
        users.add(user);
        return true;
    }

    @Override
    public List<User> getUserByName(String name) {
        List<User> usersByName = new ArrayList<>();
        name = name.toLowerCase().trim();

        for (User user : users) {
            String userName = user.getUserName().toLowerCase().trim();
            if (userName.contains(name)) {
                usersByName.add(user);
            }
        }

        String finalName = name;
        List<User> usersByNameStream = users.stream()
                .filter(user -> user.getUserName().toLowerCase().trim().contains(finalName))
                .toList();

        //return usersByName;
        return usersByNameStream;
    }

    @Override
    public List<User> getUserByNumber(String number) {
        // реализовать самостоятельно, см getUserByName

        return List.of();
    }

    @Override
    public List<User> getOnlineUsers() {
        // реализовать самостоятельно

        return List.of();
    }

    @Override
    public void updateUser(User user) {
        // todo подумать над реализацией
    }

    @Override
    public boolean deleteUser(User user) {
        if (users.contains(user)) {
            users.remove(user);
            return true;
        }
        return false;
    }
}
