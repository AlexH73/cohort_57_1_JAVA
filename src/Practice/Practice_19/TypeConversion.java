package Practice.Practice_19;

import java.util.Scanner;

public class TypeConversion {
    /**
     * Задача 6: Преобразование типов
     * <p>
     * Напишите программу на Java, которая принимает пользовательский ввод в виде строки,
     * преобразует его в целое число и выводит результат.
     * Обработайте возможные исключения, если ввод не является допустимым числом.
     * <p>
     * Подсказка: используйте Integer.parseInt() и блоки try-catch.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");

        // Считываем ввод пользователя как строку
        String input = scanner.nextLine();
        try {
            // Преобразуем строку в число
            int number = Integer.parseInt(input);
            System.out.println("Вы ввели число: " + number);
        } catch (NumberFormatException e) {
            // Обрабатываем исключение, если ввод не является числом
            System.out.println("Ошибка: введенная строка не является числом.");
        }

        scanner.close();
    }
}
