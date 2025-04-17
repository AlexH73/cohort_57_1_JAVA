package Lessons.Lesson_41.src.teacher_code;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;

public class TeacherCode41_2 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();
        LocalDateTime dateTimeNow = LocalDateTime.now();

        System.out.println(today.toString());
        System.out.println(now.toString());
        System.out.println(dateTimeNow.toString());

        LocalDate firstApril = LocalDate.of(2025, Month.APRIL, 1);
        System.out.println(firstApril.toString());

        LocalTime time = null;
        int hour = 56775;
        int minute = 123;
        try {
            time = LocalTime.of(hour, minute);
        } catch (Exception e) {
            hour %= 24;
            minute %= 60;
            time = LocalTime.of(hour, minute);
        }
        System.out.println(time);

        LocalDate date = LocalDate.parse("1990-01-01");
        LocalTime time2 = LocalTime.parse("13:30:00");

        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));

        System.out.println("today = " + today);
        System.out.println("now = " + now);

        today.plusDays(1);
        now.minusHours(1);

        System.out.println("today = " + today);
        System.out.println("now = " + now);

        LocalDate tomorrow = today.plusDays(1);
        LocalTime hourEarlier = now.minusHours(1);

        System.out.println("tomorrow = " + tomorrow);
        System.out.println("hourEarlier = " + hourEarlier);

        LocalDate dateOfBirth = LocalDate.of(1991, Month.JANUARY, 01);
        LocalDate summerStart = LocalDate.of(2025, Month.JUNE, 01);

        boolean isPast = dateOfBirth.isBefore(LocalDate.now());
        System.out.println("isPast = " + isPast);
        System.out.println("summerStart.isBefore(now) = " + summerStart.isBefore(LocalDate.now()));

        System.out.println("Мой день рождения " + dateOfBirth);



        ZoneId asia = ZoneId.of("Asia/Tokyo");
        System.out.println(LocalTime.now(asia));
        System.out.println(LocalDateTime.now(asia));

        LocalDate customDate = LocalDate.of(1970, Month.AUGUST, 3);

        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("d.M.yyyy");
        DateTimeFormatter customFormatter2 = DateTimeFormatter.ofPattern("DD-MM-YY");
        DateTimeFormatter customFormatter3 = DateTimeFormatter.ofPattern("DD:MM:yyyy");
        String customFormattedDate = customDate.format(customFormatter);
        String customFormattedDate2 = customDate.format(customFormatter2);
        String customFormattedDate3 = customDate.format(customFormatter3);
        System.out.println("Formatted date (custom): " + customFormattedDate);
        System.out.println("Formatted date (custom): " + customFormattedDate2);
        System.out.println("Formatted date (custom): " + customFormattedDate3);


        LocalDateTime customDateTime = LocalDateTime.of(1970, Month.AUGUST, 3, 19, 30, 12);

        DateTimeFormatter customDTFormatter = DateTimeFormatter.ofPattern("d.MMMM.yyyy-HH:mm:ss:mss");
        String customFormattedDateTime = customDateTime.format(customDTFormatter);
        System.out.println(customFormattedDateTime);

        // количество наносекунд прошедших с 1.01.1970
        System.out.println("System.nanoTime() = " + System.nanoTime());
        System.out.println("System.nanoTime() = " + System.nanoTime());
        System.out.println("System.nanoTime() = " + System.nanoTime());


    }
}
