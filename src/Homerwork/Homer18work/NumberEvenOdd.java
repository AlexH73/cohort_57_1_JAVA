package Homerwork.Homer18work;
//Задача 2: Определение чётности числа
//Код на Python:
//        number = int(input("Enter a number: "))
//
//        if number % 2 == 0:
//        print(f"{number} is even")
//else:
//        print(f"{number} is odd")
import java.util.Scanner;

public class NumberEvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);        // Создаем объект Scanner для чтения ввода с клавиатуры//
        System.out.print("Enter a number: ");       // Запрашиваем ввод числа у пользователя
        int number = sc.nextInt();

        if(number % 2 == 0) {                       // Проверка на чётность
            System.out.println(number + "is even");
        } else {
            System.out.println(number + "is odd");
        }
        sc.close(); //Закрываем сканер
    }
}

