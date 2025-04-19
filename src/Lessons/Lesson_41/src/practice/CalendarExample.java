package Lessons.Lesson_41.src.practice;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class CalendarExample {

    public static void main(String[] args) {
        // Создание экземпляра Calendar
        Calendar calendar = Calendar.getInstance();
        System.out.println("Текущая дата и время (Calendar): " + calendar.getTime());

        // Установка конкретной даты
        calendar.set(2023, Calendar.JANUARY, 1, 12, 0);
        System.out.println("Установленная дата и время: " + calendar.getTime());

        // Добавление и вычитание значений
        calendar.add(Calendar.DAY_OF_MONTH, 5); // Добавление 5 дней
        System.out.println("Дата и время после добавления 5 дней: " + calendar.getTime());
        calendar.add(Calendar.HOUR, -2); // Вычитание 2 часов
        System.out.println("Дата и время после вычитания 2 часов: " + calendar.getTime());

        // Получение компонентов даты и времени
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // Месяцы начинаются с 0
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("Год: " + year + ", Месяц: " + month + ", День: " + day);

        // Работа с часовыми поясами
        Calendar tokyoCalendar = new GregorianCalendar(TimeZone.getTimeZone("Asia/Tokyo"));
        tokyoCalendar.setTimeInMillis(calendar.getTimeInMillis()); // Установка того же момента времени
        System.out.println("Текущее время в Токио: " + tokyoCalendar.getTime());

        // Сравнение дат
        Calendar anotherCalendar = Calendar.getInstance();
        anotherCalendar.add(Calendar.DAY_OF_MONTH, 10); // Установим дату на 10 дней вперед
        boolean isAfter = calendar.after(anotherCalendar);
        System.out.println("Исходная дата после другой даты? " + isAfter);

        // Проверка на високосный год
        boolean isLeapYear = ((GregorianCalendar) calendar).isLeapYear(calendar.get(Calendar.YEAR));
        System.out.println("Високосный год? " + isLeapYear);
    }
}

