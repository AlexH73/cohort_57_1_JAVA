package Homework.lesson_34;

import java.util.List;

public class FigureAreaCalculatorImpl implements FigureAreaCalculator{
    @Override
    public double calculateArea(List<Double> sides) throws IncorrectFigureSizeException {
        if (sides == null || sides.isEmpty()) {
            throw new IncorrectFigureSizeException("Die Liste der Seiten darf nicht leer oder null sein.");
        }

        switch (sides.size()) {
            case 1:
                // Fläche eines Kreises berechnen: π * r^2
                double radius = sides.get(0);
                if (radius <= 0) {
                    throw new IncorrectFigureSizeException("Der Radius muss größer als 0 sein.");
                }
                return Math.PI * radius * radius;

            case 2:
                // Fläche eines Rechtecks berechnen: a * b
                double länge = sides.get(0);
                double breite = sides.get(1);
                if (länge <= 0 || breite <= 0) {
                    throw new IncorrectFigureSizeException("Beide Seiten des Rechtecks müssen größer als 0 sein.");
                }
                return länge * breite;

            case 3:
                // Fläche eines Dreiecks mit Herons Formel berechnen
                double a = sides.get(0);
                double b = sides.get(1);
                double c = sides.get(2);
                if (a <= 0 || b <= 0 || c <= 0) {
                    throw new IncorrectFigureSizeException("Die Seiten des Dreiecks müssen größer als 0 sein.");
                }
                double s = (a + b + c) / 2;
                double fläche = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                if (Double.isNaN(fläche)) {
                    throw new IncorrectFigureSizeException("Die Seiten des Dreiecks bilden kein gültiges Dreieck.");
                }
                return fläche;

            default:
                // Ungültige Anzahl von Seiten
                throw new IncorrectFigureSizeException("Ungültige Anzahl von Seiten angegeben.");
        }
    }
    public static void main(String[] args) {
        FigureAreaCalculator calculator = new FigureAreaCalculatorImpl();

        // Тест 1: Площадь круга
        try {
            System.out.println("Площадь круга с радиусом 5: " + calculator.calculateArea(List.of(5.0)));
        } catch (IncorrectFigureSizeException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        // Тест 2: Площадь прямоугольника
        try {
            System.out.println("Площадь прямоугольника со сторонами 4 и 6: " + calculator.calculateArea(List.of(4.0, 6.0)));
        } catch (IncorrectFigureSizeException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        // Тест 3: Площадь треугольника
        try {
            System.out.println("Площадь треугольника со сторонами 3, 4 и 5: " + calculator.calculateArea(List.of(3.0, 4.0, 5.0)));
        } catch (IncorrectFigureSizeException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        // Тест 4: Некорректное количество сторон
        try {
            System.out.println("Попытка рассчитать площадь для 4 сторон: " + calculator.calculateArea(List.of(1.0, 2.0, 3.0, 4.0)));
        } catch (IncorrectFigureSizeException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}

