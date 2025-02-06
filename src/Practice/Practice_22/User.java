package Practice.Practice_22;
//[x] TODO: Создать класс User
//[x] 1. Добавить поля:
//    - `username` (String) - Логин пользователя
//    - `email` (String) - Электронная почта
//    - `age` (int) - Возраст пользователя
//[x] 2. Создать конструктор, который принимает все три параметра.
//[x] 3. Реализовать метод `displayUserInfo()`, который выводит информацию о пользователе.

class User {
    String username;
    String email;
    int age;

    public User(String username, String email, int age ) {
        this.age = age;
        this.email = email;
        this.username = username;
    }

    public void displayUserInfo() {
        this.username = username;
        this.email = email;
        this.age = age;
        System.out.println("User: " + username + ", \nE-mail: " + email + ", \nAge: " + age);
    }

    @Override
    public String toString() {
        return "User: {" +
                "username='" + username + '\'' +
                '}';
    }
}

