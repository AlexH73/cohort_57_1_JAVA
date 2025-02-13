package Lessons.Lesson_23.teachers_code;

import java.util.Scanner;

// это класс на примере которого будут рассмотрены модификаторы доступа
public class UserAccount {
    private String login;
    private String password;

    private final String key = "huidkjewf904u8tj804jhfndjwpjedpqmwdqwdljnrwvrue7f8943r234";

    public UserAccount(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        System.out.println("Для изменения логина введите пароль:");

        String pass = new Scanner(System.in).nextLine().trim();

        if (pass.equals(this.password)){
            System.out.println("Логин изменен");
            this.login = login;
        } else {
            System.out.println("пароли не совпадают, логин не был изменен. Уведомление о попытке смены логина отправлено на почту");
        }
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "login='" + login + '\'' +
                ", password=********}\'";
    }

    public String showPassword(String key) {
        if (this.key.equals(key)) {
            return password;
        } else {
            return null;
        }
    }
}
