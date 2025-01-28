package Lessons.Lesson_19.teachers_code;



public class Lesson19 {
    //  == #

    /*
    - многострочный комментарий
    все что находится между этими символвами относится к комментарию
     */

    /**
     * таким образом обычно обозначается документация для кода, то есть то, как этот код использовать.
     */

    public static void main(String[] args) {
        byte x = 12;

        sayHelloTo(x);
    }

    public static void sayHelloTo() {
        System.out.println("Hello, user");
    }

    public static void sayHelloTo(String name) {
        System.out.printf("Hello, %s \n", name);
    }

    public static void sayHelloTo(long num) {

        System.out.printf("Hello, %n \n", num);
    }


    public static void sayGoodbye() {

        System.out.println("Goodbye!");

        "asdasd".length();

        return;
    }

    public static void sayHello() {
        System.out.println("Hello!");
    }

    public static double returnRandomNumber() {

        double random = Math.random();

        return random;
    }







    public static void isOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("четное");
        } else {
            System.out.println("не четное");
        }
    }

}
