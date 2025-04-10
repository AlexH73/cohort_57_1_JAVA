package Lessons.Lesson_39.src.teacher_code;

public class Classwork39 {
    public static void main(String[] args) {
        //3 -> 1 + (1 + 2 + 3) -> 1 + 1 + (1 + 1) + (1 + 2)
        // 5 = 1 + (1 + 2 + 3 + 5 + 8) -> 20
        // 6 = 1 + (1 + 2 + 3 + 5 + 8 + 13) -> 33
        // 1 -> 1
        // 2 -> 2
        // 0 и меньше -> -1;
    }

    static int fibonacci(int number) {
        if (number <= 0) {
            return -1;
        }
        if (number == 1) {
            return 1;
        }
        if (number == 2 ) {
            return 2;
        }
        int a = 0;
        int b = 1;
        int c;
        for (int i = 2; i < number ; i++) {
            c=a+b;
            a=b;
            b=c;

        }

        return -1;
    }
    //7= 1+(1+2+3+5+8+13+21)=54
    //10 = 1+1+2+3+5+8+13+21+34+55+89=232
}