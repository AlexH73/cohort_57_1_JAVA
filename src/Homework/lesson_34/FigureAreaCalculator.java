package Homework.lesson_34;

import java.util.List;
/**
 * Интерфейс для вычисления площади различных фигур на основе переданных параметров.
 *
 * Правила:
 * - Если передан один элемент — считается, что это радиус круга.
 * - Если передано два элемента — стороны прямоугольника.
 * - Если передано три элемента — стороны треугольника (используется формула Герона).
 * - Во всех остальных случаях выбрасывается исключение {@link IncorrectFigureSizeException}.
 */
public interface FigureAreaCalculator {
    /**
     * Вычисляет площадь фигуры на основе переданных размеров.
     *
     * @param sides список значений сторон фигуры.
     * @return вычисленная площадь фигуры.
     * @throws IncorrectFigureSizeException если количество параметров некорректно.
     */
    double calculateArea(List<Double> sides) throws IncorrectFigureSizeException;
}
