package Lessons.Lesson_33.code.practice.mq;

import java.util.Deque;

public class Starter {
    static SimpleManager manager = new SimpleManager();

    static SimpleConsumer consumer = new SimpleConsumer(manager);
    static SimpleTaskCreator taskCreator = new SimpleTaskCreator(manager);

    public static void main(String[] args) throws InterruptedException {
        startStackTask();
        //startQueueTask();
    }

    static void startQueueTask() {
        // создаем поток для запуска SimpleConsumer.listenQueue()
        Thread consumerThread1 = new Thread(() -> {
            try {
                consumer.listenQueue();
            } catch (InterruptedException e) {
            }
        });
        consumerThread1.start();

        // создаем поток для запуска SimpleTaskCreator.setTasksToQueue()
        Thread consumerCreator1 = new Thread(() -> {
            try {
                taskCreator.setTasksToQueue(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        consumerCreator1.start();
    }


    static void startStackTask() {
        // создаем поток для запуска SimpleConsumer.listenStack()
        Thread consumerThread2 = new Thread(() -> {
            consumer.listenStack();
        });
        consumerThread2.start();


        // создаем поток для запуска SimpleTaskCreator.setTasksToStack(), запускаем его не сразу, а через 3 сек
        Thread consumerCreator2 = new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                taskCreator.setTasksToStack(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        consumerCreator2.start();

        consumerThread2.interrupt();
    }
}