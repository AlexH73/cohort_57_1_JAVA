package Homework.lesson_34;

import  java.util.List;

public class FigureAreaCalculatorImpl implements FigureAreaCalculator {
    @Override
    public double calculateArea (List<Double> sides) throws IncorrectFigureSizeException {
        if (sides== null || sides.isEmpty()) {
            throw new IncorrectFigureSizeException("Список сторон не может быть пустым");
        }

        switch (sides.size()) {
            case 1:
                // площадь круга S = πr², где r — радиус круга.
                double radius = sides.get(0);
                if (radius <=0) {
                    throw new IncorrectFigureSizeException("Радиус должен быть положительным");
                }
                return Math.PI * radius * radius;

            case 2:
                // площадь прямоугольника S = a*b
                double a = sides.get(0);
                double b = sides.get(1);
                if (a <=0 || b <=0) {
                    throw new IncorrectFigureSizeException("Стороны прямоугольника должны быть положительны");
                }
                return a * b;

            case 3:
                //формулу Герона:
                //s = (a + b + c) / 2
                //area = Math.sqrt(s * (s - a) * (s - b) * (s - c))

                double x = sides.get(0);
                double y = sides.get(1);
                double z = sides.get(2);
                if (x<=0 || y <=0 || z <=0) {
                    throw new IncorrectFigureSizeException("Cтороны треугольника должны быть положительными");
                }

                double s = (x + y + z) / 2;
                double area = Math.sqrt(s* (s - x) * (s - y ) * (s - z));
                if (Double.isNaN(area)) {
                    throw new IncorrectFigureSizeException("Невозможно вычислить площадь: возможно, стороны не образуют треугольник");

            }
                return area;
            default:
                throw new IncorrectFigureSizeException("Некорректное число параметров");
        }
    }

}
