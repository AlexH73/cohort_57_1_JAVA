package Lessons.Lesson_41.src.practice;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;

/**
 * Этот Java класс демонстрирует расширенные возможности Date-Time API, включая работу с периодами (<b>Period</b>),
 * длительностями (<b>Duration</b>) и временными точками (<b>TemporalAdjusters</b>). <p> В примерах показано, как вычислить период между
 * двумя датами, измерить длительность между двумя временами, а также использовать <b>TemporalAdjusters</b> для получения дат,
 * таких как первый день месяца, последний день года, последний вторник месяца и следующий вторник после заданной даты.
 * Комментарии в коде помогают понять, как эти возможности могут быть применены в различных задачах управления датами и
 * временем. <p>
 * Для получения дополнительной информации смотрите <a href="https://docs.oracle.com/javase/8/docs/technotes/guides/datetime/index.html">Официальную документацию</a>.
 */
public class DateTimeAPIExtensions {

    public static void main(String[] args) {
        // Работа с периодами (Period)
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 12, 31);
        Period period = Period.between(startDate, endDate);
        System.out.println("Период между двумя датами: " + period);
        System.out.println("Месяцев в периоде: " + period.getMonths() + ", дней: " + period.getDays());

        // Работа с длительностями (Duration)
        LocalTime startTime = LocalTime.of(9, 0);
        LocalTime endTime = LocalTime.of(17, 30);
        Duration duration = Duration.between(startTime, endTime);
        System.out.println("Длительность между двумя временами: " + duration);
        System.out.println("Часов в длительности: " + duration.toHours() + ", минут: " + duration.toMinutes());

        // Работа с TemporalAdjusters
        LocalDate firstDayOfMonth = startDate.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("Первый день месяца: " + firstDayOfMonth);

        LocalDate lastDayOfYear = endDate.with(TemporalAdjusters.lastDayOfYear());
        System.out.println("Последний день года: " + lastDayOfYear);

        // Последний вторник месяца
        LocalDate lastTuesday = endDate.with(TemporalAdjusters.lastInMonth(java.time.DayOfWeek.TUESDAY));
        System.out.println("Последний вторник месяца: " + lastTuesday);

        // Следующий вторник после заданной даты
        LocalDate nextTuesday = startDate.with(TemporalAdjusters.next(java.time.DayOfWeek.TUESDAY));
        System.out.println("Следующий вторник после заданной даты: " + nextTuesday);
    }
}

