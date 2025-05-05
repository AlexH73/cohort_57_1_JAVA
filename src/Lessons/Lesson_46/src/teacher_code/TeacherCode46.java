package Lessons.Lesson_46.src.teacher_code;


public class TeacherCode46 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            while (true) {
                doSomething();
            }
        });

        thread1.setName("My thread");
        thread1.setPriority(Thread.NORM_PRIORITY);
        thread1.setDaemon(true);

        thread1.start();

        thread1.join(3000);

        doSomething();

        if (thread1.isAlive()) {
            System.out.printf("Waiting %s\n", thread1.getName());
            thread1.join(3000);
            // thread1.stop();
            thread1.interrupt();
        }
    }

    static void doSomething() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(String.format("Thread name: %s, Thread priority: %d, Thread is daemon = %s, i = %d",
                        Thread.currentThread().getName(),
                        Thread.currentThread().getPriority(),
                        String.valueOf(Thread.currentThread().isDaemon()),
                        i));
            } catch (InterruptedException e) {
                    throw new RuntimeException(e);
            }
        }
    }
}




