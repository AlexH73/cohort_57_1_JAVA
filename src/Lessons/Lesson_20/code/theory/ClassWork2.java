package Lessons.Lesson_20.code.theory;

public class ClassWork2 {

    public static void main(String[] args) {
        int[] nums = new int[100];

        // получаем рандомное число
        int random = (int) Math.random() * 100;

        nums[0] = (int) Math.random() * 100;
        nums[1] = (int) Math.random() * 100;
        nums[2] = (int) Math.random() * 100;
        nums[3] = (int) Math.random() * 100;
        // ...
        nums[99] = (int) Math.random() * 100;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100);

            System.out.println(nums[i]);
        }
    }
}
