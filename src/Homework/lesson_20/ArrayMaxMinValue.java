package Homework.lesson_20;

import java.util.Arrays;
import java.util.Random;

/*Используйте Arrays.sort() для сортировки массива.
Найдите максимальное и минимальное значения в массиве.
Изменение и Вывод:*/
public class ArrayMaxMinValue {
    public static void main(String[] args) {

        int[] numbers = new int[10];                        //Создаем массив из 10 элементов
        Random random = new Random();                       //Заполняем массив случайными числами от 1 до 100

        for (int i = 0; i < numbers.length; i++) {          //Генерация чисел от 1 до 100
            numbers[i] = random.nextInt(100) + 1;
        }
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));   //Выводим массив до сортировки

        Arrays.sort(numbers);                                                           //Сортируем массив

        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));   //Выводим отсортированный массив

        //Нахождение минимального и максимального значений
        int min = numbers[0];                               //Минимальный элемент (первый в отсортированном массиве)
        int max = numbers[numbers.length - 1];              //Максимальный элемент (последний в отсортированном массиве)

        System.out.println("min = " + min);                //Выводим min элемент
        System.out.println("max = " + max);                //Выводим max элемент

        //Изменение одного из элементов массива
        numbers[0] = 777;                                  //Заменяем первый элемент на 777

        //Вывод измененного массива
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));

    }
}
