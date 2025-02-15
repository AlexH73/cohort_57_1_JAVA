// // TODO: Реализовать иерархию пользователей в онлайн-обучении.
/// / 1. `User` (базовый класс) содержит `username` и `email`.
/// / 2. `Student` наследует `User` и добавляет `studentId`.
/// / 3. `PremiumStudent` наследует `Student` и добавляет `membershipLevel`.


package Homework.lesson_24.HomeworkYulia_24;

public class User {
    private String username;
    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }
    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void displayInfo() {
        System.out.println("Пользователь: " + username);
        System.out.println("Email: " + email);
    }
}
