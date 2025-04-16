package main_project.src.classes;
import main_project.src.interfaces.*;

public class User implements IUser {
    private String username;  // Имя пользователя
    private String password;  // Пароль пользователя

    // Конструктор
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='********'" + // Скрытие пароля в выводе для безопасности
                '}';
    }
}

