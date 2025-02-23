package Homerwork.Practica.Practica19;

import static Homerwork.Practica.Practica19.ArrayTask.*;

public class ArrayTaskTest {
    public static void main(String[] args) {
        //Проверка задачи 1: Массив квадратов индексов
        System.out.println("===== Проверка задачи 1 ====");
        int[] squares = generateSquares(10);
        printArray(squares);

        //Проверка задачи 2: Поиск максимального элемента
        System.out.println("===== Проверка задачи 2 ====");
        int[] numbers = {12, 45, 7, 54, 23};
        int max = findMax(numbers);
        System.out.println("Максимальный элемент: " + max);

        //Проверка задачи 3: Обратный вывод массива строк
        System.out.println("===== Проверка задачи 3 ====");
        String[] words = {"Java", "Python", "C++", "JavaScript"};
        printArrayReverse(words);
    }
}
