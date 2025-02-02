package Practice.Practice_19;

import java.util.Scanner;

public class TheDoWhileCycle {
    /**
     * <h1>Задача 10: Цикл Do-While</h1>
     * Напишите программу, которая повторно запрашивает у пользователя ввод пароля,
     * пока он не введёт правильный (например, "1234").
     * После ввода правильного пароля выведите приветственное сообщение.
     */
    public static void main(String[] args) {
        final String correctPassword = "1234";  // Заданный правильный пароль
        Scanner scanner = new Scanner(System.in);
        String inputPassword;

        // Цикл do-while для запроса пароля у пользователя
        do {
            System.out.println("Введите пароль: ");
            inputPassword = scanner.nextLine(); // Считываем введенный пароль
        } while (!inputPassword.equals(correctPassword)); // Проверяем, совпадает ли введенный пароль с правильным

        // Выводим приветственное сообщение после ввода правильного пароля
        System.out.println("Добро пожаловать!");

        // Закрываем сканер, чтобы освободить ресурсы
        scanner.close();
    }
}
