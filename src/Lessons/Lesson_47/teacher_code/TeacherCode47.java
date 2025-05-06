package Lessons.Lesson_47.teacher_code;


public class TeacherCode47 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("hello from thread 2");
        };

        Thread thread1 = new Thread(
                () -> {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("hello from thread 1");
                }
        );

        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();
    }
}




