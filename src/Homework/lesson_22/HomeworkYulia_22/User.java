// Задание 1: Доработка класса User
//Добавить метод isAdult(), который возвращает true, если пользователю 18 лет или больше, и false в противном случае.
//Изменить метод displayUserInfo(), чтобы он также отображал информацию о совершеннолетии пользователя.
//Протестировать класс, создав несколько объектов User и вызвав все методы.

package Homework.lesson_22.HomeworkYulia_22;

public class User {
    String user;
    int age;
    String email;

    public User(String user, int age, String email) {

        this.user = user;
        this.age = age;
        this.email = email;
    }

    public boolean isAdult() {
        return age >= 18;
    }

    public void displayUserInfo() {

        System.out.println("Пользователь: " + user);
        System.out.println("Возраст: " + age);
        System.out.println("Email: " + email);
        System.out.println("Совершеннолетний? " + (isAdult() ? "Да" : "Нет"));
        System.out.println("---------------------------");
    }
}
