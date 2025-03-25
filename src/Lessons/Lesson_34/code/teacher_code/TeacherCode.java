package Lessons.Lesson_34.code.teacher_code;

public class TeacherCode {
    private static int counter = 0;

    public static void main(String[] args) {
        getStackOverflowException();
    }

    public static void getStackOverflowException() {
        System.out.printf("Attempt %d before StackOverFlow error has been throwed\n", counter);
        counter++;

        getStackOverflowException();
    }
}




