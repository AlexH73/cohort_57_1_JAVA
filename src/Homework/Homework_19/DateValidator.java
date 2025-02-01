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
        // Создаем форматтер со строгим стилем резолвинга (проверка на корректность даты)
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("uuuu-MM-dd")
                .withResolverStyle(ResolverStyle.STRICT);
        try {
            // Пытаемся создать строку даты и проверить ее корректность
            String dateString = String.format("%04d-%02d-%02d", year, month, day);
            LocalDate.parse(dateString, dateFormatter);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
