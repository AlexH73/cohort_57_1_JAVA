package Practice.Practice_19;

import java.util.Scanner;

public class SimpleConditionalExpression {
    /**
     * Задача 4: Простое условное выражение
     * <p>
     * Создайте программу, которая запрашивает у пользователя ввод числа и проверяет, <br>
     * является ли число положительным, отрицательным или равным нулю.<br>
     * Выведите соответствующее сообщение на консоль.<br>
     */
    public static void main(String[] args) {
        enteringAndVerifying();
    }

    public static void enteringAndVerifying() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Отрицательное число = " + number);
        } else if (number > 0) {
            System.out.println("Положительное число = " + number);
        } else {
            System.out.println("Число = " + number);
        }
    }
}
