package Practice.Practice_19;

import java.util.Scanner;

public class StringManipulation {
    /**
     * <h1>Задача 7: Манипуляции со строками</h1>
     * <p>
     * Создайте программу, которая принимает строку от пользователя и выполняет следующие операции:
     * <p>
     * Преобразует строку в верхний регистр.<br>
     * Считает количество символов в строке.<br>
     * Переворачивает строку.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Создаем объект Scanner для считывания ввода пользователя
        System.out.println("Введите строку: ");
        String string = scanner.nextLine(); // Считываем введенную строку
        System.out.println("Строка до манипуляций = " + string);

        // Преобразуем строку в верхний регистр и выводим результат
        String newString = string.toUpperCase();
        System.out.println("Строка в верхнем регистре = " + newString);

        // Переворачиваем строку и выводим результат
        StringBuilder stringBuilder = new StringBuilder(string);
        String reversedString = stringBuilder.reverse().toString();

        System.out.println("Строка в развернутом виде = " + reversedString);

        // Закрываем объект Scanner, чтобы освободить ресурсы
        scanner.close();
    }
}
