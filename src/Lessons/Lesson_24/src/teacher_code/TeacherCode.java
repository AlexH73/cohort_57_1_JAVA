package Lessons.Lesson_24.src.teacher_code;

import java.util.Arrays;

public class TeacherCode {
    // массив для кеширования значений факториала
    private static int[] factorialValues = {0, 1};

    public static void main(String[] args) {
        // n! = n * (n - 1) * (n - 2) *... * 1;
        // {0, 1, 2, 6, 24, 120}

        int number = 5;

        System.out.println("factorialRecursive(5) = " + factorialRecursive(number));

        int result = 1;

        while (number > 0 && number != 0 && number != 1) {
            result *= number;
            number--;
        }

        System.out.println("result = " + result);
    }

    // time capacity = O(n)
    // space capacity (heap) = O (1)
    // space capacity (stack) = O(n) (тк каждый раз рекурсивно вызываем метод
    // factorialRecursive, что занимает место в стеке и может привести к ошибке переполнения стека - StackOverFlowError)
    public static int factorialRecursive(int number) { // 1
        if(number < 0) {
            return -1;
        } else if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        }

        // 5! = 5 * 4!
        // 4! = 4 * 3!
        // 3! = 3 * 2!
        // 2! = 2 * 1!
        // 1! = 1

        return number * factorialRecursive(number - 1); //  5 * (4 * (3 * (2 * (1 * (1))))
    }



    // time capacity = from O(1) to O(n)
    // space capacity (heap) = O(n) тк мы увеличиваем размер массива factorialValues
    // space capacity (stack) = O(1)
    public static int cacheFactorialIterative(int number) {
        if (number < 0) {
            return -1;
        }

        if (factorialValues.length >= number) {
            return factorialValues[number];
        }

        int result = 1;

//        for (int i = 1; i <= number; i++) {
//            result *= i;
//        }
//        -> оптимизируем данный цикл, с учетом уже имеющихся значений, дополняя новыми:

        // увеличиваем размер массива, чтобы записать туда новые значения
        // допустим, factorialValues уже имеет закешированные значения {0, 1, 2, 6},
        // но теперь мы хотим вычислить факториал 5, тогда:
        // tempArray = {0, 1, 2, 6, 24, 120}
        int[] tempArray = Arrays.copyOf(factorialValues, number + 1);

        // это сделано для того, чтобы:
        for (int i = factorialValues.length; i <= number; i++) {
            tempArray[i] = tempArray[i - 1] * i;
        }

        factorialValues = tempArray;

        return factorialValues[number];
    }


    // time capacity = O(n)  space capacity = O(1)
    public static int factorialIterative(int number) {
        if(number < 0) {
            return -1;
        } else if (number == 0) {
            return 0;
        }

        int result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }




}




