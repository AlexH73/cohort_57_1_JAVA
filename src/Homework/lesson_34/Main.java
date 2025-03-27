package Homework.lesson_34;

import java.util.List;

public class Main {
    public static void main(String[] args) {
       FigureAreaCalculator calculator = new FigureAreaCalculatorImpl();
       try {
           System.out.println("Площадь круга: " + calculator.calculateArea(List.of(4.0)));
           System.out.println("Площадь прямоугольника: " + calculator.calculateArea(List.of(4.0, 5.0)));
           System.out.println("Площадь треугольника: " + calculator.calculateArea(List.of(3.0, 4.0, 5.0)));

           //Тест с некорректными данными
           System.out.println("Тест с неверным количеством параметров: ");
           System.out.println(calculator.calculateArea(List.of(1.0, 2.0, 3.0, 4.0))); //Должно выбросить исключение
       } catch (IncorrectFigureSizeException e) {
           System.out.println(e.getMessage());
       }
    }
}
