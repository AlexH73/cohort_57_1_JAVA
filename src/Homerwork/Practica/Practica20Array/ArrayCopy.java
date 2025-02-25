package Homerwork.Practica.Practica20Array;

import java.util.Arrays;
//Копирования массива с Arrays.copyOf
public class ArrayCopy {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        int[] copy = Arrays.copyOf(original, original.length);  //Создаем копию массива

        System.out.println("Оригинальный массив: " + Arrays.toString(original));
        System.out.println("Копия массива: " + Arrays.toString(copy));
    }
}
