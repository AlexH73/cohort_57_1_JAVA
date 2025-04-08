package EigenesProjeckt;

public class LinearSearch {
    private static boolean linearSearch(int[] nums, int target) {
        for (int num : nums) { // Verwendung einer erweiterten `for`-Schleife für bessere Lesbarkeit
            if (num == target) {
                return true;
            }
        }
        return false;
    }

}
