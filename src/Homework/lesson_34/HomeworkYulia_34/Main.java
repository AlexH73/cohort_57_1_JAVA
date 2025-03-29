package Homework.lesson_34.HomeworkYulia_34;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IncorrectFigureSizeException {
        FigureAreaCalculator calculator = new FigureAreaCalculatorImpl();

        List<Double> circle = Arrays.asList(5.0);
        System.out.println("Площадь круга: " + calculator.calculateArea(circle));

        List<Double> rectangle = Arrays.asList(3.0, 9.0);
        System.out.println("Площадь прямоугольника: " + calculator.calculateArea(rectangle));

        List<Double> triangle = Arrays.asList(3.0, 4.0, 5.0);
        System.out.println("Площадь треугольника: " + calculator.calculateArea(triangle));

        List<Double> invalid = Arrays.asList(1.0, 2.0, 3.0, 5.0);
        System.out.println("Площадь неизвестной фигуры: " + calculator.calculateArea(invalid));

        // уже не должно выводится
        List<Double> circle_2 = Arrays.asList(5.0);
        System.out.println("Площадь круга: " + calculator.calculateArea(circle));
    }
}


