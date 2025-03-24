package Homework.lesson_33;

import java.util.List;

public interface BracketValidator {
    //Проверяет  корректность последовательности
    boolean isValidBracketSequence(String input);

    //Определяет ошибочные индексы
    List<Integer> getInvalidBracketIndexes(String input);

    //Исправляет ошибки в последовательности
    String fixBracketSequence(String input);
}
