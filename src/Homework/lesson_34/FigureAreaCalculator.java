package Homework.lesson_34;

import java.util.List;

/**
 * Интерфейс для вычисления площади различных фигур на основе переданных параметров.
 * Студенты должны реализовать этот интерфейс, добавив проверку корректности длины списка и выброс собственного исключения
 * в случае ошибок.
 *
 * Правила:
 * - Если передан один элемент — считается, что это радиус круга.
 * - Если передано два элемента — стороны прямоугольника.
 * - Если передано три элемента — стороны треугольника, используется формула Герона.
 * - Во всех остальных случаях выбрасывается исключение {@link IncorrectFigureSizeException}.
 */
public interface FigureAreaCalculator {

    /**
     * Вычисляет площадь фигуры на основе переданных размеров.
     * <ul>
     *     <li>1 элемент — площадь круга.</li>
     *     <li>2 элемента — площадь прямоугольника.</li>
     *     <li>3 элемента — площадь треугольника по формуле Герона.</li>
     *     <li>В остальных случаях выбрасывается {@link IncorrectFigureSizeException}.</li>
     * </ul>
     *
     * @param sides список значений сторон фигуры.
     * @return вычисленная площадь фигуры.
     * @throws IncorrectFigureSizeException если количество параметров некорректно.
     */
    double calculateArea(List<Double> sides) throws IncorrectFigureSizeException;
}