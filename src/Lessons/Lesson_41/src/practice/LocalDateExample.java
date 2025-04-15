package Lessons.Lesson_41.src.practice;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class LocalDateExample {

    public static void main(String[] args) {
        // Получение текущей даты
        LocalDate today = LocalDate.now();
        System.out.println("Сегодняшняя дата: " + today);

        // Создание экземпляра LocalDate, указав год, месяц и день
        LocalDate specificDate = LocalDate.of(2020, Month.JANUARY, 1);
        System.out.println("Конкретная дата: " + specificDate);

        // Разбор даты из строки
        LocalDate parsedDate = LocalDate.parse("2023-01-01");
        System.out.println("Разобранная дата из строки: " + parsedDate);

        // Добавление и вычитание дней
        LocalDate tomorrow = today.plusDays(1);
        System.out.println("Дата завтра: " + tomorrow);
        LocalDate yesterday = today.minusDays(1);
        System.out.println("Дата вчера: " + yesterday);

        // Добавление и вычитание недель, месяцев и лет
        LocalDate nextWeek = today.plusWeeks(1);
        System.out.println("Дата через неделю: " + nextWeek);
        LocalDate nextMonth = today.plusMonths(1);
        System.out.println("Дата в следующем месяце: " + nextMonth);
        LocalDate nextYear = today.plusYears(1);
        System.out.println("Дата в следующем году: " + nextYear);

        // Работа с днями месяца, месяцами года и годами
        LocalDate endOfMonth = today.withDayOfMonth(today.lengthOfMonth());
        System.out.println("Последний день этого месяца: " + endOfMonth);
        LocalDate firstDayOfYear = today.withDayOfYear(1);
        System.out.println("Первый день этого года: " + firstDayOfYear);

        // Сравнение дат
        boolean isBefore = today.isBefore(nextYear);
        System.out.println("Сегодняшняя дата раньше, чем дата в следующем году? " + isBefore);
        boolean isAfter = today.isAfter(yesterday);
        System.out.println("Сегодняшняя дата позже, чем вчерашняя дата? " + isAfter);

        // Разница между датами
        long daysBetween = ChronoUnit.DAYS.between(today, nextYear);
        System.out.println("Количество дней до следующего года: " + daysBetween);

        // Получение дня недели, месяца и года
        System.out.println("День недели: " + today.getDayOfWeek());
        System.out.println("День месяца: " + today.getDayOfMonth());
        System.out.println("День года: " + today.getDayOfYear());
        System.out.println("Месяц: " + today.getMonth());
        System.out.println("Год: " + today.getYear());

        // Проверка на високосный год
        boolean isLeapYear = today.isLeapYear();
        System.out.println("Этот год високосный? " + isLeapYear);
    }
}

