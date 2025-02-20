package Homework.lesson_19;
//Задача 4: Подсчитать сумму чисел от 1 до N
//Код на Python:
//n = int(input("Enter a number: "))
//total = 0
//
//i = 1
//while i <= n:
//    total += i
//    i += 1
//
//print(f"The sum of numbers from 1 to {n} is {total}")
import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);        // Создаем объект Scanner для чтения ввода с клавиатуры//
        System.out.println("Enter a number: ");     // Запрашиваем ввод числа у пользователя

        int n = sc.nextInt();
        int total = 0;      //Сумма изначально со значением 0
        int i = 1;          //Переменная счетчика
        while (i <= n) {    //Цикл While для подсчета суммы чисел от 1 до n
            total += i;
            i += 1;
        }
        System.out.println("The sum of numbers from 1 to " + n + " is " + total); // Выводим результат
        sc.close(); //Закрываем сканер
    }
}
