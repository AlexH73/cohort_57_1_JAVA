package Lessons.Lesson_46.src.examples;

public class ThreadPriorityRace {

    public static void main(String[] args) {
        // Задача для каждого потока — просто вывести своё имя и номер итерации
        Runnable counterTask = () -> {
            String name = Thread.currentThread().getName();
            for (int i = 0; i < 5; i++) {
                System.out.println(name + " - iteration " + i);
            }
        };

        // Создаем три потока с разными приоритетами
        Thread low = new Thread(counterTask, "LowPriority");
        Thread medium = new Thread(counterTask, "MediumPriority");
        Thread high = new Thread(counterTask, "HighPriority");

        // Устанавливаем разные приоритеты
        low.setPriority(3);     // ниже среднего
        medium.setPriority(5);  // по умолчанию
        high.setPriority(8);    // выше среднего

        // Запускаем потоки
        low.start();
        medium.start();
        high.start();
    }
}