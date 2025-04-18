package Homework.lesson_41;

import java.text.DateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Set;

public class DateTimeTasks {

    /**
     * Задание 1.
     * Получи и выведи сегодняшнюю дату.
     * Пример: Сегодняшняя дата: 2025-04-13
     */
    public static void printTodayDate() {
        LocalDate today = LocalDate.now();
        System.out.println("1. Сегодняшняя дата: " + today);

    }

    /**
     * Задание 2.
     * Прими три числа — год, месяц и день рождения — и выведи дату рождения.
     * Пример: Я родился: 2004-06-01
     */
    public static void printBirthDate(int year, int month, int day) {
        LocalDate dateOfBirth = LocalDate.of(1973,06,28);
        System.out.println("2. Я родился: " + dateOfBirth);

    }

    /**
     * Задание 3.
     * Прими дату рождения и выведи, сколько лет прошло с этой даты до текущего дня.
     * Пример: Мне лет: 20
     */
    public static void printAge(LocalDate birthDate) {
        LocalDate dateOfBrith = LocalDate.of(1973,06,28);
        LocalDate today = LocalDate.now();
        Period age = Period.between(dateOfBrith,today);
        System.out.println("3. Мне лет: " + age.getYears());
    }

    /**
     * Задание 4.
     * Получи и выведи текущее время.
     * Пример: Сейчас: 14:35:12
     */
    public static void printCurrentTime() {
        LocalTime localTime = LocalTime.now();
        System.out.println("4. Сейчас: " + localTime);

    }

    /**
     * Задание 5.
     * Прими дату и число дней, добавь их к дате и выведи результат.
     * Пример: Через 100 дней от 2025-04-13 будет: 2025-07-22
     */
    public static void printDatePlusDays(LocalDate startDate, int daysToAdd) {
        LocalDate endDate = startDate.plusDays(daysToAdd);
        System.out.println("5. Через 100 дней от 2000-01-01 будет: " + endDate);

    }

    /**
     * Задание 6.
     * Прими строку с датой в формате "yyyy-MM-dd" и выведи результат.
     * Пример: Распарсенная дата: 2000-01-01
     */
    public static void parseAndPrintDate(String dateString) {
        LocalDate stringDate = LocalDate.parse(dateString);
        System.out.println("6. Распарсенная дата: " + stringDate);

    }

    /**
     * Задание 7.
     * Прими дату и выведи её в формате "дд.мм.гггг".
     * Пример: Сегодня: 13.04.2025
     */
    public static void printFormattedDate(LocalDate date) {
        //LocalDate localDate = LocalDate.now();
        //date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        System.out.println("7. Сегодня: " + date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));

    }

    /**
     * Задание 8 (необязательное).
     * Прими строку часового пояса и выведи текущую дату и время в этом поясе.
     * Пример: Сейчас в Asia/Tokyo: 2025-04-13T22:15:00+09:00[Asia/Tokyo]
     */
    public static void printTimeInZone(String zoneId) {
        ZonedDateTime zeitZone = ZonedDateTime.now(ZoneId.of(zoneId));
        System.out.println("8. Сейчас в Asia/Tokyo: " + zeitZone);
        System.out.println("8.1 Сейчас в Asia/Tokyo: " + zeitZone.format(DateTimeFormatter.ofPattern("dd.MM.yyyy, HH:mm")));

    }

    public static void main(String[] args) {
        printTodayDate();
        printBirthDate(2004, 6, 1);
        printAge(LocalDate.of(2004, 6, 1));
        printCurrentTime();
        printDatePlusDays(LocalDate.of(2000,01,01), 100);
        parseAndPrintDate("2000-01-01");
        printFormattedDate(LocalDate.now());
        printTimeInZone("Asia/Tokyo");
    }
}