package Homework.lesson_32;

import java.util.List;

/**
 * Интерфейс для проверки правильности скобочной последовательности.
 * Студенты должны реализовать этот интерфейс, используя стек для обработки открывающих и закрывающих скобок.
 *
 * Примеры тестовых данных:
 * - Вход: "( [ ] { } )" → Выход: true
 * - Вход: "[(])" → Выход: false
 * - Вход: "{[( )]}" → Выход: true
 * - Вход: "{[}" → Выход: false
 */
public interface BracketValidator {

    /**
     * Проверяет, является ли переданная строка корректной скобочной последовательностью.
     * Используется стек для отслеживания открывающих скобок.
     *
     * @param input строка, содержащая скобки
     * @return true, если скобочная последовательность корректна, иначе false
     */
    boolean isValidBracketSequence(String input);

    /**
     * Возвращает список индексов некорректных скобок в строке.
     * Например, для входа "{[}" метод должен вернуть `[2]`, так как `}` не имеет пары.
     *
     * @param input строка, содержащая скобки
     * @return список индексов ошибочных скобок, если они есть, иначе пустой список
     */
    List<Integer> getInvalidBracketIndexes(String input);

    /**
     * Генерирует строку с исправленной скобочной последовательностью, если это возможно.
     * Например, для входа "{[}" метод может вернуть "{[]}".
     *
     * @param input строка, содержащая скобки
     * @return исправленная строка, если возможно, иначе пустая строка
     */
    String fixBracketSequence(String input);
}
