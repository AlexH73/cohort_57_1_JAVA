package Lessons.Lesson_45.src.teacher_code;

public class TeacherCode45_2 {
    public static void main(String[] args) {
        Runnable runnable= () -> {
            for (int i = 0; i < 100; i++) {
                System.out.print(i + " ");
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (i == 99) {
                    System.out.println();
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        for (int i = 0; i < 100; i++) {
            System.out.print(i + " ");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (i == 99) {
                System.out.println();
            }
        }
    }
}
