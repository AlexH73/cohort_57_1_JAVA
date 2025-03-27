package Homework.lesson_34;

import java.util.List;

public class FigureAreaCalculatorImpl implements FigureAreaCalculator {

    @Override
    public double calculateArea(List<Double> sides) throws IncorrectFigureSizeException {
        validateInput(sides);      // Проверка на null и размер списка
        validateValues(sides);     // Проверка на положительные значения

        if (isCircle(sides)) {
            return calculateCircleArea(sides.get(0));
        } else if (isRectangle(sides)) {
            return calculateRectangleArea(sides.get(0), sides.get(1));
        } else if (isTriangle(sides)) {
            validateTriangle(sides.get(0), sides.get(1), sides.get(2)); // Проверка треугольника
            return calculateTriangleArea(sides.get(0), sides.get(1), sides.get(2));
        }

        // Это исключение никогда не сработает, так как validateInput() уже проверил размер
        throw new IncorrectFigureSizeException("Некорректный размер списка");
    }

    // Проверка на null и размер списка
    private void validateInput(List<Double> sides) throws IncorrectFigureSizeException {
        if (sides == null || sides.isEmpty()) {
            throw new IncorrectFigureSizeException("Список сторон не может быть null");
        }

        int size = sides.size();
        if (size > 3) {
            throw new IncorrectFigureSizeException(
                    "Некорректное количество сторон: " + size
            );
        }
    }

    // Проверка на неотрицательные значения сторон
    private void validateValues(List<Double> sides) throws IncorrectFigureSizeException {
        for (double side : sides) {
            if (side <= 0) {
                throw new IncorrectFigureSizeException("Стороны должны быть положительными");
            }
        }
    }

    // Валидация треугольника (сумма двух сторон должна быть больше третьей)
    private void validateTriangle(double a, double b, double c) throws IncorrectFigureSizeException {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IncorrectFigureSizeException("Некорректные стороны треугольника");
        }
    }

    // Проверка типа фигуры
    private boolean isCircle(List<Double> sides) {
        return sides.size() == 1;
    }

    private boolean isRectangle(List<Double> sides) {
        return sides.size() == 2;
    }

    private boolean isTriangle(List<Double> sides) {
        return sides.size() == 3;
    }

    // Методы для вычисления площади
    private double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    private double calculateRectangleArea(double a, double b) {
        return a * b;
    }

    private double calculateTriangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
