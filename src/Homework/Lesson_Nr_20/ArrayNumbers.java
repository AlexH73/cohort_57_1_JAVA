package Homework.Lesson_Nr_20;

// Домашнее задание:

// Автор: Alexander Berlin
// Дата: ${DATE}

import java.util.Random;

/**
 * Описание:
 * Создайте массив целых чисел размером 10 элементов.
 * Инициализируйте массив случайными числами от 1 до 100.
 **/
 //Создаём каркас класса и метода main (это основа программы)
public class ArrayNumbers{
    public static void main(String[] args) {

        int[] numbers = new int[10]; // Объявление и выделение памяти. Массив целых чисел размером 10 элементов
        Random random = new Random(); // Создаём объект Random для генерации случайных чисел

        // Инициализируем массив случайными числами от 1 до 100
        // nextInt(100) генерирует числа от 0 до 99,поэтому добавляем 1
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) +1;


        }
        for (int num: numbers){
            System.out.println(num + " ");
        }


        }

 }
