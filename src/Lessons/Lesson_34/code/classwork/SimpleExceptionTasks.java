package Lessons.Lesson_34.code.classwork;

/**
 * Интерфейс с методами, требующими выбрасывания собственных исключений.
 * Студенты должны реализовать каждый метод и создать соответствующее исключение.
 */
public interface SimpleExceptionTasks {

    /**
     * Делит число a на b.
     * Если b < 0, выбрасывается исключение NegativeDividerException.
     *
     * @param a делимое
     * @param b делитель
     * @return результат деления
     * @throws NegativeDividerException если b < 0
     */
    int divide(int a, int b) throws NegativeDividerException;

    /**
     * Проверяет, соответствует ли длина строки ожидаемому значению.
     * Если длина строки отличается от expectedLength — выбрасывается InvalidLengthException.
     *
     * @param input          строка для проверки
     * @param expectedLength ожидаемая длина строки
     * @throws InvalidLengthException если длина строки не совпадает с expectedLength
     */
    void validateLength(String input, int expectedLength) throws InvalidLengthException;

    /**
     * Возвращает первый элемент массива.
     * Если массив пуст — выбрасывается исключение EmptyArrayException.
     *
     * @param arr входной массив
     * @return первый элемент массива
     * @throws EmptyArrayException если массив пуст
     */
    // int getFirstElement(int[] arr) throws EmptyArrayException;

    /**
     * Ищет индекс первого вхождения элемента target в массиве.
     * Если элемент не найден — выбрасывается ElementNotFoundException.
     *
     * @param arr    массив для поиска
     * @param target значение для поиска
     * @return индекс первого вхождения target
     * @throws ElementNotFoundException если элемент не найден
     */
    // int findIndex(int[] arr, int target) throws ElementNotFoundException;

    /**
     * Проверяет, что число чётное.
     * Если число нечётное — выбрасывается OddNumberException.
     *
     * @param number число для проверки
     * @throws OddNumberException если число нечётное
     */
    // void checkEven(int number) throws OddNumberException;
}