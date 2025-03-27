package Lessons.Lesson_34.code.classwork;

public class SimpleExceptionTasksImpl {
    public static void main(String[] args) {
        SimpleExceptionTasksImpl simpleExceptionTasks = new SimpleExceptionTasksImpl();
        try {
            simpleExceptionTasks.divide(5, 5);
            simpleExceptionTasks.validateLength("Проверяет, соответствует ли длина " +
                    "строки ожидаемому значению.", 61);
            //int[] numbers = {};
            int[] numbers = {1, 2, 3};
            System.out.println("Первый элемент массива = " + simpleExceptionTasks.getFirstElement(numbers));
            System.out.println("Индекс: " + simpleExceptionTasks.findIndex(numbers, 3));
            simpleExceptionTasks.checkEven(7);

        } catch (NegativeDividerException negativeDividerException) {
            System.err.println("Было выброшено исключение NegativeDividerException - " +
                    "попытка делить на отрицательное число: " + negativeDividerException.getMessage());
        } catch (InvalidLengthException | EmptyArrayException | ElementNotFoundException | OddNumberException invalidException) {
            System.err.println("Ошибка: " + invalidException.getMessage());
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
        if (b < 0) {
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

    /**
     * Возвращает первый элемент массива.
     * Если массив пуст — выбрасывается исключение EmptyArrayException.
     *
     * @param arr входной массив
     * @return первый элемент массива
     * @throws EmptyArrayException если массив пуст
     */
    int getFirstElement(int[] arr) throws EmptyArrayException {
        if (arr == null || arr.length == 0) {
            throw new EmptyArrayException("Массив пуст");
        }
        return arr[0];
    }

    /**
     * Ищет индекс первого вхождения элемента target в массиве.
     * Если элемент не найден — выбрасывается ElementNotFoundException.
     *
     * @param arr    массив для поиска
     * @param target значение для поиска
     * @return индекс первого вхождения target
     * @throws ElementNotFoundException если элемент не найден
     */
    int findIndex(int[] arr, int target) throws ElementNotFoundException {
        if (arr == null || arr.length == 0) {
            throw new ElementNotFoundException("Массив не может быть null");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        throw new ElementNotFoundException("Элемент " + target + " не найден");
    }

    /**
     * Проверяет, что число чётное.
     * Если число нечётное — выбрасывается OddNumberException.
     *
     * @param number число для проверки
     * @throws OddNumberException если число нечётное
     */
    void checkEven(int number) throws OddNumberException{
        if (number % 2 != 0) {
            throw new OddNumberException("Число " + number + " нечётное");
        }

        System.out.println("Число " + number + " чётное");
    }
}
