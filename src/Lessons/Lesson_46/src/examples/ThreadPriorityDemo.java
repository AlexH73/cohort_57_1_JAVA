package Lessons.Lesson_46.src.examples;

public class ThreadPriorityDemo {

    public static void main(String[] args) {
        // Создаем поток с низким приоритетом
        Thread lowPriorityThread = new Thread(() -> {
            System.out.println("Low priority thread started");
        }, "LowPriority");

        // Создаем поток с высоким приоритетом
        Thread highPriorityThread = new Thread(() -> {
            System.out.println("High priority thread started");
        }, "HighPriority");

        // Устанавливаем приоритеты
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY); // приоритет 1
        highPriorityThread.setPriority(Thread.MAX_PRIORITY); // приоритет 10

        // Запускаем оба потока
        lowPriorityThread.start();
        highPriorityThread.start();

        // Также выводим приоритет главного потока
        System.out.println("Main thread priority: " + Thread.currentThread().getPriority());
    }
}