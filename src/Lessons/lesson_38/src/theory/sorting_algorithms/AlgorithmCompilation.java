package Lessons.lesson_38.src.theory.sorting_algorithms;

import java.util.Arrays;

public class AlgorithmCompilation {
    private static int[] staticArr;

    public static void main(String[] args) {
        generateRandomArray(100000);

        Sorting[] sortings = {new BubbleSort(), new ShellSort(), new HeapSort(), new InsertionSort(), new MergeSort(),
                new QuickSort(),
                new SelectionSort()};

        //System.out.println(Arrays.toString(staticArr));

        for (Sorting sorting : sortings) {
            sort(sorting);
        }
    }

    static void sort(Sorting algorithm) {
        int[] array = Arrays.copyOf(staticArr, staticArr.length);
        String format = "%-15s: %12d ns%n";

        long start = System.nanoTime();
        algorithm.sort(array);
        long end = System.nanoTime();

        System.out.printf(format, algorithm.getClass().getSimpleName(), (end - start));
    }

    private static int[] generateRandomArray(int size) {
        staticArr = new int[size];
        for (int i = 0; i < size; i++) {
            staticArr[i] = (int) (Math.random() * size);
        }
        return staticArr;
    }
}
