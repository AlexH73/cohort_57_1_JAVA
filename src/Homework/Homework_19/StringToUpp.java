package Homework.Homework_19;

public class StringToUpp {
    /**
     * Задача 8: Напишите метод, который принимает строку и возвращает её в верхнем регистре.
     * Пример: toUpperCase("hello") -> "HELLO"
     *
     * @see String#toUpperCase()
     */
    public static void main(String[] args) {
        // Пример использования метода toUpperCase
        System.out.println("Возврат строки в верхнем регистре: " + toUpperCase("hello"));
    }
    public static String toUpperCase(String input) {
        // Возвращаем входящую строку input в верхнем регистре.
        return input.toUpperCase();
    }
}
