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
import java.util.Stack;

public interface BracketValidator {
    boolean isValid(String sequence);

    static void main(String[] args) {
        BracketValidator validator = new BracketValidatorImpl();

        System.out.println(validator.isValid("([ ] { })")); // true
        System.out.println(validator.isValid("[(])"));      // false
        System.out.println(validator.isValid("{[( )]}"));   // true
        System.out.println(validator.isValid("{[}"));       // false
    }
}

class BracketValidatorImpl implements BracketValidator {
    @Override
    public boolean isValid(String sequence) {
        Stack<Character> stack = new Stack<>();
        for (char ch : sequence.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char openBracket = stack.pop();
                if (!isMatchingPair(openBracket, ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '[' && close == ']') ||
               (open == '{' && close == '}');
    }
}


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
