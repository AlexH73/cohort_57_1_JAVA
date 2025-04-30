package Lessons.Lesson_45.src.practice;

public class MultithreadingIntro {

    /**
     * Пример 1.
     * Создание потока через анонимный класс, наследующий Thread.
     */
    public static void example1_threadAnonymousClass() {
        Thread t = new Thread() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous Thread subclass");
            }
        };
        t.start();
    }

    /**
     * Пример 2.
     * Создание потока через реализацию интерфейса Runnable.
     * Runnable — это функциональный интерфейс, т.е. содержит только один абстрактный метод run().
     * Благодаря этому можно использовать лямбда-выражение для задания логики потока.
     */
    public static void example2_runnable() {
        Runnable task = () -> System.out.println("Hello from Runnable!");
        Thread t = new Thread(task);
        t.start();
    }

    /**
     * Пример 3.
     * Запуск нескольких потоков через цикл и Runnable.
     */
    public static void example3_multipleThreads() {
        for (int i = 0; i < 3; i++) {
            int threadNumber = i;
            new Thread(() -> System.out.println("Thread number: " + threadNumber)).start();
        }
    }

    /**
     * Задача 1.
     * Создайте поток, используя наследование от Thread.
     * В методе run() выведите любое сообщение.
     * Затем запустите поток.
     */
    public static void task1_createThreadByExtending() {
        // Реализация должна быть добавлена студентом
    }

    /**
     * Задача 2.
     * Создайте поток, реализовав интерфейс Runnable.
     * Поток должен выводить имя текущего потока.
     */
    public static void task2_createThreadByRunnable() {
        // Реализация должна быть добавлена студентом
    }

    /**
     * Задача 3.
     * Создайте два потока: один через Thread, другой через Runnable.
     * Пусть каждый выведет уникальное сообщение.
     */
    public static void task3_createTwoThreads() {
        // Реализация должна быть добавлена студентом
    }

    /**
     * Пример 4.
     * Поток-потомок работает параллельно с потоком main и делает паузы через sleep().
     */
    public static void example4_sleepAndMainParallel() {
        Thread t = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Child thread iteration: " + i);
            }
        });

        t.start();

        for (int i = 0; i < 3; i++) {
            System.out.println("Main thread iteration: " + i);
        }
    }

    /**
     * Задача 4.
     * Создайте поток, который выводит 5 строк с задержкой 500 мс между строками.
     * Одновременно поток main должен выводить свои строки без задержки.
     * Вы должны увидеть, как два потока работают параллельно.
     */
    public static void task4_sleepParallelOutput() {
        // Реализация должна быть добавлена студентом
    }

    /**
     * Пример 5.
     * Поток main запускает дочерний поток и ждёт его завершения через join().
     */
    public static void example5_joinInAction() {
        Thread t = new Thread(() -> {
            try {
                Thread.sleep(1500);
                System.out.println("Child thread finished");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread resumed after join()");
    }

    /**
     * Задача 5.
     * Создайте поток, который выполняет длительную задачу (например, спит 2 секунды).
     * Используйте join() в главном потоке, чтобы подождать его завершения перед продолжением.
     */
    public static void task5_waitForThreadWithJoin() {
        // Реализация должна быть добавлена студентом
    }
}

