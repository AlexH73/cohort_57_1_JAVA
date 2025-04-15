package Lessons.Lesson_41.src.practice;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class InstantExample {
    public static void main(String[] args) {
        // Получение текущего момента времени
        Instant now = Instant.now();
        System.out.println("Текущий момент времени: " + now);

        // Создание экземпляра Instant из строки
        Instant specificInstant = Instant.parse("2023-01-01T12:00:00Z");
        System.out.println("Конкретный момент времени: " + specificInstant);

        // Добавление времени к Instant
        Instant oneHourLater = now.plus(1, ChronoUnit.HOURS);
        System.out.println("Через один час: " + oneHourLater);

        // Вычитание времени из Instant
        Instant oneHourBefore = now.minus(Duration.ofHours(1));
        System.out.println("Час назад: " + oneHourBefore);

        // Сравнение двух Instant
        boolean isAfter = now.isAfter(specificInstant);
        System.out.println("Текущий момент времени после конкретного момента времени? " + isAfter);

        boolean isBefore = now.isBefore(oneHourLater);
        System.out.println("Текущий момент времени до момента времени через один час? " + isBefore);

        // Разница между двумя моментами времени
        long minutesBetween = ChronoUnit.MINUTES.between(specificInstant, now);
        System.out.println("Минут между конкретным моментом и текущим моментом: " + minutesBetween);

        // Преобразование Instant в ZonedDateTime
        ZonedDateTime zonedDateTime = now.atZone(ZoneId.of("Europe/Paris"));
        System.out.println("Текущий момент времени в часовом поясе Европа/Париж: " + zonedDateTime);

        // Получение Instant из ZonedDateTime
        Instant instantFromZonedDateTime = zonedDateTime.toInstant();
        System.out.println("Instant из ZonedDateTime: " + instantFromZonedDateTime);
    }
}

