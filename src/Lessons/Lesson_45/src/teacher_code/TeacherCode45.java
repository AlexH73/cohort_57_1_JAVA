package Lessons.Lesson_45.src.teacher_code;


import java.util.concurrent.atomic.AtomicInteger;

public class TeacherCode45 {
    private static final Object LOCK = new Object();
    static volatile int counter = 0;


    // A -> copy counter value in to  processor cache -> do some logic in cache  -> return new val from proc cache into ram
    // B -> copy counter value in to  processor cache -> do some logic in cache  -> return new val from proc cache into ram

    // after volatile:
    // everything in ram
    // A -> processor do it's job in ram without cache
    // B -> processor do it's job in ram without cache



    static AtomicInteger atomicCounter = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
//        increase(); //  A
//        increase(); //  B
//
//        Thread.sleep(1000);
//
//        System.out.println("counter = " + counter);
//        System.out.println("atomicCounter = " + atomicCounter.get());

        Object lock_a = new Object();
        Object lock_b = new Object();

        Thread a = new Thread(() -> {
            try {
                deadlockExample(lock_a, lock_b);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread b = new Thread(() -> {
            try {
                deadlockExample(lock_b, lock_a);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        a.setName("AAAAAAA");
        b.setName("BBBBBBB");

        a.start();
        b.start();
    }


    public static void deadlockExample(Object first, Object second) throws InterruptedException {
        synchronized (first) {
            Thread.sleep(300);
            synchronized (second) {
                System.out.println("synchronized");
            }
        }
    }

    private static void increase() throws InterruptedException {
        Thread thread = new Thread(() ->
        {
            for (int i = 0; i < 1_000_000; i++) {
                // данный метод увеличивает значение данной переменной на 1
                atomicCounter.incrementAndGet();
//                increaseCounter();

                synchronized (LOCK) {
                    // копируем текущее значение
                    // увеличиваем текущее значение на 1
                    // перезаписываем значение в переменную counter
                    counter++; // 10  - 12

                    try {
                        LOCK.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }

            }
        });
        thread.start();
    }

    private synchronized static void increaseCounter() {
        // difficult logic
        counter++;
    }



}




