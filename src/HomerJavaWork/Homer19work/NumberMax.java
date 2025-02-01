package HomerJavaWork.Homer19work;
//Задача 3: Найти максимальное из двух чисел
//Код на Python:
//a = int(input("Enter the first number: "))
//b = int(input("Enter the second number: "))
//if a > b:
//    print(f"The maximum is {a}")
//else:
//    print(f"The maximum is {b}")
import java.util.Scanner;

public class NumberMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // Создаем объект Scanner для чтения ввода с клавиатуры
        System.out.println("Enter the first number: "); // Запрашиваем ввод двух чисел у пользователя
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        if (a > b) {                                     // Находим максимальное число и выводим
            System.out.println("The maximum is " + a);}
        else{
            System.out.println("The maximum is " + b);
        }
        sc.close(); //Закрываем сканер
    }
}
