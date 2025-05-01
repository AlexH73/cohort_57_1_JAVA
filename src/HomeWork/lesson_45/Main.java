package Homework.lesson_45;

public class Main {
    public static void main(String[] args) {
        // 6. Что выведет следующий код?
        Thread t = new Thread(() -> System.out.println("Hello"));
        t.run();
        System.out.println("Done");

        // 7. Что выведет следующий код?
        Runnable r = () -> {
            for (int i = 0; i < 3; i++) {
                //System.out.println(i +  \" \"); //Ошибка компиляции
            }
        };
        //r.start //Ошибка компиляции

        // 8. Что выведет следующий код?
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Interrupted");
            }
            System.out.println("Tread finished");
        });
        t1.start();
        //t1.join(); //Ошибка компиляции

        // 9. Что выведет следующий код?
        new Thread(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }).start();
        System.out.println("Main done");

        // 10. Что будет, если вызвать start() дважды на одном и том же объекте Thread?
        Thread t2 = new Thread(() -> System.out.println("Run"));
        t2.start();
       // t2.start(); // D) Исключение IllegalThreadStateException
    }
}
