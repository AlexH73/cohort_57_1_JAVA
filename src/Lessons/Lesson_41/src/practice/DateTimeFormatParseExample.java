package Lessons.Lesson_41.src.practice;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

public class DateTimeFormatParseExample {

    public static void main(String[] args) {
        // Пример форматирования даты с использованием стандартных форматов
        LocalDate date = LocalDate.now();
        System.out.println("Стандартное форматирование даты (ISO_LOCAL_DATE): " + date.format(DateTimeFormatter.ISO_LOCAL_DATE));

        // Пример форматирования времени с использованием пользовательского формата
        LocalTime time = LocalTime.of(5, 20, 2);
        DateTimeFormatter customTimeFormatter = DateTimeFormatter.ofPattern("mm = ss = hh");
        System.out.println("Пользовательское форматирование времени: " + time.format(customTimeFormatter) + "\n");

        // Пример форматирования даты и времени с использованием локализованного формата
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter localizedFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy, HH:mm", Locale.GERMAN);
        DateTimeFormatter localizedFormatter2 = DateTimeFormatter.ofPattern("dd MM YY, HH:mm", Locale.GERMAN);

        System.out.println("Локализованное форматирование даты и времени: " + dateTime.format(localizedFormatter));
        System.out.println("Локализованное форматирование даты и времени: " + dateTime.format(localizedFormatter2));

        // Пример разбора (парсинга) даты из строки
        try {
//            String dateString = "2023-01-28";
//            LocalDate parsedDate = LocalDate.parse(dateString, DateTimeFormatter.ISO_LOCAL_DATE);
//            System.out.println("Разбор даты из строки: " + parsedDate);

            String dateString2 = "2024 02 07";
            DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy MM dd");
            LocalDate ld = LocalDate.parse(dateString2, pattern);
            System.out.println("\nLocalDate.parse(dateString2, pattern) = " + ld);
        } catch (DateTimeParseException e) {
            System.out.println("Ошибка при разборе даты: " + e.getMessage());
        }

        // Пример разбора (парсинга) времени из строки
        try {
            String timeString = "15:45:30";
            LocalTime parsedTime = LocalTime.parse(timeString, customTimeFormatter);
            System.out.println("Разбор времени из строки: " + parsedTime);
        } catch (DateTimeParseException e) {
            System.out.println("Ошибка при разборе времени: " + e.getMessage());
        }

        // Пример работы с часовыми поясами и ZonedDateTime
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println("Текущее время в Париже: " + zonedDateTime.format(DateTimeFormatter.ofPattern("dd MMMM yyyy, HH:mm:ss z")));

        // Изменение часового пояса для ZonedDateTime
        ZonedDateTime zonedDateTimeInNY = zonedDateTime.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("То же время в Нью-Йорке: " + zonedDateTimeInNY.format(DateTimeFormatter.ofPattern("dd MMMM yyyy, HH:mm:ss z")));
    }
}

