package Lessons.Lesson_34.code.classwork;

public class SimpleExceptionTasksImpl {
    public static void main(String[] args) {
        SimpleExceptionTasksImpl simpleExceptionTasks = new SimpleExceptionTasksImpl();
        try {
            simpleExceptionTasks.divide(5, 5);
            simpleExceptionTasks.validateLength("Проверяет, соответствует ли длина " +
                    "строки ожидаемому значению.", 40);
        } catch (NegativeDividerException negativeDividerException) {
            System.err.println("Было выброшено исключение NegativeDividerException - " +
                    "попытка делить на отрицательное число: " + negativeDividerException.getMessage());
        } catch (InvalidLengthException invalidLengthException) {
            System.err.println("Ошибка: " + invalidLengthException.getMessage());
        }
    }

    /**
     * Делит число a на b.
     * Если b < 0, выбрасывается исключение NegativeDividerException.
     *
     * @param a делимое
     * @param b делитель
     * @return результат деления
     * @throws NegativeDividerException если b < 0
     */
    public int divide(int a, int b) throws NegativeDividerException {
        if(b < 0) {
            throw new NegativeDividerException("Деление на отрицательные числа запрещено");
        }

        return a / b;
    }

    /**
     * Проверяет, соответствует ли длина строки ожидаемому значению.
     * Если длина строки отличается от expectedLength — выбрасывается InvalidLengthException.
     *
     * @param input          строка для проверки
     * @param expectedLength ожидаемая длина строки
     * @throws InvalidLengthException если длина строки не совпадает с expectedLength
     */
    void validateLength(String input, int expectedLength) throws InvalidLengthException {
        if (input.length() != expectedLength) {
            throw new InvalidLengthException("Длина строки " + input.length() +
                    " не совпадает с заданной " + expectedLength + "!");
        }

        System.out.println("Ожидаемая длина строки " + expectedLength + " равна действительной " + input.length());
    }
}
