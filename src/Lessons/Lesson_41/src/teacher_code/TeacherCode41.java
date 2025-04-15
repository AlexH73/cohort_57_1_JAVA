package Lessons.Lesson_41.src.teacher_code;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TeacherCode41 {
    public static void main(String[] args) throws InterruptedException {
        LocalDate date = LocalDate.of(2017, 2, 17);

        LocalDate someDay = date.plusWeeks(10);
        System.out.println(someDay);

        LocalDateTime currentTime = LocalDateTime.now();

        System.out.println(currentTime);
        System.out.println(currentTime);

        // программа будет "спать" 2000 мс
        Thread.sleep(2000);

        System.out.println(currentTime);
        System.out.println(currentTime);

        System.out.println("=================");

        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.now());

        // программа будет "спать" 2000 мс
        Thread.sleep(2000);

        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.now());
    }
}
