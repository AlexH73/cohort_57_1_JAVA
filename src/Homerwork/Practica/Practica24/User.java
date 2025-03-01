package Homerwork.Practica.Practica24;
// 3. Реализовать метод `displayUserInfo()`, который выводит информацию о пользователе.
public class User {
    private String username;
    private String email;
    private int age;

    public User(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public void displayUserInfo() {
        System.out.println("User Info:");
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
    }

}
