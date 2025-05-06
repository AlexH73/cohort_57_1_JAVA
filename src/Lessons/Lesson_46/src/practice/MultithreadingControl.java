package Lessons.Lesson_46.src.practice;

public class MultithreadingControl {
    public static void main(String[] args) {
        // Раскомментируйте задачи по мере выполнения
        task1_setThreadName();
//        task2_setDaemonThread();
//        task3_interruptSleepingThread();
//        task4_checkInterruptedFlag();
//        task5_useThreadGroup();
//        task6_interruptAndCheckStatus();
//        task7_attemptThreadStop();
//        task8_setThreadPriority();
//        task9_compareThreadPriorities();

    }

    /**
     * Задача 1.
     * Создайте поток и задайте ему имя с помощью setName().
     * Внутри потока выведите его имя с помощью Thread.currentThread().getName().
     */
    public static <Tread> void task1_setThreadName() {
        Runnable r = () -> {
            System.out.println(Thread.currentThread().getName());
        };

        Thread thread = new Thread(r);
        Thread thread1 = new Thread(r);
        thread.setName("My thread 0");
        thread1.setName("My thread 1");
        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread1.start();
        try {
            Thread.sleep(3000);
            thread1.join(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Задача 2.
     * Создайте поток-демон, который выводит сообщение в бесконечном цикле через каждые 500 мс.
     * В главном потоке запустите обычный поток, который завершится через 1 секунду.
     * После его завершения убедитесь, что демон завершился автоматически.
     */
    public static void task2_setDaemonThread() {
        Runnable r = () -> {
            while (true) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Поток " + Thread.currentThread().getName() + " работает");
            }
        };

        Thread deamonThread = new Thread(r);
        deamonThread.setName("демон");
        deamonThread.setDaemon(true);
        deamonThread.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    /**
     * Задача 3.
     * Создайте поток, который "спит" 5 секунд. Прервите его через 1 секунду из главного потока.
     * Обработайте InterruptedException и выведите сообщение о прерывании.
     */
    public static void task3_interruptSleepingThread() {
        Runnable r = () -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.err.println("Поток " + '\"' + Thread.currentThread().getName() + '\"' + " был принудительно прерван!");
            }
        };

        Thread thread3 = new Thread(r);
        thread3.setName("поток 3");
        thread3.start();
        try {
            thread3.join(1000);
            thread3.interrupt();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Задача 4.
     * Создайте поток, который считает от 1 до 1_000_000.
     * Внутри цикла проверяйте isInterrupted(), чтобы завершить поток при прерывании.
     * Прервите поток из main через 1 секунду.
     */
    public static void task4_checkInterruptedFlag() {
        Runnable r = () -> {
            for (int i = 0; i < 1000000; i++) {
                if (Thread.currentThread().isInterrupted()) {
                    System.err.println("Поток завершен по прерыванию!");
                    break;
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.err.println("Поток был прерван во время сна");
                }
                System.out.printf("Поток: %s, Приоритет: %d, Демон? - %s, i = %d \n",
                        Thread.currentThread().getName(),
                        Thread.currentThread().getPriority(),
                        String.valueOf(Thread.currentThread().isDaemon() ? "Да" : "Нет"),
                        i);
            }
        };
        Thread thread4 = new Thread(r);
        thread4.setName("поток 4");
        thread4.setDaemon(true);
        thread4.start();
        try {
            Thread.sleep(1000);
            thread4.interrupt();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Задача 5.
     * Создайте группу потоков (ThreadGroup), в которую добавьте три потока.
     * Каждый поток должен "спать" 2 секунды.
     * После запуска выведите список активных потоков и их имена из группы.
     */
    public static void task5_useThreadGroup() {
        // Реализация должна быть добавлена студентом
    }

    /**
     * Задача 6.
     * Создайте поток, который выполняет бесконечный цикл.
     * Прервите его из main-потока и проверьте через isInterrupted(), что он был остановлен корректно.
     */
    public static void task6_interruptAndCheckStatus() {
        // Реализация должна быть добавлена студентом
    }

    /**
     * Задача 7.
     * (Только для демонстрации, НЕ использовать в реальной практике)
     * Создайте поток и попробуйте вызвать у него метод stop().
     * Посмотрите, что произойдет. Объясните, почему этот способ остановки потоков считается устаревшим и опасным.
     */
    public static void task7_attemptThreadStop() {
        // Реализация должна быть добавлена студентом
    }

    /**
     * Задача 8.
     * Создайте два потока, задайте им приоритеты MIN_PRIORITY и MAX_PRIORITY соответственно.
     * Запустите оба потока и выведите их имена и приоритеты. Понаблюдайте за их порядком выполнения.
     */
    public static void task8_setThreadPriority() {
        // Реализация должна быть добавлена студентом
    }

    /**
     * Задача 9.
     * Создайте 3 потока с приоритетами 3, 5 и 7.
     * Пусть каждый поток делает вывод своего имени и приоритета.
     * Попробуйте понять, как приоритет влияет на планировщик потоков.
     */
    public static void task9_compareThreadPriorities() {
        // Реализация должна быть добавлена студентом
    }
}
