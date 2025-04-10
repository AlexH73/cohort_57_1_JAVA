package Homerwork.Practica38.Classsnay;

import java.util.Arrays;

public class SortedMain {
    public static void main(String[] args) {
        int[] sorted = {1, 1, 2, 4, 5, 7, 34, 6456, 64323};
        int[] notSorted = {1, 1, 2, 4, 12, 5, 7, 34, 6456, 64323};

        System.out.println("isSorted(sorted) = " + isSorted(sorted));
        System.out.println("isSorted(notSorted) = " + isSorted(notSorted));

        if (!isSorted(notSorted)) {
            System.out.println("Before sort: " + Arrays.toString(notSorted));
            // sort it!
            bubbleSort(notSorted);
            System.out.println("After sort: " + Arrays.toString(notSorted));
        }

    }
    //Можем узнать отсортирован массив или не отсортирован:
    private static boolean isSorted(int[] nums) {
        //not null not empty....

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                return false;//массив не отсортирован
            }
        }

        return true;//массив отсортирован
    }
//Если текущее число меньше, чем предыдущее число, то мы должны поменять значения местами
    private static void bubbleSort(int[] nums) {
        int counter = 1;
        boolean sorted = true;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                counter++;
                if ( nums[j - 1] > nums[j]) {
                    sorted = false;//если что-то поменялось - это точно был не отсортированный массив
                    int temp = nums[j - 1];//временная переменная сохранит нам исходное значение
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
            System.out.println(Arrays.toString(nums));
            if (sorted) {
                break;
            }
        }
    }

}
