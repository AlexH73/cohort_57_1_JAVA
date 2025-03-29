package Homework.lesson_34;

import java.util.List;

public class FigureAreaCalculatorImpl implements FigureAreaCalculator {
    @Override
    public double calculateArea(List<Double> sides) throws IncorrectFigureSizeException {
        int size = sides.size(); //определяется количество элементов в списке sides.

        if (size == 1) {
            double radius = sides.get(0);
            return Math.PI * radius * radius;
        } else if (size == 2) {
            return sides.get(0) * sides.get(1);
        } else if (size == 3) {
            double a = sides.get(0);
            double b = sides.get(1);
            double c = sides.get(2);
            double s = (a + b + c) / 2;
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        } else {
            throw new IncorrectFigureSizeException(" Неверное количество сторон: " + size);
        }
    }

    public static void testArea(FigureAreaCalculator calculator, List<Double> sides) {
        try {
            double area = calculator.calculateArea(sides);
            System.out.println("Площадь фигуры: " + area);

        } catch (IncorrectFigureSizeException e) {
            System.out.println("IncorrectFigureSizeException: " + e.getMessage());
        }
    }
}
