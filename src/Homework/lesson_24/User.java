package Homework.lesson_24;
/*Часть 2: Реализация многоуровневого наследования
🔹 В следующих заданиях нужно построить цепочку наследования, где каждый класс расширяет предыдущий.
🔹 Финальный класс должен объединять функциональность всех предыдущих уровней.

// TODO: Реализовать иерархию пользователей в онлайн-обучении.
// 1. `User` (базовый класс) содержит `username` и `email`.
// 2. `Student` наследует `User` и добавляет `studentId`.
// 3. `PremiumStudent` наследует `Student` и добавляет `membershipLevel`.
class User {
    private String username;
    private String email;
}
// TODO: Реализовать иерархию платежных систем.
// 1. `PaymentMethod` (базовый класс) содержит `accountNumber` и `balance`.
// 2. `CreditCard` наследует `PaymentMethod` и добавляет `creditLimit`.
// 3. `GoldCreditCard` наследует `CreditCard` и добавляет `cashbackPercentage`.
class PaymentMethod {
    private String accountNumber;
    private double balance;
}*/
//Базовый класс User
public class User {
    private String username;
    private String email;

    //Конструктор
    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }
    //Геттеры
    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
    //Метод для отображения информации
    public void displayInfo() {
        System.out.println("Пользователь: " + username + ", Email: " + email);
    }
}
