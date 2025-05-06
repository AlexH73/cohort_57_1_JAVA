package Homework.lesson_46;

public class Main {
    public static void main(String[] args) {
        Thread t = new Thread(() -> System.out.println("Hello from thread"));
        t.run();
        System.out.println("Main done");

        Thread t1 = new Thread(() -> {
            System.out.println("Running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Interrupted");
            }
        });
        t1.start();
        t1.interrupt();

/*        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.err.println("Was interrupted");
            }
        });

        t2.start();
        Thread.sleep(1000);
        t2.interrupt();
        t2.join();
        System.out.println("Main finished");*/
        // C. Ошибка компиляции

        Thread.currentThread().setName("MainThread");
        System.out.println(Thread.currentThread().getName());

        Thread t3 = new Thread(() -> System.out.println(Thread.currentThread().isDaemon()));
        t3.setDaemon(true);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t3.start();
    }
}
