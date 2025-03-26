package Lessons.Lesson_34.code.classwork;

public class SimpleExceptionTasksImpl {
    public static void main(String[] args) {
        SimpleExceptionTasksImpl simpleExceptionTasks = new SimpleExceptionTasksImpl();
        try {
            simpleExceptionTasks.divide(5, -5);
        } catch (NegativeDividerException negativeDividerException) {
            System.out.println("Было выброшено исключение NegativeDividerException - " +
                    "попытка делить на отрицательное число: " + negativeDividerException.getMessage());
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
}
