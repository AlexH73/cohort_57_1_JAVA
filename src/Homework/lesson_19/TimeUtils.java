package Homework.lesson_19;

public class TimeUtils {
    /**
     * Задача 5: Напишите метод, который не принимает аргументов и возвращает
     * текущее системное время в миллисекундах.
     * Пример: getCurrentTime() -> 1674928198000
     *
     * @see System#currentTimeMillis()
     */
    public static void main(String[] args) {
        long currentTime = getCurrentTime();
        System.out.println("Текущее системное время в миллисекундах: " + currentTime);
    }

    public static long getCurrentTime() {
        return System.currentTimeMillis();
    }
}
