package Practice.Practice_01;

public class StringTrimExample {
    public static void main(String[] args) {
        // Задание 2: Удаление лишних пробелов
        /*
        Создайте строку с текстом "   Привет, Java!   ".
        - Удалите пробелы в начале и конце строки.
        - Выведите результат.
        */
        // Создаем строку
        String text = "   Привет, Java!   ";

        // Удаляем пробелы в начале и конце строки
        String trimmedText = text.trim();

        // Выводим результат
        System.out.println(trimmedText);
    }
}
