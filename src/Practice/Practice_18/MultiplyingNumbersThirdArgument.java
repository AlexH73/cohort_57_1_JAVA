//Задание 5: Умножение чисел с опциональным третьим аргументом
//Код на Python:
//
//def multiply(a, b, c=None):
//if c is None:
//return a * b
//return a * b * c
//
//print(multiply(2, 3))      # 6
//print(multiply(2, 3, 4))   # 24

package Practice.Practice_18;

public class MultiplyingNumbersThirdArgument {
    public static void main(String[] args) {
        System.out.println(multiply(2, 3));      // 6
        System.out.println(multiply(2, 3, 4));   // 24
    }

    // Метод для умножения двух чисел
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Перегруженный метод для умножения трех чисел
    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }
}
