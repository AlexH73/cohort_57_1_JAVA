package Homerwork.Practica.Practica19;

import java.util.Scanner;

public class AgeCategory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Запрос возраста у пользователя
        System.out.println("Введите ваш возраст: ");
        int age = scanner.nextInt();

        //Проверка возрастной категории
        if (age < 12) {
            System.out.println("Вы ребенок.");
        } else if (age >= 12 && age <= 17) {
            System.out.println("Вы подросток.");
        } else {
            System.out.println("Вы взрослый.");
        }

        scanner.close(); //Закрытие Сканера
    }
}
