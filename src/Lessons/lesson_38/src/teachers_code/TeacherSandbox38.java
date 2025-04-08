package Lessons.lesson_38.src.teachers_code;

public class TeacherSandbox38 {
    public static void main(String[] args) {
        int[] nums  = {12, 4, 87, -23, 0, 1, 7, 343, 224534};

        int target = 999;
        int index = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                index = i;
                break;
            }
        }
    }


    static void binarySearch() {
        int[] nums = {1, 2, 3, 40, 60, 789, 1235};

        int[] negativeArr = {23, 0, -12, -34, -345, -35653};

        int target = 10;

        // операции с массивами, которые выполняются за константное (одинаковое) время,
        // вне зависимости от длины массива
        // 1. получение длины массива. Вне зависимости от того,
        // сколько в массиве элементов - всегда константно.
        int length = nums.length;

        // 2. получение значения ячейки по индексу. Вне зависимости от того,
        // сколько в массиве элементов - всегда константно.
        int element = nums[nums.length / 2];







    }




}
