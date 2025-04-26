package Lessons.Lesson_41;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

    public class DateTimeTasks {

        public static void printTodayDate() {
            LocalDate today = LocalDate.of(2025, 4, 26);
            System.out.println("Сегодняшняя дата: " + today);
        }

        public static void printBirthDate(int year, int month, int day) {
            LocalDate birthDate = LocalDate.of(year, month, day);
            System.out.println("Я родилась: " + birthDate);
        }

        public static void printAge(LocalDate birthDate) {
            LocalDate today = LocalDate.of(2025, 4, 26);
            long years = ChronoUnit.YEARS.between(birthDate, today);
            System.out.println("Мне лет: " + years);
        }

        public static void printCurrentTime() {
            LocalTime currentTime = LocalTime.of(12, 57);
            System.out.println("Сейчас: " + currentTime);
        }

        public static void printDatePlusDays(LocalDate startDate, int daysToAdd) {
            LocalDate resultDate = startDate.plusDays(daysToAdd);
            System.out.println("Через " + daysToAdd + " дней от " + startDate + " будет: " + resultDate);
        }

        public static void parseAndPrintDate(String dateString) {
            LocalDate parsedDate = LocalDate.parse(dateString);
            System.out.println("Распарсенная дата: " + parsedDate);
        }

        public static void printFormattedDate(LocalDate date) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            System.out.println("Сегодня: " + date.format(formatter));
        }

        public static void printTimeInZone(String zoneId) {
            ZonedDateTime dateTimeInZone = ZonedDateTime.now(ZoneId.of(zoneId));
            System.out.println("Сейчас в " + zoneId + ": " + dateTimeInZone);
        }

        public static void main(String[] args) {
            printTodayDate();
            printBirthDate(2001, 7, 16);
            printAge(LocalDate.of(2001, 7, 16));
            printCurrentTime();
            printDatePlusDays(LocalDate.of(2025, 4, 26), 100);
            parseAndPrintDate("2000-01-01");
            printFormattedDate(LocalDate.of(2025, 4, 26));
            printTimeInZone("Europe/Kyiv");
        }
    }


