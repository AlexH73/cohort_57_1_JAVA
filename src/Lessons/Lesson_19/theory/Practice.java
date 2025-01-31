package Lessons.Lesson_19.theory;

public class Practice {
    public static void main(String[] args) {
        System.out.println("Сумма чисел равна: " + add(-5, 2));
        System.out.printf("Ваша операционная система: ");
        printOS();
        System.out.println("Округленное число: " + roundValue(2.555));
        System.out.println("Возведение чисел (2, 3) в степень: " + power(2, 3));

        long currentTime = getCurrentTime();
        System.out.println("Текущее системное время в миллисекундах: " + currentTime);

    }

    /**
     * Задача 1: Напишите метод, который принимает два целых числа в качестве аргументов
     * и возвращает их сумму.
     * Пример: add(5, 7) -> 12
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * Задача 2: Напишите метод, который выводит на консоль название операционной системы,
     * на которой запущена программа.
     * Пример: printOS() -> "Windows 10"
     *
     * @see System#getProperty(String)
     */
    public static void printOS() {
        String key = "os.name";
        String value = System.getProperty(key);
        System.out.println(value);
    }

    /**
     * Задача 3: Напишите метод, который принимает число с плавающей точкой в качестве аргумента,
     * округляет его до ближайшего целого и возвращает результат.
     * Пример: roundValue(5.7) -> 6
     *
     * @see Math#round(double)
     */
    public static int roundValue(double value) {
        long number = Math.round(value);

        return (int) number;
    }

    /**
     * Задача 4: Напишите метод, который принимает два числа и возвращает результат их возведения
     * в степень. Первое число — основание, второе — показатель степени.
     * Пример: power(2, 3) -> 8
     *
     * @see Math#pow(double, double)
     */
    public static double power(double base, double exponent) {

        return Math.pow(base, exponent);
    }

    /**
     * Задача 5: Напишите метод, который не принимает аргументов и возвращает
     * текущее системное время в миллисекундах.
     * Пример: getCurrentTime() -> 1674928198000
     *
     * @see System#currentTimeMillis()
     */
    public static long getCurrentTime() {
        return System.currentTimeMillis();
    }

    /**
     * Задача 6: Напишите метод, который возвращает текущий день недели в виде целого числа
     * (1 для понедельника, 7 для воскресенья).
     * Пример: getCurrentDayOfWeek() -> 5 (если сегодня пятница)
     *
     * @see java.time.LocalDate#now()
     * @see java.time.DayOfWeek#getValue()
     */
//    public static int getCurrentDayOfWeek() {
//        // Реализация здесь
//    }

    /**
     * Задача 7: Напишите метод, который принимает три целых числа (день, месяц, год)
     * и возвращает true, если дата является корректной.
     * Пример: isValidDate(31, 2, 2024) -> false
     *
     * @see java.time.LocalDate#of(int, int, int)
     */
//    public static boolean isValidDate(int day, int month, int year) {
//        // Реализация здесь
//    }

    /**
     * Задача 8: Напишите метод, который принимает строку и возвращает её в верхнем регистре.
     * Пример: toUpperCase("hello") -> "HELLO"
     *
     * @see String#toUpperCase()
     */
//    public static String toUpperCase(String input) {
//        // Реализация здесь
//    }

    /**
     * Задача 9: Напишите метод, который возвращает имя пользователя системы,
     * на которой запущена программа.
     * Пример: getUserName() -> "admin"
     *
     * @see System#getProperty(String)
     */
//    public static String getUserName() {
//        // Реализация здесь
//    }

    /**
     * Задача 10: Напишите метод, который принимает два целых числа и возвращает наибольшее.
     * Пример: findMax(10, 20) -> 20
     *
     * @see Math#max(int, int)
     */
//    public static int findMax(int a, int b) {
//        // Реализация здесь
//    }

    /**
     * Задача 11: Напишите метод, который возвращает информацию о версии Java,
     * используемой для запуска программы.
     * Пример: getJavaVersion() -> "17.0.2"
     *
     * @see System#getProperty(String)
     */
//    public static String getJavaVersion() {
//        // Реализация здесь
//    }
}
