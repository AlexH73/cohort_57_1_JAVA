package Homework.lesson_34;

import java.util.List;

public class FigureAreaCalculatorImpl implements FigureAreaCalculator {

    @Override
    public double calculateArea(List<Double> sides) throws IncorrectFigureSizeException {
        if (sides == null || sides.isEmpty()) {
            throw new IncorrectFigureSizeException("Список сторон не может быть пустым. ");
        }

        if (sides.size() == 1) {
            Double radius = sides.get(0);
            return Math.PI * radius * radius;
        }

        if (sides.size() == 2) {
            double a = sides.get(0);
            double b = sides.get(1);
            return a * b;
        }

        if (sides.size() == 3) {
            double a = sides.get(0);
            double b = sides.get(1);
            double c = sides.get(2);
            double s = (a + b + c) / 2;
            return Math.sqrt(s * (s -a) * (s - b) * (s -c));
        }

        //if (sides.size() > 3) {
            throw new IncorrectFigureSizeException ("Превышает количество сторон. ");
        //}
    }
}