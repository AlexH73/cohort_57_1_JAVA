package Homework.lesson_34.HomeworkYulia_34;

import java.util.List;

public class FigureAreaCalculatorImpl implements FigureAreaCalculator {

    @Override
    public double calculateArea(List<Double> sides) throws IncorrectFigureSizeException {
        if (sides == null || sides.isEmpty()) {
            throw new IncorrectFigureSizeException("Список сторон не может быть пустым.");
        }

        switch (sides.size()) {
            case 1:
                return calculateCircleArea(sides.get(0));
            case 2:
                return calculateRectangleArea(sides.get(0), sides.get(1));
            case 3:
                return calculateTriangleArea(sides.get(0), sides.get(1), sides.get(2));
            default:
                throw new IncorrectFigureSizeException("Некорректное количество сторон: " + sides.size());
        }
    }

    private double calculateCircleArea(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Радиус должен быть положительным (получено: " + radius + ").");
        }
        return Math.PI * radius * radius;
    }

    private double calculateRectangleArea(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Длины сторон прямоугольника должны быть положительными (получено: "
                    + length + ", " + width + ").");
        }
        return length * width;
    }

    private double calculateTriangleArea(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Стороны треугольника должны быть положительными (получено: "
                    + a + ", " + b + ", " + c + ").");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Некорректные стороны треугольника: " + a + ", " + b + ", " + c
                    + " (не выполняется неравенство треугольника).");
        }

        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

