package Lessons.Lesson_45.src.teacher_code;

public class WaitNotifyExample {

    private static final Object lock = new Object();
    private static boolean dataAvailable = false;

    public static void main(String[] args) {
        Thread producerThread = new Thread(new Producer());
        Thread consumerThread = new Thread(new Consumer());

        producerThread.start();
        consumerThread.start();
    }

    static class Producer implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    synchronized (lock) {
                        // Ждем, пока потребитель не обработает данные
                        while (dataAvailable) {
                            lock.wait();
                        }

                        // Генерируем данные
                        System.out.println("Producer: Data produced");
                        dataAvailable = true;

                        // Уведомляем потребителя
                        lock.notify();
                    }

                    // Имитация задержки
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
        }
    }

    static class Consumer implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    synchronized (lock) {
                        // Ждем, пока производитель не создаст данные
                        while (!dataAvailable) {
                            lock.wait();
                        }

                        // Обрабатываем данные
                        System.out.println("Consumer: Data consumed");
                        dataAvailable = false;

                        // Уведомляем производителя
                        lock.notify();
                    }

                    // Имитация задержки
                    Thread.sleep(3000);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
        }
    }
}