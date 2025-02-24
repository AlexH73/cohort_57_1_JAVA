package Homerwork.Practica.Practica19;
//StringBuilder(input).reverse().toString() - переворачивает строку
//length() - возвращает количество символов
//toUpperCase() - преобразует строку в верхний регистр
import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ввод строки от пользователя
        System.out.println("Введите строку: ");
        String input = scanner.nextLine();

        //1. Преобразование в верхний регистр
        String upperCase = input.toUpperCase();
        System.out.println("Верхний регистр: " + upperCase);

        //2. Подсчет количества символов
        int length = input.length();
        System.out.println("Количество символов: " + length);

        //3. Переворачивание строки
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Перевернутая строка: " + reversed);

        scanner.close(); //Закрытие Сканера
    }
}
