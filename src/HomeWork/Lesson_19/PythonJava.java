package HomeWork.Lesson_19;

import java.util.Scanner;

public class PythonJava {
    public static void main(String[] args) {

        //Задача 1: Приветствие пользователя

        //name = input("Enter your name: ")
        //print(f"Hello, {name}!")

        System.out.println("Enter your name:");

        Scanner myLocalUser = new Scanner(System.in);

        String name = myLocalUser.nextLine();
        System.out.printf("Hello, %s", name);

 /*
    Задача 2: Определение чётности числа

        number = int(input("Enter a number: "))

        if number % 2 == 0:
            print(f"{number} is even")
        else:
            print(f"{number} is odd")
 */
       // ______________________________________

        System.out.println();
        System.out.print("Enter a number:");
        //Scanner myLocalUser = new Scanner(System.in);
        int number = myLocalUser.nextInt();
            if (number % 2 == 0) {
            System.out.println(number + " - is even");
        }
            else {
            System.out.println(number + " - is odd");
        }

/*
   Задача 3: Найти наибольшее из двух чисел

        a = int(input("Enter the first number: "))

        b = int(input("Enter the second number: "))

        if a > b:
           print(f"The maximum is {a}")
        else:
           print(f"The maximum is {b}")
*/
       //____________________________


        System.out.print("Enter the first number: ");
        int firstnumber = myLocalUser.nextInt();

        System.out.print("Enter the second number: ");
        int secondnumber = myLocalUser.nextInt();

        if (firstnumber > secondnumber) {
            System.out.println("The maximum ist " +  firstnumber);
        } else {
            System.out.println("The maximum ist " + secondnumber);
        }

 /*
    Задача 4: Подсчитать количество чисел от 1 до N

          n = int(input("Enter a number: "))
         total = 0

         i = 1
         while i <= n:
         total += i
         i += 1
         print(f"The sum of numbers from 1 to {n} is {total}")
         _________________________________________________
 */


        System.out.println("Enter a number: ");

        int nnumber = myLocalUser.nextInt();
        int total = 0;
        int i = 1;

        while (nnumber >= i){
            total++;
            i++;
        }

            System.out.println("The of numbers from 1 to " + nnumber + ": " + total);

/*
   Задача 5: Таблица умножения чисел

         number = int(input("Enter a number: "))

         i = 1
         while i <= 10:
             print(f"{number} x {i} = {number * i}")
             i += 1
        ____________________________________________________
 */
        Scanner myUser = new Scanner(System.in);
        System.out.println("Enter a number:");
        int nnnumber = myUser.nextInt();

        int x = 0;
        while (x < 10){
            x++;

            System.out.println(nnnumber + " x " + x + " = " + nnnumber * x);
        }




    }
}
