package Lessons.lesson_38.src.teachers_code;

public class TeacherSandbox38_2 {

    public static void main(String[] args) {
        int[] myLocalNums = {12, 5, -23, 898, 54, 4, 4, 5, 4, 0, 189};
        int myTarget = -8900;

        int[] myLocalNums2 = {12, 5, -23, 8, 0, 189};
        int myTarget2 = -746;

        int[] myLocalNums3 = {12, 5, -23, 898, 54, -23, 898, 54, 4, 4, 5, 4, 0, 189};
        int myTarget3 = 567;

        int[] sortedArray = getArray(65534);
//        binarySearch(sortedArray, 12);
//        binarySearch(sortedArray, 120);
//        binarySearch(sortedArray, 0);
        binarySearch(sortedArray, 10);


    }

    // nums = {12, 5, -23, 898, 54, 4, 4, 5, 4, 0, 189}
    // target = 4
    // O(n)
    private static boolean linearSearch(int[] nums, int target) {
        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] == target) {
                return true;
            }
        }
        return false;
    }

    //O(log n)
    private static boolean binarySearch(int[] nums, int target) {
        int beginIndex = 0;
        int endIndex = nums.length - 1;
        int medianIndex = (beginIndex + endIndex) / 2;
        int counter= 1;

        while (beginIndex <= endIndex) {
            counter++;

            if(nums[medianIndex] == target) {
                System.out.println(counter);
                System.out.println(Math.pow(2, counter));
                return true;
            }

            if (nums[medianIndex] > target) {
                endIndex = medianIndex - 1;
                medianIndex = (beginIndex + endIndex) / 2;
            } else {
                beginIndex = medianIndex + 1;
                medianIndex = (beginIndex + endIndex) / 2;
            }
        }

        System.out.println(counter);
        System.out.println(Math.pow(2, counter));
        return false;
    }

    private static int[] getArray(int size) {
        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            result[i] = i;
        }

        return result;
    }
}
