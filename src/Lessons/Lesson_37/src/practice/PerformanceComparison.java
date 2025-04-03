package Lessons.Lesson_37.src.practice;

public class PerformanceComparison {

    public static void main(String[] args) {
        int number = 100; // Выберите число для вычисления факториала. Будьте осторожны с большими числами, так как это может привести к переполнению стека в рекурсивном методе.


        // Измерение времени для итеративного метода
        long startTime = System.nanoTime();
        long iterativeResult = factorialIterative(number);
        long endTime = System.nanoTime();
        long durationIterative = endTime - startTime;

        System.out.println("Итеративный метод: " + iterativeResult + ", Время выполнения: " + durationIterative + " наносекунд");



        // Измерение времени для рекурсивного метода
        long startTimeR = System.nanoTime();
        long recursiveResult = factorialRecursive(number);
        long endTimeR = System.nanoTime();
        long durationRecursive = endTimeR - startTimeR;

        System.out.println("Рекурсивный метод: " + recursiveResult + ", Время выполнения: " + durationRecursive + " наносекунд");

    }

    public static long factorialRecursive(int n) {
        if (n <= 1) return 1;
        return n * factorialRecursive(n - 1);
    }

    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

