package Lessons.Lesson_41.src.practice;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        // Получение текущей даты и времени
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Текущая дата и время: " + now);

        // Создание экземпляра LocalDateTime, указав год, месяц, день, час и минуту
        LocalDateTime specificDateTime = LocalDateTime.of(2020, Month.JANUARY, 1, 12, 0);
        System.out.println("Конкретная дата и время: " + specificDateTime);

        // Разбор даты и времени из строки
        LocalDateTime parsedDateTime = LocalDateTime.parse("2023-01-01T15:00");
        System.out.println("Разобранная дата и время из строки: " + parsedDateTime);

        // Добавление к текущей дате и времени дней, недель, месяцев и лет
        LocalDateTime tomorrowDateTime = now.plusDays(1);
        System.out.println("Дата и время завтра: " + tomorrowDateTime);
        LocalDateTime nextWeekDateTime = now.plusWeeks(1);
        System.out.println("Дата и время через неделю: " + nextWeekDateTime);
        LocalDateTime nextMonthDateTime = now.plusMonths(1);
        System.out.println("Дата и время в следующем месяце: " + nextMonthDateTime);
        LocalDateTime nextYearDateTime = now.plusYears(1);
        System.out.println("Дата и время в следующем году: " + nextYearDateTime);

        // Вычитание из текущей даты и времени
        LocalDateTime hourAgoDateTime = now.minusHours(1);
        System.out.println("Дата и время час назад: " + hourAgoDateTime);

        // Сравнение дат и времени
        boolean isBefore = now.isBefore(nextYearDateTime);
        System.out.println("Текущая дата и время раньше, чем дата и время в следующем году? " + isBefore);
        boolean isAfter = now.isAfter(hourAgoDateTime);
        System.out.println("Текущая дата и время позже, чем дата и время час назад? " + isAfter);

        // Разница между датами и временем
        long hoursBetween = ChronoUnit.HOURS.between(hourAgoDateTime, now);
        System.out.println("Количество часов между двумя временными точками: " + hoursBetween);

        // Получение компонентов даты и времени
        System.out.println("Год: " + now.getYear());
        System.out.println("Месяц: " + now.getMonth());
        System.out.println("День месяца: " + now.getDayOfMonth());
        System.out.println("Час: " + now.getHour());
        System.out.println("Минута: " + now.getMinute());
        System.out.println("Секунда: " + now.getSecond());

        // Проверка на високосный год
        boolean isLeapYear = now.toLocalDate().isLeapYear();
        System.out.println("Этот год високосный? " + isLeapYear);
    }
}

