package Homework.lesson_34;

import java.util.List;

    public class Main {
        public static void main(String[] args) {
            FigureAreaCalculator calculator = new FigureAreaCalculatorImpl();

            try {
                System.out.println("Площадь круга (радиус 5): " + calculator.calculateArea(List.of(5.0)));
                System.out.println("Площадь прямоугольника (4x6): " + calculator.calculateArea(List.of(4.0, 6.0)));
                System.out.println("Площадь треугольника (3,4,5): " + calculator.calculateArea(List.of(3.0, 4.0, 5.0)));
                System.out.println("Ошибка (4 стороны): " + calculator.calculateArea(List.of(1.0, 2.0, 3.0, 4.0)));
            } catch (IncorrectFigureSizeException e) {
                System.err.println("Ошибка: " + e.getMessage());
            }
        }
    }


