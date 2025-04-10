package Other;

public class practice_38 {
    public static void main(String[] args) {
        int[] sorted = {1, 1, 2, 4, 5, 7, 34, 6456, 64323};
        int[] notSorted = {1, 1, 2, 4, 12, 5, 7, 34, 6456, 64323};

        System.out.println("isSorted(sorted) = " + isSorted(sorted));
        System.out.println("isSorted(notSorted) = " + isSorted(notSorted));

    }

    // [1, 1, 2, 3, 4, 7]
    private static boolean isSorted(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                return false;
            }
        }

        return true;
    }
}
