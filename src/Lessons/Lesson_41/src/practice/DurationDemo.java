package Lessons.Lesson_41.src.practice;
import java.time.Duration;
import java.time.LocalDateTime;

/**
 * Мы создаем два объекта LocalDateTime для демонстрации расчета продолжительности между ними с помощью Duration.between(). <p>
 * Используем метод getSeconds() для получения общего количества секунд в продолжительности и toHours() и toMinutes() для получения количества часов и минут соответственно.<p>
 * Демонстрируем добавление времени к продолжительности с помощью методов plusHours() и plusMinutes().<p>
 * Показываем, как вычитать время из продолжительности, используя minus() с другим объектом Duration.<p>
 * Создаем Duration из количества дней с помощью Duration.ofDays().<p>
 * Проверяем, является ли продолжительность отрицательной с помощью isNegative(), что может быть полезно при сравнении временных точек.<p>
 */
public class DurationDemo {
    public static void main(String[] args) {
        // Создаем два объекта LocalDateTime
        LocalDateTime startDateTime = LocalDateTime.of(2024, 1, 1, 6, 30);
        LocalDateTime endDateTime = LocalDateTime.of(2024, 1, 2, 8, 45);

        // Вычисляем продолжительность между двумя моментами времени
        Duration duration = Duration.between(startDateTime, endDateTime);
        System.out.println(duration);


        // Выводим различные аспекты Duration
        System.out.println("Общее количество секунд: " + duration.getSeconds()); // Выводит общее количество секунд в Duration
        System.out.println("Часы: " + duration.toHours()); // Выводит количество часов в Duration
        System.out.println("Минуты: " + duration.toMinutes()); // Выводит количество минут в Duration

        // Демонстрация добавления времени к Duration
        Duration addedDuration = duration.plusHours(2).plusMinutes(15);
        System.out.println("Добавлено время, общее количество минут: " + addedDuration.toMinutes());

        // Демонстрация вычитания времени из Duration
        Duration subtractedDuration = duration.minus(Duration.ofMinutes(30));
        System.out.println("Время после вычитания, общее количество секунд: " + subtractedDuration.getSeconds());

        // Создание Duration из количества дней
        Duration fromDays = Duration.ofDays(1);
        System.out.println("Продолжительность в днях, часы: " + fromDays.toHours());

        // Проверка, является ли продолжительность отрицательной
        Duration negativeDuration = Duration.between(endDateTime, startDateTime); // Будет отрицательной
        System.out.println("Эта продолжительность отрицательная? " + negativeDuration.isNegative());
    }
}

