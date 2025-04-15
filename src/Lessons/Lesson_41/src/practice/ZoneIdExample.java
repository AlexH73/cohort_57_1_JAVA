package Lessons.Lesson_41.src.practice;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZoneIdExample {

    public static void main(String[] args) {
        // Получение доступных ZoneId
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println("Доступные ZoneId:");
        zoneIds.stream().limit(10).forEach(System.out::println); // Выведем первые 10 для примера

        // Создание ZoneId
        ZoneId zoneId = ZoneId.of("Europe/Paris");
        System.out.println("Создан ZoneId: " + zoneId);

        // Получение системного ZoneId
        ZoneId systemZone = ZoneId.systemDefault();
        System.out.println("Системный ZoneId: " + systemZone);

        // Преобразование времени между разными ZoneId
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Текущее время: " + zonedDateTime);

        ZonedDateTime newYorkTime = zonedDateTime.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("Текущее время в Нью-Йорке: " + newYorkTime);

        ZonedDateTime parisTime = newYorkTime.withZoneSameInstant(ZoneId.of("Europe/Paris"));
        System.out.println("Время в Нью-Йорке, преобразованное обратно в Париж: " + parisTime);

        // Работа с смещениями (Offset)
        ZoneId offsetZone = ZoneId.of("GMT+02:00");
        ZonedDateTime offsetDateTime = ZonedDateTime.now(offsetZone);
        System.out.println("Текущее время с GMT+02:00: " + offsetDateTime);

        // Использование ZoneId для создания ZonedDateTime
        ZonedDateTime zonedDateTimeSpecific = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("Текущее время в Токио: " + zonedDateTimeSpecific);

        // Изучение свойств ZoneId
        System.out.println("Смещение для ZoneId 'Europe/Paris': " + zoneId.getRules().getOffset(zonedDateTime.toInstant()));
    }
}

