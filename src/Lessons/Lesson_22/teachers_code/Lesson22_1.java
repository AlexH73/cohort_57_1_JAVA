package Lessons.Lesson_22.teachers_code;

public class Account.java {
    String username;
    String password;
    String email;
    String phone;
    int balance;

    // Конструктор с двумя параметрами
    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Конструктор с пятью параметрами
    public Account(String username, String password, String email, String phone, int balance) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.balance = balance;
    }

    // Конструктор с тремя параметрами
    public Account(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        // Остальные параметры можно установить по умолчанию
    }
}


