package Homework.lesson_41;

import java.time.LocalDate;

import static Homework.lesson_41.DateTimeTasks.*;

public class Main {
    public static void main(String[] args) {
        printTodayDate();
        printBirthDate(2004,6,1);
        LocalDate birthDate = LocalDate.of(2005, 6,5);
        printAge(birthDate);
        printCurrentTime();
        LocalDate date = LocalDate.of(2005, 4,13);
        printDatePlusDays(date, 100);
        parseAndPrintDate("2001-01-01");
        LocalDate today = LocalDate.of(2025, 4,13);
        printFormattedDate(today);
        printTimeInZone("Asia/Tokyo");

    }
}
