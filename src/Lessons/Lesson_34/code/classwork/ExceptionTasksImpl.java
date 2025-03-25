package Lessons.Lesson_34.code.classwork;

import java.util.List;

public class ExceptionTasksImpl implements ExceptionTasks{
    /**
     * Делит одно число на другое.
     * Если второй аргумент равен нулю — выбросить {@link ArithmeticException} с сообщением:
     * "Деление на ноль недопустимо".
     *
     * @param dividend делимое.
     * @param divisor делитель.
     * @return результат деления.
     */
    @Override
    public int divide(int dividend, int divisor) {
        return 0;
    }

    /**
     * Возвращает элемент из списка по указанному индексу.
     * Если индекс выходит за пределы допустимого диапазона, выбросить {@link IndexOutOfBoundsException}
     * с сообщением: "Индекс <index> вне допустимого диапазона от 0 до <maxIndex>".
     *
     * @param list список элементов.
     * @param index индекс для доступа к элементу.
     * @return строка из списка по указанному индексу.
     */
    @Override
    public String getElementByIndex(List<String> list, int index) {
        return "";
    }


    /**
     * Проверяет корректность строки e-mail.
     * Если e-mail некорректный — выбросить {@link IllegalArgumentException} с пояснением причины.
     *
     * <p>Подсказки для проверки:
     * <ul>
     *     <li>Пустая строка или null → выбросить исключение.</li>
     *     <li>Отсутствует символ '@' → выбросить исключение.</li>
     *     <li>Нет точки после '@' → выбросить исключение.</li>
     * </ul>
     *
     * @param email строка e-mail.
     * @return true, если e-mail валидный.
     */
    @Override
    public boolean validateEmail(String email) {
        if (email == null) {
            throw new IllegalArgumentException("email равен null");
        }

        if (email.isBlank()) {
            throw new IllegalArgumentException("email пустой");
        }

        // Отсутствует символ '@' → выбросить исключение.
        // Нет точки после '@' → выбросить исключение. (сравнить индексы '@' и '.')

        return true;
    }
}
