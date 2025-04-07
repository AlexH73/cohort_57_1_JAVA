package Lessons.Lesson_37.src.teacher_code;


public class TeacherCode {
    private static long counter = 1;

    public static void main(String[] args) {
        // посчитать факториал числа.
        // n!
        // 5! = 1 * 2 * 3 * 4 * 5 = 5 * 4! = 5 * 4 * 3!
//        System.out.println("countFactorial(5) = " + countFactorial(50));
//        System.out.println("countFactorialRecursive(5) = " + countFactorialRecursive(50));
//
//        methodB();

        System.out.print("[");
        for (int i = 0; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }

    private static long countFactorial(long num) {
        if (num <= 0) {
            return -1;
        }
        if (num == 1) {
            return 1l;
        }

        long result = 1;

        while (num > 0) {
            result *= num;
            num--;
        }

        return result;
    }

    private static long countFactorialRecursive(long num) {
        if (num <= 0) {
            return -1;
        }
        if (num == 1) {
            return 1l;
        }

        return num * countFactorialRecursive(num - 1);
    }

    private static void methodA() {
        System.out.println("Method A: " + counter);
        counter++;
        if (counter > 100) {
            return;
        } else {
            methodB();
        }

    }

    private static void methodB() {
        System.out.println("Method B: " + counter);
        counter++;
        methodC();


    }

    private static void methodC() {
        System.out.println("Method C: " + counter);
        counter++;
        methodA();
    }


}







