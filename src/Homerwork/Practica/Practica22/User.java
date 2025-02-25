package Homerwork.Practica.Practica22;

public class User {
    String username;
    String email;
    int age;

    public User(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }

    //Метод для отображения информации о пользователе
    public void displayUserInfo() {
        System.out.println("Логин: " + username);
        System.out.println("Email: " + email);
        System.out.println("Возраст: " + age);
    }
}
