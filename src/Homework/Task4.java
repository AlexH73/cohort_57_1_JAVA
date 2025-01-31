package Homework;

// Домашнее задание:   Задача 4

// Автор: Alexander Berlin
// Дата: 31.01.2025

/**
 * Описание: Напишите метод, который принимает два числа и возвращает результат их возведения
 *   в степень. Первое число — основание, второе — показатель степени.
 *   Пример: power(2, 3) -> 8
 *
 *    @see Math#pow(double, double)
 **/
public class Task4 {
    public static void main(String[] args) {
        double result = power(2,3);
        System.out.println("Результат: " + result);

}
public static double power(double base, double exponent){
        return Math.pow(base,exponent);
}

}