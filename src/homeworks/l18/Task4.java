package homeworks.l18;

/*
Задача 4: Подсчитать сумму чисел от 1 до N

Код на Python:

n = int(input("Enter a number: "))
total = 0

i = 1
while i <= n:
    total += i
    i += 1

print(f"The sum of numbers from 1 to {n} is {total}")
* */


import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // n = int(input("Enter a number: "))
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        // total = 0
        // i = 1
        // while i <= n:
        // total += i
        // i += 1
        int total = 0;
        int i = 1;
        while (i <= n) {
            total += i;
            i += 1;
        }

        // print(f"The sum of numbers from 1 to {n} is {total}")
        System.out.printf("The sum of numbers from 1 to %d is %d", n, total);
    }
}
