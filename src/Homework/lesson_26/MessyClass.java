package Homework.lesson_26;

public class MessyClass {
    public static final int MAX_VALUE = 100; // константа (можно оставить, но ниже покажем нарушения)

    // Переменная с нижним подчеркиванием (по стандарту должно быть myVar)
    private int myVar = 10;

    // Метод с неправильным именованием (по стандарту - lowerCamelCase)
    public void doSomething() {
        System.out.println("Doing something...");
    }

    // Метод с плохими отступами и некорректным именованием (должно быть calculateSum)
    public int calculateSum(int a, int b) {
        int sum = a + b;  // неправильный отступ и отсутствие пробелов вокруг оператора +
        return sum;
    }

    public static void main(String[] args) {
        MessyClass obj = new MessyClass();
        obj.doSomething();
        int result = obj.calculateSum(5, 10);
        System.out.println("Result: " + result);
    }
}
