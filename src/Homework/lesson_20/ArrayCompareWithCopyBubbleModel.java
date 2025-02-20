package Homework.lesson_20;
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


        //Метод сортировки пузырьком (Bubble Sort) — это один из простейших алгоритмов сортировки,
        // который многократно проходит по списку, сравнивает соседние элементы и меняет их местами,
        // если они находятся в неправильном порядке. Он повторяет этот процесс, пока весь массив
        // не окажется отсортированным

    }

    private static class MyClass {
        public static void bubbleSort(int[] array) {    //Инициализация переменных
            int n = array.length;                       //n — это длина массива, то есть количество
                                                    // элементов в нем.
            boolean swapped;                            //swapped — логическая переменная, которая отслеживает,
                                                    // были ли обмены элементов в текущем проходе
        //Внешний цикл контролирует количество проходов по массиву
            for (int i = 0; i < n - 1; i++) {           // Каждый проход "выводит" наибольший элемент
            swapped = false;                        //в конец массива

            //Внутренний цикл идет от начала массива
            //до конца, но с каждым проходом внешнего цикла
            // диапазон для внутреннего уменьшается (поскольку в конце
            //массива накапливаются уже отсортированные элементы)
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Обмен элементов
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;        // временная переменная
                    swapped = true;             //устанавливается в true, чтобы показать,
                                                // что хотя бы один обмен был выполнен.
                }
            }
            // Если на текущей итерации не было обменов, массив уже отсортирован
            if (!swapped) break;
        }
    }
    }
}
