package Lessons.Lesson_41.src.teacher_code;

import java.time.Duration;
import java.time.LocalDate;

public class Temp {
    public static void main(String[] args) {
        String birthdate= "1990-01-03";
        LocalDate date = LocalDate.parse(birthdate);
        LocalDate now = LocalDate.now();
        Duration duration = Duration.between(date, now);

        System.out.println((int) (duration.toDays() / 365));

    }
}
