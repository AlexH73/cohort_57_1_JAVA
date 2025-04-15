package Lessons.Lesson_41.src.practice.task;

public class DateTimeConversionTasks {

    /**
     * Задача 1: Парсинг времени ввода пользователя в одной часовой зоне и вывод в UTC.
     *
     * @param userTimeString Время в формате "HH:mm:ss".
     * @param userZoneId Часовой пояс пользователя.
     * @return Время в UTC в формате "HH:mm:ss".
     */
    public static String convertUserTimeToUTC(String userTimeString, String userZoneId) {
        return null;
    }

    /**
     * Задача 2: Парсинг строки даты и времени, добавление временного интервала и конвертация результата в другой часовой пояс.
     *
     * @param dateTimeString Дата и время в формате "yyyy-MM-ddTHH:mm".
     * @param hoursToAdd Количество часов, которые нужно добавить.
     * @param targetZoneId Целевой часовой пояс для конвертации результата.
     * @return Результат в формате "yyyy-MM-dd HH:mm:ss zone" в целевом часовом поясе.
     */
    public static String parseAddAndConvert(String dateTimeString, long hoursToAdd, String targetZoneId) {
        return null;
    }

    public static void main(String[] args) {
        // Пример использования задач
        System.out.println(convertUserTimeToUTC("20:00:00", "Europe/London"));
        System.out.println(parseAddAndConvert("2023-01-01T10:00", 5, "Asia/Kolkata"));
    }
}

