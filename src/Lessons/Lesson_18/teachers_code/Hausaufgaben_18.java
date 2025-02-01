package Lessons.Lesson_18.teachers_code;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Hausaufgaben_18 {
/**
 * Aufgabe 1
    // Code Python: name = input("Enter your name: ")
    //              print(f"Hello, {name}!")

    public static void main(String[] args) {
        System.out.println("Hallo! Enter you Name:");
        Scanner scannername = new Scanner(System.in);
        String name = scannername.nextLine();
        System.out.printf("Hallo, %s", name);
    }
}
**/
/**
Aufgabe 2
number = int(input("Enter a number: "))

        if number % 2 == 0:
print(f"{number} is even")
else:
print(f"{number} is odd")

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + "is even");
        } else {
            System.out.println(number + " is odd");
        }
    }
}
**/
/**
Aufgabe 3
 //a = int(input("Enter the first number: "))
 //b = int(input("Enter the second number: "))
 //
 //if a > b:
 //    print(f"The maximum is {a}")
 //else:
 //    print(f"The maximum is {b}")

     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter the first number: ");
         int a = scanner.nextInt();
         System.out.println("Enter the second number: ");
         int b = scanner.nextInt();
         if (a > b) {
         System.out.println("The maximum is: " + a);
         } else {
         System.out.println("The maximum is: " + b);
         }
     }
 }
**/
/**
 * Aufgabe 4
 * n = int(input("Enter a number: "))
 * total = 0
 *
 * i = 1
 * while i <= n:
 *     total += i
 *     i += 1
 *
 * print(f"The sum of numbers from 1 to {n} is {total}")
 **/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        int total = 0;
        int i = 1;
        while (i <= n) {
            total += i;
            i += 1;
        }
        System.out.println("The sum of numbers from 1 to " + n + " is " + total);
    }
}

/**
 * Aufgabe: 5
 * number = int(input("Enter a number: "))
 *
 * i = 1
 * while i <= 10:
 *     print(f"{number} x {i} = {number * i}")
 *     i += 1
 *
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int number = scanner.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.println(number + " x " + i + " = " + (number * i));
            i++;
        }

    
    }
}
**/