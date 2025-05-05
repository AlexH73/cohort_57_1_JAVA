package Lessons.Lesson_46.src.teacher_code;


import org.w3c.dom.ls.LSOutput;

public class TeacherCode46 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            while (true) {
                // вызывая любой метод из потока, поток переходит в этот метод и метод выполняется в этом потоке,
                // то есть один и тот же метод может выполняться одновременно в разных потоках:
                doSomething();
            }
        });
        // для идентификации потоков можно установить имя потоку, сделать это необходимо перед его запуском
        thread1.setName("My thread");

        // если выполнение потока имеет приоритет, отличный от дефолтного,
        // то есть более важная операция или менее важная,
        // то можно установить приоритет (значения от 1 до 10 включительно), где 1 - мин приоритет, 10 - мах приоритет.
        // Потоки создаются с дефолтным приоритетом 5
        thread1.setPriority(Thread.NORM_PRIORITY);

        // Также, если поток должен быть завершен, как только завершится мейн поток,
        // то можно пометить его как демон-поток.
        // Это означает, что данный поток станет фоновым и завершится, как только завершит свою работу поток мейн.
        thread1.setDaemon(true);

        thread1.start();

        thread1.join(3000);

        //doSomething();

        if (thread1.isAlive()) {
            System.out.printf("Waiting %s\n", thread1.getName());
            thread1.join(3000);
            // существует два способа остановить потока
            //thread1.stop();
            thread1.interrupt();
        }

        System.out.println("Приложение корректно завершило свою работу");
    }

    static void doSomething() {
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println(String.format("Thread name: %s, Thread priority: %d, Thread is daemon = %s, i = %d",
                        Thread.currentThread().getName(),
                        Thread.currentThread().getPriority(),
                        String.valueOf(Thread.currentThread().isDaemon()),
                        i));
                Thread.sleep(100_000);

            } catch (InterruptedException e) {
                System.err.println("Поток был прерван во время сна");
            }
        }
    }
}




