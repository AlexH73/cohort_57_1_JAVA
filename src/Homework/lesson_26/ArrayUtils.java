package Homework.lesson_26;

public class ArrayUtils {
    public int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();
        int m = arrayUtils.findMax(new int[]{5, 3, 8, 1});
        System.out.println("Max: " + m);
    }
}
