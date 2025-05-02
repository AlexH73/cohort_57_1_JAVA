package Homework.lesson_41;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeTasks {

    /**
     * Задание 1.
     * Получи и выведи сегодняшнюю дату.
     * Пример: Сегодняшняя дата: 2025-04-13
     */
    public static void printTodayDate() {
        LocalDate today = LocalDate.now();
        System.out.println("Сегодняшняя дата: " + today);
    }

    /**
     * Задание 2.
     * Прими три числа — год, месяц и день рождения — и выведи дату рождения.
     * Пример: Я родился: 2004-06-01
     */
    public static void printBirthDate(int year, int month, int day) {
        LocalDate birthDate = LocalDate.of(year, month, day);   // создаем дату из аргументов
        System.out.println("Я родился: " + birthDate);

    }

    /**
     * Задание 3.
     * Прими дату рождения и выведи, сколько лет прошло с этой даты до текущего дня.
     * Пример: Мне лет: 20
     */
    public static void printAge(LocalDate birthDate) {
        LocalDate today = LocalDate.now();  // Получаем сегодняшнюю дату
        long years = ChronoUnit.YEARS.between(birthDate, today);    // Считаем количество лет
        System.out.println("Мне лет: " + years);

    }

    /**
     * Задание 4.
     * Получи и выведи текущее время.
     * Пример: Сейчас: 14:35:12
     */
    public static void printCurrentTime() {
        LocalTime now = LocalTime.now();    // Получаем текущее время
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");  // Получаем текущее время
        System.out.println("Ceйчас: " + now.format(formatter));

    }

    /**
     * Задание 5.
     * Прими дату и число дней, добавь их к дате и выведи результат.
     * Пример: Через 100 дней от 2025-04-13 будет: 2025-07-22
     */
    public static void printDatePlusDays(LocalDate startDate, int daysToAdd) {
        LocalDate resultDate = startDate.plusDays(daysToAdd);   // Добавляем дни к начальной дате
        System.out.println("Через " + daysToAdd + "дней от " + startDate + "будет: " + resultDate);
    }

    /**
     * Задание 6.
     * Прими строку с датой в формате "yyyy-MM-dd" и выведи результат.
     * Пример: Распарсенная дата: 2000-01-01
     */
    public static void parseAndPrintDate(String dateString) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate parsedDate = LocalDate.parse(dateString, formatter);
            System.out.println("Распарсенная дата: " + parsedDate);
        } catch (Exception e) {
            System.out.println("Неверный формат даты. Ожидается: yyyy-MM-dd");
        }
    }

    /**
     * Задание 7.
     * Прими дату и выведи её в формате "дд.мм.гггг".
     * Пример: Сегодня: 13.04.2025
     */
    public static void printFormattedDate(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String formattedDate = date.format(formatter);
        System.out.println("Сегодня: " + formattedDate);

    }

    /**
     * Задание 8 (необязательное).
     * Прими строку часового пояса и выведи текущую дату и время в этом поясе.
     * Пример: Сейчас в Asia/Tokyo: 2025-04-13T22:15:00+09:00[Asia/Tokyo]
     */
    public static void printTimeInZone(String zoneId) {
        try {
            ZoneId zone = ZoneId.of(zoneId);    // Преобразуем строку в ZoneId
            ZonedDateTime currentTimeInZone = ZonedDateTime.now(zone);  // Получаем текущую дату и время в зоне
            System.out.println("Сейчас в " + zoneId + ": " + currentTimeInZone);
        } catch (Exception e) {
            System.out.println("Неверный идентификатор часового пояса.");
        }
    }

    public static void main(String[] args) {
        printTodayDate();
        printBirthDate(2004, 6, 1);
        printAge(LocalDate.of(2004, 6, 1));
        printCurrentTime();
        printDatePlusDays(LocalDate.now(), 100);
        parseAndPrintDate("2000-01-01");
        printFormattedDate(LocalDate.now());
        printTimeInZone("Asia/Tokyo");
    }
}