## Задача 1.

```java
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

    }

    /**
     * Задание 2.
     * Прими три числа — год, месяц и день рождения — и выведи дату рождения.
     * Пример: Я родился: 2004-06-01
     */
    public static void printBirthDate(int year, int month, int day) {

    }

    /**
     * Задание 3.
     * Прими дату рождения и выведи, сколько лет прошло с этой даты до текущего дня.
     * Пример: Мне лет: 20
     */
    public static void printAge(LocalDate birthDate) {

    }

    /**
     * Задание 4.
     * Получи и выведи текущее время.
     * Пример: Сейчас: 14:35:12
     */
    public static void printCurrentTime() {

    }

    /**
     * Задание 5.
     * Прими дату и число дней, добавь их к дате и выведи результат.
     * Пример: Через 100 дней от 2025-04-13 будет: 2025-07-22
     */
    public static void printDatePlusDays(LocalDate startDate, int daysToAdd) {

    }

    /**
     * Задание 6.
     * Прими строку с датой в формате "yyyy-MM-dd" и выведи результат.
     * Пример: Распарсенная дата: 2000-01-01
     */
    public static void parseAndPrintDate(String dateString) {

    }

    /**
     * Задание 7.
     * Прими дату и выведи её в формате "дд.мм.гггг".
     * Пример: Сегодня: 13.04.2025
     */
    public static void printFormattedDate(LocalDate date) {

    }

    /**
     * Задание 8 (необязательное).
     * Прими строку часового пояса и выведи текущую дату и время в этом поясе.
     * Пример: Сейчас в Asia/Tokyo: 2025-04-13T22:15:00+09:00[Asia/Tokyo]
     */
    public static void printTimeInZone(String zoneId) {

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
```