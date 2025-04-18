package Lessons.Lesson_41.src.practice.task;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class DateTimePracticeTasks {
    public static void main(String[] args) {

        System.out.println("Age: " + calculateAge("1973-01-01"));
        System.out.println("Minutes between: " + timeBetween("09:00:00", "10:30:00"));
        System.out.println("Day of week: " + findDayOfWeek("2023-01-01"));
        System.out.println("Formatted current date and time: " + formatCurrentDateTime());
    }

    /**
     * Задача 1: Рассчитайте возраст человека на основе его даты рождения.
     *
     * @param birthdate Дата рождения человека в формате "yyyy-MM-dd".
     * @return Возраст человека в годах.
     */
    public static int calculateAge(String birthdate) {
        DateTimeFormatter customDTFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // Форматируем вводную дату
        LocalDateTime date = LocalDate.parse(birthdate, customDTFormatter).atStartOfDay(); // Парсим дату и дополняем формат для Duration
        LocalDateTime now = LocalDateTime.now(); // Инициализация текущей даты
        Duration duration = Duration.between(date, now); // Вычисляем промежуток времени

        return (int) (duration.toDays() / 365); // Подсчет и возврат
    }

    /**
     * Задача 2: Определите, сколько времени прошло между двумя моментами времени в течение дня.
     *
     * @param startTime Время начала в формате "HH:mm:ss".
     * @param endTime   Время окончания в формате "HH:mm:ss".
     * @return Продолжительность между двумя моментами времени в минутах.
     */
    public static long timeBetween(String startTime, String endTime) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss"); // Форматируем вводную дату
        LocalTime start = LocalTime.parse(startTime, dateTimeFormatter); // Парсим старт
        LocalDateTime startLDT = LocalDate.now().atTime(start);  // Дополняем формат стартового времени для Duration
        LocalTime end = LocalTime.parse(endTime, dateTimeFormatter); // Парсим финиш
        LocalDateTime endLDT = LocalDate.now().atTime(end); // Дополняем формат финишного времени для Duration
        Duration duration = Duration.between(startLDT, endLDT);  // Получаем промежуток времени

        return duration.toMinutes(); // Перевод в минуты и возврат
    }

    /**
     * Задача 3: Найдите день недели для даты.
     *
     * @param date Дата в формате "yyyy-MM-dd".
     * @return День недели в текстовом формате (например, "Понедельник").
     */
    public static String findDayOfWeek(String date) {
        LocalDate localDate = LocalDate.parse(date);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        return dayOfWeek.getDisplayName(TextStyle.FULL, new Locale("ru"));
    }

    /**
     * Задача 4: Форматируйте текущую дату и время в красивом формате.
     *
     * @return Текущая дата и время в формате "dd MMMM yyyy, EEEE HH:mm:ss".
     */
    public static String formatCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy, EEEE HH:mm:ss", new Locale("de"));
        return now.format(formatter);
    }
}

