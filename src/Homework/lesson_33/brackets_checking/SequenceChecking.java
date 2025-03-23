package Homework.lesson_33.brackets_checking;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * <h1>Задача 2: Проверка правильности скобочной последовательности</h1>
 * <b>Описание</b><br />
 * Разработайте программу на Java для проверки правильности скобочной последовательности.<br />
 * <b>Правильная скобочная последовательность должна удовлетворять следующим критериям:</b>
 * <p>
 * Каждой открывающей скобке ((, [, {) должна соответствовать закрывающая скобка того же типа (), ], }).<br />
 * Закрывающая скобка должна следовать после своей открывающей пары.<br />
 * Скобки должны быть правильно вложены друг в друга.<br />
 * задача должна быть реализована через имплементацию интерфейса BracketValidator<br />
 * <b>Примеры<b/><br />
 * <b>Вход:<b/> ( [ ] { } ) Вывод: true<br />
 * <b>Вход:<b/> [(]) Вывод: false<br />
 * <b>Вход:<b/> {[( )]} Вывод: true<br />
 * <b>Вход:<b/> {[} Вывод: false<br />
 * <b> Реализация<b/>
 * Используйте стек для отслеживания открывающих скобок.<br />
 * При обходе строки, помещайте в стек все открывающие скобки.<br />
 * При встрече закрывающей скобки проверьте, соответствует ли она верхнему элементу <br />
 * стека (последней открывающей скобке). Если соответствует, извлеките элемент из стека.
 * В противном случае, последовательность скобок неверная.<br />
 * После обработки всей строки, если стек пуст, последовательность верная.<br />
 * Если в стеке остались элементы, последовательность неверная.<br />
 */
public class SequenceChecking implements BracketValidator {
    public static void main(String[] args) {
        BracketValidator validator = new SequenceChecking();
        System.out.println(validator.isValidBracketSequence("( [ ] { } )")); // Вывод: true
        System.out.println(validator.isValidBracketSequence("[(])"));        // Вывод: false
        System.out.println(validator.isValidBracketSequence("{[( )]}"));     // Вывод: true
        System.out.println(validator.isValidBracketSequence("{[}"));         // Вывод: false

        System.out.println(validator.getInvalidBracketIndexes("{[}"));       // Вывод: [2]
        System.out.println(validator.fixBracketSequence("{[!"));             // Вывод: {[!]}
        System.out.println(validator.fixBracketSequence("[[}]"));            // Вывод: [[]{}]

    }

    // Попытка автоматического исправления последовательности
    @Override
    public String fixBracketSequence(String input) {
        Deque<Character> stack = new ArrayDeque<>();
        List<Character> resultChars = new ArrayList<>();         // Для формирования результата

        for (char c : input.toCharArray()) {
            if (isOpenBracket(c)) {
                stack.push(c);
                resultChars.add(c);                              // Сохраняем открывающие
            } else if (isCloseBracket(c)) {
                if (stack.isEmpty()) {
                    resultChars.add(getOpeningBracket(c));       // Пропускаем лишние закрывающие
                    resultChars.add(c);
                    continue;
                }
                char top = stack.peek();
                if (isMatching(top, c)) {                       // Корректная пара
                    stack.pop();
                    resultChars.add(c);
                } else {
                    resultChars.add(getClosingBracket(top));    // Замена на правильную закрывающую
                    stack.pop();

                    if (stack.isEmpty()) {
                        resultChars.add(getOpeningBracket(c));
                        resultChars.add(c);
                        continue;
                    }
                    top = stack.peek();
                    if (isMatching(top, c)) {                       // Корректная пара
                        stack.pop();
                        resultChars.add(c);
                    } else {
                        resultChars.add(getOpeningBracket(c));      // Замена на правильную открывающую
                        resultChars.add(c);
                    }
                }
            } else {
                resultChars.add(c);                                 // Сохранение других символов
            }
        }

        // Добавление недостающих закрывающих скобок
        while (!stack.isEmpty()) {
            resultChars.add(getClosingBracket(stack.pop()));
        }

        // Собираем строку
        String result = "";
        for (Character ch : resultChars) {
            result += ch;
        }
        return result;  // Возврат исправленной строки
    }

    // Проверка общей корректности последовательности
    @Override
    public boolean isValidBracketSequence(String input) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : input.toCharArray()) {             // Итерация по всем символам строки
            if (isOpenBracket(c)) {                      // Если символ - открывающая скобка
                stack.push(c);                           // Добавляем в стек
            } else if (isCloseBracket(c)) {              // Если символ - закрывающая скобка
                // Проверка соответствия с последней открывающей
                if (stack.isEmpty() || !isMatching(stack.pop(), c)) {
                    return false;                        // Нарушение правильности
                }
            }
        }
        return stack.isEmpty();                          // Все открывающие должны быть закрыты
    }

    // Поиск индексов некорректных скобок
    @Override
    public List<Integer> getInvalidBracketIndexes(String input) {
        Deque<Character> stack = new ArrayDeque<>();
        List<Integer> errors = new ArrayList<>();        // Список для ошибок

        for (int i = 0; i < input.length(); i++) {       // Итерация с отслеживанием индексов
            char c = input.charAt(i);
            if (isOpenBracket(c)) {
                stack.push(c);
            } else if (isCloseBracket(c)) {
                if (stack.isEmpty()) {                  // Лишняя закрывающая скобка
                    errors.add(i);
                } else {
                    char top = stack.pop();
                    if (!isMatching(top, c)) {          // Несоответствие типов
                        errors.add(i);
                    }
                }
            }
        }

        // Добавляем незакрытые открывающие скобки
        if (!stack.isEmpty()) {
            int startIdx = input.length() - stack.size();
            for (int i = startIdx; i < input.length(); i++) {
                if (isOpenBracket(input.charAt(i))) {
                    errors.add(i);
                }
            }
        }

        return errors;  // Возврат индексов ОШИБОЧНЫХ закрывающих скобок
    }

    //--- ВСПОМОГАТЕЛЬНЫЕ МЕТОДЫ ---//

    // Проверка на открывающую скобку
    private boolean isOpenBracket(char c) {
        return c == '(' || c == '[' || c == '{';
    }

    // Проверка на закрывающую скобку
    private boolean isCloseBracket(char c) {
        return c == ')' || c == ']' || c == '}';
    }

    // Проверка соответствия скобок
    private boolean isMatching(char open, char close) {
        return (open == '(' && close == ')' ||
                open == '[' && close == ']' ||
                open == '{' && close == '}');
    }

    // Получение закрывающей скобки по открывающей
    private char getClosingBracket(char open) {
        if (open == '(') {
            return ')';
        } else if (open == '[') {
            return ']';
        } else if (open == '{') {
            return '}';
        }
        return '\0'; // Заглушка (никогда не выполнится при корректных вызовах)
    }

    // Получение открывающей скобки по закрывающей
    private Character getOpeningBracket(char close) {
        if (close == ')') {
            return '(';
        } else if (close == ']') {
            return '[';
        } else if (close == '}') {
            return '{';
        }
        return '\0'; // Заглушка (никогда не выполнится при корректных вызовах)
    }

}
