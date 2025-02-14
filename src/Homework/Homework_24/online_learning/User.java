package Homework.Homework_24.online_learning;

// TODO: Реализовать иерархию пользователей в онлайн-обучении.
// 1. `User` (базовый класс) содержит `username` и `email`.
// 2. `Student` наследует `User` и добавляет `studentId`.
// 3. `PremiumStudent` наследует `Student` и добавляет `membershipLevel`.

public class User {
    private String username;
    private String email;

    // Конструктор
    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    // Геттеры и сеттеры
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
