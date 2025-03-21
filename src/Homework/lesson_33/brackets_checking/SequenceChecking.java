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
 *
 * Каждой открывающей скобке ((, [, {) должна соответствовать закрывающая скобка того же типа (), ], }).<br />
 * Закрывающая скобка должна следовать после своей открывающей пары.<br />
 * Скобки должны быть правильно вложены друг в друга.<br />
 * задача должна быть реализована через имплементацию интерфейса BracketValidator<br />
 * <b>Примеры<b/><br />
 * <b>Вход:<b/> ( [ ] { } ) Вывод: true<br />
 * <b>Вход:<b/> [(]) Вывод: false<br />
 * <b>Вход:<b/> {[( )]} Вывод: true<br />
 * <b>Вход:<b/> {[} Вывод: false<br />
 *<b> Реализация<b/>
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
        System.out.println(validator.isValidBracketSequence("( [ ] { } )"));
        System.out.println(validator. isValidBracketSequence("[(])"));
        System.out.println(validator.isValidBracketSequence("{[( )]}"));
        System.out.println(validator.isValidBracketSequence("{[}"));

        System.out.println(validator.getInvalidBracketIndexes("{[}"));
        System.out.println(validator.fixBracketSequence("{[}"));
    }

    // Попытка автоматического исправления последовательности
    @Override
    public String fixBracketSequence(String input) {
        Deque<Character> stack = new ArrayDeque<>();
        List<Character> sb = new ArrayList<>();         // Для формирования результата

        for (char c : input.toCharArray()) {
            if (isOpenBracket(c)) {
                stack.push(c);
                sb.add(c);                              // Сохраняем открывающие
            } else if (isCloseBracket(c)) {
                if (stack.isEmpty()) {
                    continue;                          // Пропускаем лишние закрывающие
                }
                char top = stack.peek();
                if (isMatching(top, c)) {              // Корректная пара
                    stack.pop();
                    sb.add(c);
                } else {                               // Замена на правильную закрывающую
                    sb.add(getClosingBraket(top));
                    stack.pop();
                }
            } else {
                sb.add(c);                               // Сохранение других символов
            }
        }

        // Добавление недостающих закрывающих скобок
        while (!stack.isEmpty()) {
            if (getClosingBraket(stack.peek()) == '!') {
                System.err.println("Недопустимая скобка:" + getClosingBraket(stack.peek()));
                continue;
            }
            sb.add(getClosingBraket(stack.pop()));
        }

        return sb.toString();  // Возврат исправленной строки
    }

    // Проверка общей корректности последовательности
    @Override
    public boolean isValidBracketSequence(String input) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : input.toCharArray()) {          // Итерация по всем символам строки
            if (isOpenBracket(c)) {                  // Если символ - открывающая скобка
                stack.push(c);                       // Добавляем в стек
            } else if(isCloseBracket(c)) {              // Если символ - закрывающая скобка
                // Проверка соответствия с последней открывающей
                if (stack.isEmpty() || !isMatching(stack.pop(), c)) {
                    return false;                     // Нарушение правильности
                }
            }
        }
        return stack.isEmpty();  // Все открывающие должны быть закрыты
    }

    // Поиск индексов некорректных скобок
    @Override
    public List<Integer> getInvalidBracketIndexes(String input) {
        Deque<Character> stack = new ArrayDeque<>();
        List<Integer> errors = new ArrayList<>();     // Список для ошибок

        for (int i = 0; i < input.length(); i++) {    // Итерация с отслеживанием индексов
            char c = input.charAt(i);
            if (isOpenBracket(c)) {
                stack.push(c);
            } else if (isCloseBracket(c)) {
                if (stack.isEmpty()) {                // Лишняя закрывающая скобка
                    errors.add(i);
                } else {
                    char top = stack.pop();
                    if (!isMatching(top, c)) {        // Несоответствие типов
                        errors.add(i);
                    }
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
        return c == ')' || c == '[' || c == '{';
    }

    // Проверка соответствия скобок
    private boolean isMatching(char open, char close) {
        return (open == '(' && close == ')' ||
                open == '[' && close == ']' ||
                open == '{' && close == '}');
    }

    // Получение закрывающей скобки по открывающей
    private char getClosingBraket(char open) {
        if (open == '(') {
            return ')';
        } else if (open == '[') {
            return ']';
        } else if (open == '{') {
            return '}';
        } else {
            return '!';
        }
    }
}
