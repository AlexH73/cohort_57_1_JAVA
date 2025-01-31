package Homework.Homework_19;

public class NumberPower {
    /**
     * Задача 4: Напишите метод, который принимает два числа и возвращает результат их возведения
     * в степень. Первое число — основание, второе — показатель степени.
     * Пример: power(2, 3) -> 8
     *
     * @see Math#pow(double, double)
     */
    public static void main(String[] args) {
        System.out.println("Возведение чисел (2, 3) в степень: " + power(2, 3));
    }

    public static double power(double base, double exponent) {

        return Math.pow(base, exponent);
    }
}
