package Homerwork.Practica.Practica19;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Введите числа (для завершения введите 0) :");

        while (true) {
            int number = scanner.nextInt(); //Считываем число

            if (number == 0) { //Если введен 0, выходим из цикла
                break;
            }

            sum += number;  //добавляем число к сумме
        }

        System.out.println("Сумма введенных чисел: " + sum);
        scanner.close(); //Закрываем Сканер, чтобы избежать утечек ресурсов
    }
}
