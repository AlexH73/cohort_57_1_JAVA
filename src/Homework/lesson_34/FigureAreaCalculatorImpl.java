package Homework.lesson_34;

import java.util.List;

public class FigureAreaCalculatorImpl implements FigureAreaCalculator {

    @Override
    public double calculateArea(List<Double> sides) throws IncorrectFigureSizeException {
        if (sides == null || sides.isEmpty()) {
            throw new IncorrectFigureSizeException("Die Liste der Seiten darf nicht leer oder null sein.");
        }

        int numberOfSides = sides.size();
        if (numberOfSides > 3 || numberOfSides < 1) {
            throw new IncorrectFigureSizeException("Ungültige Anzahl von Seiten. Nur 1 (Kreis), 2 (Rechteck) oder 3 (Dreieck) sind erlaubt.");
        }

        for (double side : sides) {
            if (side <= 0) {
                throw new IncorrectFigureSizeException("Alle Seiten müssen größer als 0 sein.");
            }
        }

        switch (numberOfSides) {
            case 1: // Kreis
                double radius = sides.get(0);
                return Math.PI * Math.pow(radius, 2);

            case 2: // Rechteck
                double length = sides.get(0);
                double width = sides.get(1);
                return length * width;

            case 3: // Dreieck
                double a = sides.get(0);
                double b = sides.get(1);
                double c = sides.get(2);
                double s = (a + b + c) / 2; // Halbperimeter
                double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

                if (Double.isNaN(area)) {
                    throw new IncorrectFigureSizeException("Die Seiten des Dreiecks bilden kein gültiges Dreieck.");
                }
                return area;

            default:
                throw new IncorrectFigureSizeException("Unbekannter Fehler bei der Bestimmung der Fläche.");
        }
    }

    public static void main(String[] args) {
        FigureAreaCalculator calculator = new FigureAreaCalculatorImpl();

        // Testfälle
        testCalculator(calculator, List.of(5.0), "Kreis");
        testCalculator(calculator, List.of(4.0, 6.0), "Rechteck");
        testCalculator(calculator, List.of(3.0, 4.0, 5.0), "Dreieck");
        testCalculator(calculator, List.of(1.0, 2.0, 3.0, 4.0), "Ungültige Eingabe");
    }

    private static void testCalculator(FigureAreaCalculator calculator, List<Double> sides, String figureType) {
        try {
            System.out.println("Fläche des " + figureType + ": " + calculator.calculateArea(sides));
        } catch (IncorrectFigureSizeException e) {
            System.err.println("Fehler beim Berechnen der Fläche: " + e.getMessage());
        }
    }
}


