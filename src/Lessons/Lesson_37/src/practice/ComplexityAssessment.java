package Lessons.Lesson_37.src.practice;

public class ComplexityAssessment {

    // Метод 1
    public static void method1(int n) {
        System.out.println("Constant operation");
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

    // Метод 2
    public static void method2(int n) {
        for (int i = 0; i < n; i += 2) {
            System.out.println(i);
        }
    }

    // Метод 3
    public static void method3(int n) {
        System.out.println("Start");
        System.out.println("Another constant operation");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + j);
            }
        }
    }

    // Метод 4
    public static void method4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i * j);
            }
        }
    }

    // Метод 5
    public static void method5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j += 2) {
                System.out.println(i + j);
            }
        }
    }

    // Метод 6
    public static void method6(int n) {
        System.out.println(n * 10);
    }

    // Метод 7
    public static void method7(int n) {
        System.out.println("Constant operation");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.println(i + j + k);
                }
            }
        }
    }

    // Метод 8
    public static void method8(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i * j);
            }
        }
    }
}

