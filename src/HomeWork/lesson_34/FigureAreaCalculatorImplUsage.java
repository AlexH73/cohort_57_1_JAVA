package Homework.lesson_34;

import java.util.List;

public class FigureAreaCalculatorImplUsage {
    public static void main(String[] args) {
        FigureAreaCalculator calculator = new FigureAreaCalculatorImpl();

        try {
            double circleArea = calculator.calculateArea(List.of(5.0));
            System.out.println("Площадь круга " + circleArea);

            double rectangleArea = calculator.calculateArea(List.of(4.0, 6.0));
            System.out.println("Площадь прямоугольника " + rectangleArea);

            double triangleArea = calculator.calculateArea(List.of(3.0, 4.0, 5.0));
            System.out.println("Площадь треугольника " + triangleArea);

            //calculator.calculateArea(list.of(1.0, 2.0, 3.0, 4.0));
        } catch(IncorrectFigureSizeException e) {
            System.out.println("Ошибка " + e.getMessage());
        }
    }
}
