package Practice.Practice_19;

import java.util.Scanner;

public class TheWhileLoop {
    /**
     * <h1>Задача 9: Цикл While</h1>
     * <p>
     * Создайте программу, которая запрашивает у пользователя ввод чисел.
     * Программа должна завершиться, когда пользователь введёт "0",
     * а затем вывести сумму всех введённых чисел.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0; // Переменная для хранения суммы чисел
        int number; // Переменная для хранения введенного числа

        System.out.println("Введите числа для суммирования (для завершения введите 0): ");

        // Считываем первое число
        number = scanner.nextInt();

        while (number != 0) {
            sum += number; // Добавляем введенное число к сумме

            // Считываем следующее число
            number = scanner.nextInt();
        }

        // Выводим сумму всех введенных чисел
        System.out.println("Сумма всех введенных чисел: " + sum);

        // Закрываем сканер, чтобы освободить ресурсы
        scanner.close();
    }
}
