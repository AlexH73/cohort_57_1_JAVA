package Lessons.lesson_38.src.theory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LinearSearch {

    public static void main(String[] args) {
        Integer[] array = createRandomNotSortedArray(100_000);
        int element = 12;

        // System.nanoTime() - возвращает текщее время в наносекнудах
        long startSearching = System.nanoTime();

        int index = linearSearch(array, element);

        long endSearching = System.nanoTime();

        if (index == -1) {
            System.out.printf("Линейный поиск в неотсортированном массиве длинной %d занял %d нс, " +
                    "элемент не был найден\n", array.length, endSearching - startSearching);
        } else {
            System.out.printf("Линейный поиск в неотсортированном массиве длинной %d занял %d нс, " +
                    "элемент был найден\n", array.length, endSearching - startSearching);
        }
    }


    public static int  linearSearch(Integer[] array, int element ) {
        int index = -1; // если элемента нет в массиве

        // реализация линейного поиска

        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }

        return index;
    }

    private static Integer[] createRandomNotSortedArray(int arrayLength) {
        Set<Integer> set = new HashSet<>();
        Random random = new Random();
        int size = set.size(); // 0

        // заполняем массив лишь уникальными элементами, повторяем до тех пор, пока не будет полностью заполнен
        while (size < arrayLength){
            int randomNumber = random.nextInt(0, arrayLength + 1);
            if (!set.contains(randomNumber)) {
                set.add(randomNumber);
                size = set.size(); // эквивалентно size++;
            }
        }

        return set.toArray(new Integer[0]);
    }
}
