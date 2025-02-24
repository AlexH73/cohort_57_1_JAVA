package Homerwork.Practica.Practica19;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "1234";    //Заданный правильный пароль
        String inputPassword;

        do {
            System.out.println("Введите пароль: ");
            inputPassword = scanner.nextLine();   //Считываем ввод пользователя

            if (!inputPassword.equals(correctPassword)) {
                System.out.println("Неверный пароль, попробуйте снова.");
            }
        } while (!inputPassword.equals(correctPassword)); //Повторяем, пока пароль неверный
        System.out.println("Добро пожаловать!");
        scanner.close(); //Закрываем Сканер, чтобы избежать утечек ресурсов
    }
}
