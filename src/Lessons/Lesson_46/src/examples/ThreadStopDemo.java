package Lessons.Lesson_46.src.examples;

public class ThreadStopDemo {

    public static void main(String[] args) {
        // Создаем поток, который выполняет бесконечную работу с паузами
        Thread worker = new Thread(() -> {
            int i = 0;
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Working: " + i++);
                try {
                    Thread.sleep(300); // имитируем работу
                } catch (InterruptedException e) {
                    System.out.println("Interrupted during sleep");
                    // Восстанавливаем флаг прерывания, потому что sleep сбрасывает его
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("Thread exiting after interruption");
        });

        worker.start(); // Запускаем поток

        try {
            Thread.sleep(1500); // main ждет немного
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread interrupts worker thread");
        worker.interrupt(); // Мягко прерываем поток
    }
}