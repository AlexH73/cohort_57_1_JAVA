package Homework.lesson_34;

import java.util.List;
/**
 * Интерфейс для вычисления площади различных фигур на основе переданных параметров.
 * Студенты должны реализовать этот интерфейс, добавив проверку корректности длины списка и выброс собственного исключения
 * в случае ошибок.
 *
 * Правила:
 * - Если передан один элемент — считается, что это радиус круга.
 * - Если передано два элемента — стороны прямоугольника.
 * - Если передано три элемента — стороны треугольника, используется формула Герона.
 * - Во всех остальных случаях выбрасывается исключение {@link IncorrectFigureSizeException}.
 */
public class FigureAreaCalculatorImpl implements FigureAreaCalculator{

    @Override
    public double calculateArea(List<Double> sides) throws IncorrectFigureSizeException {
        if (sides == null || sides.isEmpty()) {
            throw new IncorrectFigureSizeException(" Список сторон не может быть пустым. ");
        }

        switch (sides.size()) {
            case 1:
                return calculateCircleArea(sides.get(0));
            case 2:
                return calculateRectangleArea(sides.get(0), sides.get(1));
            case 3:
                return calculateTriangleArea(sides.get(0), sides.get(1), sides.get(2));
            default:
                throw new IncorrectFigureSizeException("Некорректное количество параметров: " + sides.size());
        }
    }

    /**
     * Вычисляет площадь круга.
     *
     * @param radius радиус круга.
     * @return площадь круга.
     * @throws IncorrectFigureSizeException если радиус некорректен.
     */
    private double calculateCircleArea(double radius) throws IncorrectFigureSizeException {
        if (radius <= 0) {
            throw new IncorrectFigureSizeException("Радиус должен быть положительным");
        }
        return Math.PI * radius * radius;//S=π×r2.Math.PI — это встроенная константа Java, представляющая число π.
    }

    /**
     * Вычисляет площадь прямоугольника.
     *
     * @param length длина прямоугольника.
     * @param width  ширина прямоугольника.
     * @return площадь прямоугольника.
     * @throws IncorrectFigureSizeException если длина или ширина некорректны.
     */
    private double calculateRectangleArea(double length, double width) throws IncorrectFigureSizeException {
        if (length <= 0 || width <= 0) {
            throw new IncorrectFigureSizeException("Стороны прямоугольника должны быть положительными.");
        }
        return length * width;
    }

    /**
     * Вычисляет площадь треугольника по формуле Герона.
     *
     * @param a сторона a.
     * @param b сторона b.
     * @param c сторона c.
     * @return площадь треугольника.
     * @throws IncorrectFigureSizeException если стороны треугольника некорректны.
     */
    private double calculateTriangleArea(double a, double b, double c) throws IncorrectFigureSizeException {
        if (a <= 0 || b <= 0 || c <=0) {
            throw new IncorrectFigureSizeException("Стороны треугольника должны быть положительными.");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {

        }
        double s = (a + b + c) / 2; //Площадь Герона:Math.sqrt(...) — вычисляет квадратный корень.
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
