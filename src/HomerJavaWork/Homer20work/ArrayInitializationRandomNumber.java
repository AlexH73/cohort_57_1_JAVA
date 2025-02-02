package HomerJavaWork.Homer20work;
/*Создание и Инициализация Массива:

        Создайте массив целых чисел размером 10 элементов.
        Инициализируйте массив случайными числами от 1 до 100.
        Сортировка и Поиск:*/
import java.util.Arrays;
import java.util.Random;

public class ArrayInitializationRandomNumber {
    public static void main(String[] args) {

        int[] numbers = new int[10];                        //Создаем массив из 10 элементов
        Random random = new Random();                       //Заполняем массив случайными числами от 1 до 100

        for (int i = 0; i < numbers.length; i++) {          //Генерация чисел от 1 до 100
            numbers[i] = random.nextInt(100) + 1;
        }
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));   //Выводим массив до сортировки

        Arrays.sort(numbers);                                                           //Сортировка массива

        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));   //Вывод отсортированного массива

    }
}
