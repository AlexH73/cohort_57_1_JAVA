package EigenesProjeckt;

import java.util.Random;

public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedArray = getArray(100);

        testBinarySearch(sortedArray, new int[]{12, 120, 0, 10});
    }


    private static int[] getArray(int size) {
        int[] result = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            result[i] = random.nextInt(1000) - 500; // Werte zwischen -500 und 499
        }

        return result;
    }


    private static void testBinarySearch(int[] sortedArray, int[] targets) {
        for (int target : targets) {
            System.out.println("Suche nach: " + target);
            System.out.println("Gefunden: " + binarySearch(sortedArray, target));
            System.out.println("----------------------------");
        }
    }

    private static boolean binarySearch(int[] nums, int target) {
        int beginIndex = 0;
        int endIndex = nums.length - 1;
        int counter = 0;

        while (beginIndex <= endIndex) {
            counter++;
            int medianIndex = beginIndex + (endIndex - beginIndex) / 2; // Vermeidung von Overflow bei großen Arrays

            if (nums[medianIndex] == target) {
                System.out.println("Durchläufe: " + counter);
                System.out.println("2^Durchläufe: " + Math.pow(2, counter));
                return true;
            }

            if (nums[medianIndex] > target) {
                endIndex = medianIndex - 1;
            } else {
                beginIndex = medianIndex + 1;
            }
        }

        System.out.println("Durchläufe: " + counter);
        System.out.println("2^Durchläufe: " + Math.pow(2, counter));
        return false;
    }

}
