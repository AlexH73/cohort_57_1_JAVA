package Homework.Homework_19;

public class FindMaxNumber {
    /**
     * Задача 10: Напишите метод, который принимает два целых числа и возвращает наибольшее.
     * Пример: findMax(10, 20) -> 20
     *
     * @see Math#max(int, int)
     */
    public static void main(String[] args) {
        // Пример использования метода findMax
        System.out.println("Возврат максимального числа: " + findMax(10, 20));
    }
    public static int findMax(int a, int b) {

        // Используем встроенный метод Math.max для возврата большего из двух чисел.
        return Math.max(a, b);
    }
}
