package Practice.ThirdParty;

/**
 * <h1>Рекурсивный вывод чисел</h1>
 * Даны два целых числа A и В. Выведите все числа от A до B включительно,
 * в порядке возрастания, если A < B, или в порядке убывания в противном случае.
 * Использовать рекурсию.
 */
public class RecursivePrintNumbers {
    int a;
    int b;

    // Метод для рекурсивного вывода чисел от A до B включительно
    public void printNumbers(int a, int b) {
        if (a < b) {
            System.out.print(a + " ");
            printNumbers(a + 1, b);
        } else if (a > b) {
            System.out.print(a + " ");
            printNumbers(a - 1, b);
        } else {
            System.out.println(a);
        }
    }
}
