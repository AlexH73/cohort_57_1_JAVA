package Homework.lesson_38;

public class Main {
        public static void main(String[] args) {
            BinarySearchHomework search = new BinarySearchHomework();

            int[] arr = {1, 2, 2, 2, 3, 4, 4, 5};
            int target = 2;

            System.out.println("Первое вхождение: " + search.firstCount(arr, target));
            System.out.println("Последнее вхождение: " + search.lastCount(arr, target));
        }
    }

