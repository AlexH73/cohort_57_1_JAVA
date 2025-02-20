package Homework.lesson_19;
//Задача 5: Таблица умножения для числа
//Код на Python:
//
//number = int(input("Enter a number: "))
//
//i = 1
//while i <= 10:
//    print(f"{number} x {i} = {number * i}")
//    i += 1
import java.util.Scanner;

public class NumberMultipllying {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // Создаем объект Scanner для чтения ввода с клавиатуры
        System.out.println("Enter a number: "); // Запрашиваем ввод числа у пользователя
        int number = sc.nextInt();

        int i = 1;                              //Переменная счетчика
        while (i <= 10) {                       //Цикл While для создания таблицы умнажения
            System.out.println(number + " x " + i + " = " + (number * i));
            i++;
        }
        sc.close(); //Закрываем сканер

    }
}

