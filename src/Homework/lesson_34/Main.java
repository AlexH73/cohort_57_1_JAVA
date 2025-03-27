package Homework.lesson_34;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        FigureAreaCalculator calculator = new FigureAreaCalculatorImpl();

        // Примеры с try-catch при вызове метода
        try {
            // Корректные данные
            System.out.println("Круг: " + calculator.calculateArea(List.of(5.0)));
            System.out.println("Прямоугольник: " + calculator.calculateArea(List.of(4.0, 3.0)));
            System.out.println("Треугольник: " + calculator.calculateArea(List.of(3.0, 4.0, 5.0)));

            // Некорректные данные (4 стороны)
            System.out.println(calculator.calculateArea(List.of(1.0, 2.0, 3.0, 4.0)));
            // Некорректный треугольник (1, 1, 3)
            //System.out.println("Некорректный треугольник: " + calculator.calculateArea(List.of(1.0, 1.0, 3.0)));
        } catch (IncorrectFigureSizeException e) {
            System.err.println("Ошибка при вычислении: " + e.getMessage());
        } finally {
            // Этот блок выполнится ВСЕГДА
            System.out.println("\n[Лог] Завершение обработки фигур.");
        }
    }
}
