package HomerJavaWork.Homer20work;
/*Создайте копию исходного массива используя Arrays.copyOf().
Сравните исходный массив и его копию с помощью Arrays.equals() и выведите результат сравнения.
Дополнительно: Попробуйте реализовать собственный алгоритм сортировки (например, сортировку пузырьком).*/

import java.util.Arrays;
import java.util.Random;

public class ArrayCompareWithCopyBubbleModel {
    public static void main(String[] args) {

        int[] numbers = new int[10];                        //Создаем массив из 10 элементов
        Random random = new Random();                       //Заполняем массив случайными числами от 1 до 100

        for (int i = 0; i < numbers.length; i++) {          //Генерация чисел от 1 до 100
            numbers[i] = random.nextInt(100) + 1;
        }
        System.out.println("Исходный массив: " + Arrays.toString(numbers));   //Выводим исходный массив

        int[] copiedNumbers = Arrays.copyOf(numbers,numbers.length);          //Создаем копию массива

        Arrays.sort(numbers);                                                 //Сортируем массив с помощью Arrays.sort()
        System.out.println("Отсортированный массив " + Arrays.toString(numbers));

        //Сравнение исходного и сортированного массива
        boolean areEqual = Arrays.equals(copiedNumbers, numbers);
        System.out.println("Совпадают ли исходный и отсортированный массивы?" + (areEqual ? "Да" : "Нет"));

        //Нахождение минимального и максимального значений
        int min = numbers[0];                               //Минимальный элемент (первый в отсортированном массиве)
        int max = numbers[numbers.length - 1];              //Максимальный элемент (последний в отсортированном массиве)

        System.out.println("min = " + min);                //Выводим min элемент
        System.out.println("max = " + max);                //Выводим max элемент

        //Сортировка пузырьком





    }
}
