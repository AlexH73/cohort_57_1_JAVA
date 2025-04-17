package Homework.lesson_19;

import java.time.LocalDate;
import java.time.DayOfWeek;

public class DateUtils {
    /**
     * Задача 6: Напишите метод, который возвращает текущий день недели в виде целого числа
     * (1 для понедельника, 7 для воскресенья).
     * Пример: getCurrentDayOfWeek() -> 5 (если сегодня пятница)
     *
     * @see LocalDate#now()
     * @see DayOfWeek#getValue()
     */
    public static void main(String[] args) {
        int currentDayOfWeek = getCurrentDayOfWeek();
        System.out.println("Текущий день недели (1 для понедельника, 7 для воскресенья): " + currentDayOfWeek);
    }

    // Метод для получения текущего дня недели в виде целого числа
    public static int getCurrentDayOfWeek() {
        // Получаем текущую дату
        LocalDate currentDate = LocalDate.now();
        // Получаем текущий день недели
        DayOfWeek dayOfWeek = currentDate.getDayOfWeek();
        // Возвращаем значение текущего дня недели (1 для понедельника, 7 для воскресенья)
        return dayOfWeek.getValue();
    }
}
