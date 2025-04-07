package Homework.lesson_34;

import java.util.List;

public class FigureAreaCalculatorImpl implements FigureAreaCalculator {

    @Override
    public double calculateArea(List<Double> sides) throws IncorrectFigureSizeException {
        if (sides == null || sides.isEmpty()) {
            throw new IncorrectFigureSizeException("Список сторон не может быть пустым. ");
        }

        return 0;
    }
}