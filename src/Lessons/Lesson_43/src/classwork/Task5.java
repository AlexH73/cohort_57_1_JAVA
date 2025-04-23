package Lessons.Lesson_43.src.classwork;

public class Task5 {
    public static void main(String[] args) {
        // Императивный подход
        System.out.println("Императивный подход:");
        System.out.println("'Hello' длиннее 3 символов? " + isLong("Hello")); // true
        System.out.println("'Hi' длиннее 3 символов? " + isLong("Hi"));       // false

        // Функциональный подход
        System.out.println("\nФункциональный подход:");
        Checker<String> lengthChecker = s -> s.length() > 3;
        System.out.println("'Stream' длиннее 3 символов? " + lengthChecker.check("Stream")); // true
        System.out.println("'Java' длиннее 3 символов? " + lengthChecker.check("Java"));     // false
    }

    // Императивный метод
    static boolean isLong(String s) {
        return s.length() > 3;
    }
}
