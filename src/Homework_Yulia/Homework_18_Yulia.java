package Homework_Yulia;

import java.util.Scanner;

public class Homework_18_Yulia {

    public static void main(String[] args) {

        Scanner myLocalReader = new Scanner(System.in);

        // Задача 1: Приветствие пользователя

        System.out.println("Hello! Enter your name: ");

        //позволяет считать все введенные данные от начала до конца строки:
        String name = myLocalReader.nextLine();

        System.out.println("your name is " + name);






        // Задача 2: Определение чётности числа

        System.out.print("Enter your number: ");

        int value = myLocalReader.nextInt();

        if (value % 2 == 0) {
            System.out.println("value is even ");
        }
        else {
            System.out.println("value is odd ");
        }





        // Задача 3: Найти максимальное из двух чисел

        System.out.println("Enter the first number: ");
        int number_1 = myLocalReader.nextInt();

        System.out.println("Enter the second number: ");
        int number_2 = myLocalReader.nextInt();

        if (number_1 < number_2) {
            System.out.println("The maximum is " + number_2);
        }
        else {
            System.out.println("The maximum is " + number_1 );
        }





        // Задача 4: Подсчитать сумму чисел от 1 до N

        System.out.println("Enter a number: ");
        int n = myLocalReader.nextInt();

        int total = 0;
        int i = 1;

        while (i <= n) {
            total += i;
            i += 1;
        }
        System.out.println("The sum of numbers from 1 to " + n + " is " + total);





        // Задача 5: Таблица умножения для числа

        System.out.println("Enter a number: ");
        int number = myLocalReader.nextInt();

        int k = 1;
        while (k <= 10) {

            System.out.println("Result of multiplicaition: " + number + "*" + k + "=" + number * k);
            k += 1;
        }

    }



}
