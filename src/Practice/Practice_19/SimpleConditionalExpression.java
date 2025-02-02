package Practice.Practice_19;

import java.util.Scanner;

public class SimpleConditionalExpression {
    /**
     * Задача 4: Простое условное выражение
     * <p>
     * Создайте программу, которая запрашивает у пользователя ввод числа и проверяет, <br>
     * является ли число положительным, отрицательным или равным нулю.<br>
     * Выведите соответствующее сообщение на консоль.<br>
     */
    public static void main(String[] args) {
        // Запускаем метод для ввода числа и его проверки
        enteringAndVerifying();
    }

    public static void enteringAndVerifying() {
        // Создаем объект Scanner для считывания ввода пользователя
        Scanner scanner = new Scanner(System.in);

        // Просим пользователя ввести число
        System.out.println("Введите число: ");

        // Считываем введенное число
        int number = scanner.nextInt();

        // Проверяем, является ли число отрицательным
        if (number < 0) {
            System.out.println("Отрицательное число = " + number);
            // Проверяем, является ли число положительным
        } else if (number > 0) {
            System.out.println("Положительное число = " + number);
            // Если число не меньше нуля и не больше нуля, значит оно равно нулю
        } else {
            System.out.println("Число = " + number);
        }

        // Закрываем сканер, чтобы освободить ресурсы
        scanner.close();
    }
}
