package Homework.Homework_22;
//[x] TODO: Создать класс User
//[x] 1. Добавить поля:
//    - `username` (String) - Логин пользователя
//    - `email` (String) - Электронная почта
//    - `age` (int) - Возраст пользователя
//[x] 2. Создать конструктор, который принимает все три параметра.
//[x] 3. Реализовать метод `displayUserInfo()`, который выводит информацию о пользователе.

/**
 * <h1>Задание 1: Доработка класса User</h1>
 * 1. Добавить метод isAdult(), который возвращает true, если пользователю 18 лет или больше,
 * и false в противном случае.<br>
 * 2. Изменить метод displayUserInfo(), чтобы он также отображал информацию о
 * совершеннолетии пользователя.<br>
 * 3. Протестировать класс, создав несколько объектов User и вызвав все методы.
 */

class User {
    String username;
    String email;
    int age;

    // Конструктор для инициализации всех полей
    public User(String username, String email, int age) {
        // можно добавить проверку на положительный возраст
        this.age = age;
        // можно добавить проверку на валидность почты или как минимум, что данные не пусты
        this.email = email;
        this.username = username;
        // бесполезный вызов, тк не используется далее, метод лишь возвращает булеан, который нигде не применяется
        this.isAdult();
    }

    // Метод для проверки, является ли пользователь совершеннолетним
    public boolean isAdult() {
        return age >= 18;
    }

    // Метод для отображения информации о пользователе
    public void displayUserInfo() {
        System.out.println("User: " + username + ", \nE-mail: " + email + ", \nAge: " + age);
        System.out.println("Is adult: " + (isAdult() ? "Yes" : "No"));
    }

    @Override
    public String toString() {
        return "User: {" +
                "username='" + username + '\'' +
                '}';
    }
}

