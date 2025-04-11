package Homework.lesson_39;

public class Main {
    public static void main(String[] args) {
        BinarySearchHomework bsh = new BinarySearchHomework();

        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;

        int firstIndex = bsh.firstCount(arr, target);
        int lastIndex = bsh.lastCount(arr, target);

        System.out.println("Массив:");
        for (int num : arr) {
            System.out.println(num + " ");
        }

        System.out.println("\nЦелевое значение: " + target);
        System.out.println("Первое вхождение: " + firstIndex);
        System.out.println("Последнее вхождение: " + lastIndex);

    }

}
