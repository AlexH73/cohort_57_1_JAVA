package Homerwork.Practica.Practica20Array;

import static Homework.lesson_20.QualityOfDetailsAnalysis.i;

//2.Перебор массива с использованием for и for-each
public class ArrayIteration {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Перебор с помощью for:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }

        System.out.println("\nПеребор с помощью for-each:");
        for (int num : numbers) {
            System.out.println(num + " ");
        }
    }
}
