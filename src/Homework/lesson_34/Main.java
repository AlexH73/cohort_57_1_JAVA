package Homework.lesson_34;

import java.util.List;

import static Homework.lesson_34.FigureAreaCalculatorImpl.testArea;

//Проверь реализацию на разных примерах:
//
//List.of(5.0) → площадь круга
//List.of(4.0, 6.0) → площадь прямоугольника
//List.of(3.0, 4.0, 5.0) → площадь треугольника
//List.of(1.0, 2.0, 3.0, 4.0) → должно выбросить исключение
public class Main {
    public static void main(String[] args) {
        FigureAreaCalculator calculator = new FigureAreaCalculatorImpl();
        testArea(calculator, List.of(5.0));
        testArea(calculator, List.of(4.0, 6.0));
        testArea(calculator, List.of(3.0, 4.0, 5.0));
        testArea(calculator, List.of(1.0, 2.0, 3.0, 4.0));
        testArea(calculator, List.of());
    }
}
