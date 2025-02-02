package Practice.Practice_19;

import java.util.Scanner;

public class DepositIfElse {
    /**
     * <h1>Задача 8: If-Else</h1>
     * <p>
     * Напишите программу, которая запрашивает у пользователя его возраст и выводит,
     * является ли он ребёнком (младше 12), <br>
     * Подростком (12-17) <br>
     * Или взрослым (18 и старше).
     */
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания ввода пользователя
        Scanner scanner = new  Scanner(System.in);

        // Просим пользователя ввести возраст
        System.out.println("Введите возраст в виде целого числа: ");

        // Считываем введенное пользователем значение и сохраняем его в переменной age
        int age = scanner.nextInt();

        // Проверяем возраст и выводим соответствующее сообщение
        if (age > 0 && age <= 12) {
            // Если возраст больше 0 и меньше или равен 12, выводим сообщение, что это ребёнок
            System.out.println("От 0 до 12 лет = Ребёнок");
        } else if (age > 12 && age <= 17) {
            // Если возраст больше 12 и меньше или равен 17, выводим сообщение, что это подросток
            System.out.println("От 13 до 17 лет = Подросток");
        } else if (age >= 18) {
            // Если возраст 18 и больше, выводим сообщение, что это взрослый
            System.out.println("От 18 и более лет = Взрослый");
        } else {
            // Если введено некорректное значение (например, отрицательное число), выводим сообщение об ошибке
            System.out.println("Ошибка ввода! Введите целое положительное число.");
        }

        // Закрываем объект Scanner, чтобы освободить ресурсы
        scanner.close();
    }
}
