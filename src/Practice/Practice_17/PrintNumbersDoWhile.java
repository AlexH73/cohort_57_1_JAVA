// Напишите программу, которая выводит числа от 1 до 10:
//
//    С использованием do-while.

package Practice.Practice_17;

public class PrintNumbersDoWhile {
    public static void main(String[] args) {
        int i = 1;
        // Используем цикл do-while для вывода чисел от 1 до 10
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }
}
