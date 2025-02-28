package Homework.lesson_26.HomeworkYulia_26;

public class ArrayUtils {

    public int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым.");
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayUtils utils = new ArrayUtils();
        int max = utils.findMax(new int[]{5, 3, 8, 1});
        System.out.println("Max: " + max);
    }
}