package Homework.Homework_19;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;

public class DateValidator {
    /**
     * Задача 7: Напишите метод, который принимает три целых числа (день, месяц, год)
     * и возвращает true, если дата является корректной.
     * Пример: isValidDate(31, 2, 2024) -> false
     *
     * @see java.time.LocalDate#of(int, int, int)
     */

    public static void main(String[] args) {
        // Пример использования метода isValidDate
        int day = 31;
        int month = 2;
        int year = 2024;
        boolean isValid = isValidDate(day, month, year);
        String prefix;
        if (!isValid){
            prefix = "не";
        } else {
            prefix = "";
        }
        System.out.println("Дата " + day + "/" + month + "/" + year + " " + prefix + "корректна: " + isValid);

        // Дополнительные примеры
        System.out.println("Дата 29/2/2020 корректна: " + isValidDate(29, 2, 2020)); // true (високосный год)
        System.out.println("Дата 31/4/2021 некорректна: " + isValidDate(31, 4, 2021)); // false (апрель имеет 30 дней)
    }
    /**
     * Метод для проверки корректности даты.
     * Принимает день, месяц и год в виде целых чисел.
     * Возвращает true, если дата является корректной, иначе false.
     *
     * @param day   День месяца.
     * @param month Месяц года.
     * @param year  Год.
     * @return true, если дата корректна, иначе false.
     */
    public static boolean isValidDate(int day, int month, int year) {

        // Проверка допустимости года, месяца и дня
        if (year < 1 || month < 1 || month > 12 || day < 1) {
            return false;
        }

        // Определение количества дней в месяце
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Проверка високосного года
        if (isLeapYear(year)) {
            daysInMonth[1] = 29; // В феврале 29 дней в високосном году
        }

        // Проверка допустимости дня для данного месяца
        if (day > daysInMonth[month - 1]) {
            return false;
        }

        return true;

        /**
         * Можно и наверное лучше организовать так:
         try {
         // Пытаемся создать объект LocalDate с указанными днем, месяцем и годом.
         // Если дата некорректна, будет выброшено исключение DateTimeException.
         LocalDate date = LocalDate.of(year, month, day);
         return true; // Если дата корректна, возвращаем true.
         } catch (DateTimeException e) {
         return false; // Если дата некорректна, возвращаем false.
         }
         */
    }

    // Метод для проверки високосного года
    private static boolean isLeapYear(int year) {

        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
