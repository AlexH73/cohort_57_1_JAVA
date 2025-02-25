package Homerwork.Practica.Practica20Array;

import java.util.Arrays;
//1. Создание, сортировка и поиск максимального элемента
public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 3, 19, 7, 1, 9, 15}; //Создаем массив

        Arrays.sort(numbers);   //Сортируем массив
        System.out.println("Отсортированный массив: " + Arrays.toString(numbers));

        int maxElement = numbers[numbers.length - 1];   //Последний элемент после сортировки - максимальный
        System.out.println("Максимальный элемент: " + maxElement);
    }
}

