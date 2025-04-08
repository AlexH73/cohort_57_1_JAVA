package Lessons.lesson_38.src.students_code;

public class StudentSandbox38 {
    public static void main(String[] args) {
        int [] NewNums = {12, 5, -23, 898, 54, 4, 4, 5, 4, 0, 189};
        int [] NewTarget = 4;

        linearSearch(NewNums, NewTarget);


        // nums = {12, 5, -23, 898, 54, 4, 4, 5, 4, 0, 189}
        // target = 4
        private static boolean linearSearch ( int[] nums, int target){
            for (int i = 0; i <= nums.length - 1; i++) {
                if (nums[i] == target) {
                    return true;
                }
            }
            return false;
        }

    }
}
