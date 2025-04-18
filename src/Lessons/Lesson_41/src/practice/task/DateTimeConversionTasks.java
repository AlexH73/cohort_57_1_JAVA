package Lessons.Lesson_41.src.practice.task;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeConversionTasks {

    /**
     * Задача 1: Парсинг времени ввода пользователя в одной часовой зоне и вывод в UTC.
     *
     * @param userTimeString Время в формате "HH:mm:ss".
     * @param userZoneId Часовой пояс пользователя.
     * @return Время в UTC в формате "HH:mm:ss".
     */
    public static String convertUserTimeToUTC(String userTimeString, String userZoneId) {
        // Парсинг времени пользователя
        LocalTime userTime = LocalTime.parse(userTimeString);
        // Текущая дата в часовом поясе пользователя
        LocalDate currentDate = LocalDate.now(ZoneId.of(userZoneId));
        // Создание LocalDateTime с текущей датой и временем пользователя
        LocalDateTime userDateTime = LocalDateTime.of(currentDate, userTime);
        // Создание ZonedDateTime в часовом поясе пользователя
        ZonedDateTime userZoned = userDateTime.atZone(ZoneId.of(userZoneId));
        // Конвертация в UTC
        ZonedDateTime utcZoned = userZoned.withZoneSameInstant(ZoneOffset.UTC);
        // Форматирование времени в UTC
        return utcZoned.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    /**
     * Задача 2: Парсинг строки даты и времени, добавление временного интервала и конвертация результата в другой часовой пояс.
     *
     * @param dateTimeString Дата и время в формате "yyyy-MM-ddTHH:mm".
     * @param hoursToAdd Количество часов, которые нужно добавить.
     * @param targetZoneId Целевой часовой пояс для конвертации результата.
     * @return Результат в формате "yyyy-MM-dd HH:mm:ss zone" в целевом часовом поясе.
     */
    public static String parseAddAndConvert(String dateTimeString, long hoursToAdd, String targetZoneId) {
        // Парсинг строки в LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.parse(dateTimeString, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        // Предполагаем, что исходное время в UTC
        ZonedDateTime utcDateTime = localDateTime.atZone(ZoneOffset.UTC);
        // Добавление часов
        ZonedDateTime updatedDateTime = utcDateTime.plusHours(hoursToAdd);
        // Конвертация в целевой часовой пояс
        ZonedDateTime targetDateTime = updatedDateTime.withZoneSameInstant(ZoneId.of(targetZoneId));
        // Форматирование результата
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss VV");
        return targetDateTime.format(formatter);
    }

    public static void main(String[] args) {
        // Пример использования задач
        System.out.println(convertUserTimeToUTC("20:00:00", "Europe/London"));
        System.out.println(parseAddAndConvert("2023-01-01T10:00", 5, "Asia/Kolkata"));
    }
}

