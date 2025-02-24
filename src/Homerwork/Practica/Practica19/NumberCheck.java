package Homerwork.Practica.Practica19;

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        //Создаем объект Сканер для считывания ввода
        Scanner scanner = new Scanner(System.in);

        //Запрос числа у пользователя
        System.out.println("Введите число: ");
        double number = scanner.nextDouble();

        //Проверка числа
        if (number > 0) {
            System.out.println("Число положительное.");
        } else if (number < 0) {
            System.out.println("Число отрицательное.");
        }  else {
            System.out.println("Число равно нулю.");
        }
        scanner.close(); //Закрытие Сканера
    }
}
