package Homework.lesson_26.HomeworkYulia_26;

/**
 * MessyClass (исправленный вариант)
 * Данный класс демонстрирует:
 * - Корректные отступы и пробелы
 * - Правильное именование переменных и методов (lowerCamelCase)
 * - Удаление неиспользуемого кода
 */
public class MessyClass {

    private static final int MAX_VALUE = 100;

    private int myVar = 10;


    public void doSomething() {
        System.out.println("Doing something...");
    }


    public int calculateSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        MessyClass obj = new MessyClass();
        obj.doSomething();

        int result = obj.calculateSum(5, 10);
        System.out.println("Result: " + result);
    }
}