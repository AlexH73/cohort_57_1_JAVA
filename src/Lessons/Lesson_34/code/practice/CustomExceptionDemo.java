package Lessons.Lesson_34.code.practice;

/**
 * В классе ExceptionDemo определен метод checkNumber, который проверяет число и выбрасывает CustomException
 * в случае, если число отрицательное. <p>
 * В методе main демонстрируется вызов метода checkNumber и обработка возможного пользовательского исключения в
 * блоке try-catch.
 */
public class CustomExceptionDemo {
    // Метод, который может выбросить CustomException
    public void checkNumber(int number) throws CustomException {
        if (number < 0) {
            // Если число отрицательное, выбрасываем CustomException
            throw new CustomException("Число не должно быть отрицательным");
        }
        System.out.println("Проверенное число: " + number);
    }

    public static void main(String[] args) {
        CustomExceptionDemo demo = new CustomExceptionDemo();

        // Попытка использовать метод checkNumber с обработкой исключения
        try {
            demo.checkNumber(-5); // Передаем отрицательное число
        } catch (CustomException ex) {
            // Обработка пользовательского исключения
            System.out.println("Ошибка: " + ex.getMessage());
        }
    }
}