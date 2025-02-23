package Homerwork.Practica.Practica19;
/*Практическое задание
1)Создайте массив из 10 чисел, заполните его квадратами индексов и выведите на экран.*/
public class ArrayTask {
    //Метод для задачи 1: Заполнение массива квадратами индексов
    public static int[] generateSquares(int size) {
        int[] squares = new int[size];
        for (int i = 0; i < size; i ++) {
            squares[i] = i * i;
        }
        return squares;
    }
    //Метод для задачи 2: Поиск максимального элемента
    public static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    //Метод для задачи 3: Вывод строкового массива в обратном порядке
    public static void printArrayReverse(String[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
    //Метод для печати массива чисел:
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.println(num + " ");
        }
    }


}
