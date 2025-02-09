package HomeWork.Lesson_20;

import java.util.Arrays;
import java.util.Random;




public class Arrays20 {
    public static void main(String[] args){

/*
1 Создание и инициализация Массив:

Создайте массив целых чисел размером 10 элементов.
Инициализируйте массив случайными числами от 1 до 100.
*/
        Random random = new Random();

        int [] myArray = new int[10];

        for(int i = 0; i < myArray.length; i ++) {
            myArray[i] = random.nextInt(100);
        }
        System.out.println("Random numbers: " + Arrays.toString(myArray));
 /*

2   Сортировка и поиск:

Используется Arrays.sort()для сортировки массива.
Найдите максимальные и минимальные значения в массиве.
*/
        int[] array = {4, 7, 3, 32, 85, 2, 9, 7};
        Arrays.sort(array);
        System.out.println("Sort array: " + Arrays.toString(array));

        System.out.println("Minimum value: " + array[0]);
        System.out.println("Maximum value: " + array[array.length-1]);


/*
3 Изменение и вывод:

Умножьте каждый элемент массива на число 2.
Вы делаете исходный и измененный массивы в консоли.
*/
        int[] arrays = {4, 7, 3, 32, 85, 2, 9, 7};

        System.out.println("Original array:" + Arrays.toString(arrays));

        for (int i = 0; i < array.length; i ++){
        arrays[i] *= 2;
        }
        System.out.println("Array to the power of 2 = " + Arrays.toString(arrays));
/*
4 Копирование и сравнение:

Сделайте макияж исходного массива с помощью Arrays.copyOf().
Сравните исходный массив и его протез с помощью Arrays.equals()и проведите результат сравнения.
 */
        int[] originalArray = {4, 7, 3, 32, 85, 2, 9, 7};
        System.out.println(Arrays.toString(originalArray));

        int [] copyArray = Arrays.copyOf(originalArray, originalArray.length);
        System.out.println(Arrays.toString(copyArray));

        boolean arrayEquals = Arrays.equals(originalArray, copyArray);
        System.out.println(arrayEquals);




        }
    }

