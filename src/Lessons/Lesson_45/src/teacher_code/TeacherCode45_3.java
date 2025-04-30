package Lessons.Lesson_45.src.teacher_code;

public class TeacherCode45_3 {
    public static void main(String[] args) throws InterruptedException {;
        Thread t = new Thread(()->{
            System.out.println("Hello from thread");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Good bye from thread");
        });

        t.start();

        System.out.println("hello");

        Thread.sleep(1000);

        t.join();

        System.out.println("good bye");
    }
}
