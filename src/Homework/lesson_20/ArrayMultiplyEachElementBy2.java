package Homework.lesson_20;

import java.util.Arrays;
import java.util.Random;

/*Умножьте каждый элемент массива на число 2.
Выведите исходный и измененный массивы в консоль.
Копирование и Сравнение:*/
public class ArrayMultiplyEachElementBy2 {
    public static void main(String[] args) {

        int[] numbers = new int[10];                        //Создаем массив из 10 элементов
        Random random = new Random();                       //Заполняем массив случайными числами от 1 до 100

        for (int i = 0; i < numbers.length; i++) {          //Генерация чисел от 1 до 100
            numbers[i] = random.nextInt(100) + 1;
        }
        System.out.println("Исходный массив: " + Arrays.toString(numbers));   //Выводим исходный массив

        int[] copiedNumbers = Arrays.copyOf(numbers,numbers.length);          //Создаем копию массива перед изменением

        for (int i = 0; i < numbers.length; i++) {                            //Умножаем каждый элемент массива на 2
            numbers[i] *= 2;
        }

        System.out.println("Массив после умножения на 2: " + Arrays.toString(numbers)); //Выводим измененный массив

        //Сравнение исходного и измененного массива
        boolean areEqual = Arrays.equals(copiedNumbers, numbers);
        System.out.println("Совпадают ли исходный и отсортированный массивы?" + (areEqual ? "Да" : "Нет"));


    }
}
