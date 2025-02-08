package Homework;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework_20_21_Yulia {
    public static void main(String[] args) {

        // 1. Задача: Создание и Инициализация Массива:

        // Создайте массив целых чисел размером 10 элементов.
        // Инициализируйте массив случайными числами от 1 до 100.

        int[] numberArray = new int[10];

        Random random = new Random();

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = random.nextInt(100) +1;
        }

        System.out.println("Массив случайных чисел:");
        for (int j : numberArray) {
            System.out.println(j);
        }





        // 2. Задача: Сортировка и Поиск:

        //Используйте Arrays.sort() для сортировки массива.
         // Найдите максимальное и минимальное значения в массиве.

        
        Arrays.sort (numberArray);

        System.out.println("Отсортированный массив:");

        for (int j : numberArray) {
            System.out.println(j);
        }

        System.out.println("Максимальное значение:" + numberArray[9]);
        System.out.println("Минимальное значение:" + numberArray[0]);










        // 3. Задача: Изменение и Вывод:
        // Умножьте каждый элемент массива на число 2.
       // Выведите исходный и измененный массивы в консоль.

        int[] numberArray2 = {33, 75, 49, 18, 88, 17, 56, 41, 9, 10};

        System.out.println("Исходный массив:");

        for (int j : numberArray2) {
            System.out.println(j);
        }

        System.out.println("Умноженный массив:");

        for (int i = 0; i < numberArray2.length; i++) {
            numberArray2[i] *= 2;
            System.out.println(numberArray2[i]);
        }







        // 4. Задача:Копирование и Сравнение:
        //  Создайте копию исходного массива используя Arrays.copyOf().
        // Сравните исходный массив и его копию с помощью Arrays.equals() и выведите результат сравнения.

        int[] numberArray3 = Arrays.copyOf(numberArray2, numberArray2.length);

        boolean ArraysEqual = Arrays.equals(numberArray2, numberArray3);

        System. out.println("Результат сравнения: " + ArraysEqual);





        // 5. Задача:
        //Создайте массив целых чисел, который содержит случайное распределение значений -1, 0 и 1, имитируя партию деталей с завода.
        //Рассчитайте и выведите в консоль процентное соотношение каждого типа деталей в партии.
        //Выведите в консоль процентное соотношение бракованных, требующих доработки и идеальных деталей.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста введите число производимых деталей: ");
        int n = scanner.nextInt();
        int[] numberArray5 = new int[n];

        for (int i = 0; i < n; i++) {
            numberArray5[i] = random.nextInt(3) - 1;
        }

        double broken = 0;
        double partial = 0;
        double perfect = 0;

        for (int i = 0; i < n; i++) {
            int temp = numberArray5[i];
            if (temp == 1) {
                perfect++;
            }
            else if (temp == 0) {
                partial++;
            }
            else {
                broken++;
            }
        }

        System.out.println("Процент идеальных деталей: " + (perfect/n)*100 + "%");
        System.out.println("Процент недоделанных деталей: " + (partial/n)*100 + "%");
        System.out.println("Процент бракованных деталей: " + (broken/n)*100 + "%");
    }
}
