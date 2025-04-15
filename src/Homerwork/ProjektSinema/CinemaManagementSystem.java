package Homerwork.ProjektSinema;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CinemaManagementSystem {
    private static Scanner scanner = new Scanner(System.in);
    private static List<IFilm>films = new ArrayList<>();

    public static void main(String[] args) {
        login();

    }

    private static void login() {
        System.out.println("Вход в систему управления кинотеатром.");
        System.out.println("Выберите тип пользователя:");
        System.out.println("1. Администратор\n2. Сотрудник\n3. Клиент");
        System.out.println("Ваш выбор: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // очистка буфера после ввода числа

        System.out.println("Введите имя пользователя: ");
        String username = scanner.nextLine();
        System.out.println("Введитепароль: ");
        String password = scanner.nextLine();

        boolean isAuthenticated = false;


    }
}