package HomerJavaWork.Homer19work;
//Задача 1: Приветствие пользователя
//Код на Python:
//name = input("Enter your name: ")
//print(f"Hello, {name}!")
import java.util.Scanner;

public class GreetingUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        // Создаем объект Scanner для чтения ввода с клавиатуры
        System.out.print("Enter your name: ");      // Запрашиваем имя пользователя
        String name = sc.nextLine();
        System.out.printf("Hello, " + name + "!" ); // Выводим приветствие
        sc.close();  //Закрываем сканер

    }
}

