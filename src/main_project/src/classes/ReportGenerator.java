package main_project.src.classes;
import main_project.src.interfaces.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ReportGenerator implements IReportGenerator {
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    @Override
    public String generateTicketSalesReport(String startDate, String endDate) {
        try {
            LocalDate start = parseDate(startDate);
            LocalDate end = parseDate(endDate);

            if (start.isAfter(end)) {
                throw new InvalidDateRangeException("Начальная дата не может быть позже конечной даты.");
            }

            // Имитация создания отчета о продажах билетов
            return "Отчет о продажах билетов за период с " + startDate + " по " + endDate;
        } catch (DateTimeParseException e) {
            throw new InvalidDateRangeException("Некорректный формат даты. Ожидается формат yyyy-MM-dd.", e);
        }
    }

    @Override
    public String generateProductSalesReport(String startDate, String endDate) {
        try {
            LocalDate start = parseDate(startDate);
            LocalDate end = parseDate(endDate);

            if (start.isAfter(end)) {
                throw new InvalidDateRangeException("Начальная дата не может быть позже конечной даты.");
            }

            // Имитация создания отчета о продажах продуктов
            return "Отчет о продажах продуктов за период с " + startDate + " по " + endDate;
        } catch (DateTimeParseException e) {
            throw new InvalidDateRangeException("Некорректный формат даты. Ожидается формат yyyy-MM-dd.", e);
        }
    }

    private LocalDate parseDate(String date) {
        return LocalDate.parse(date, DATE_FORMATTER);
    }
}

