//Задание 3: Сложение двух чисел
//Код на Python:
//
//def add(a, b):
//return a + b
//
//result = add(5, 3)
//print(f"Result: {result}")

package Practice.Practice_18;

public class AddingNumbers {
    public static void main(String[] args) {
        int result = add(5, 3);  // Вызов метода add с аргументами 5 и 3
        System.out.println("Результат: " + result);
    }

    // Метод для сложения двух чисел
    public static int add(int a, int b) {
        return a + b;
    }
}
