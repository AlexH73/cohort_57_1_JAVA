package Lessons.Lesson_34.code.teacher_code;

import java.util.List;

public class ExampleRuntimeException {
    public static void main(String[] args) {
        // примеры не проверяемых ошибок, то есть ошибки, которые не обязательны к проверке:

        // throwIndexExeption();
        // throwNullPointerException();
        // throwArithmeticException();

    }

    private static void throwArithmeticException() {
        int x = 5 /0;
    }

    private static void throwNullPointerException() {
        List<String> list = null;

        list.size();
    }

    private static void throwIndexExeption() {
        int[] nums = {1, 2, 3};

        System.out.println(nums[6]);
    }
}
