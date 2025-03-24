package Homework.lesson_33;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BracketValidatorImpl implements BracketValidator {
    public static void main(String[] args) {
        BracketValidator validator = new BracketValidatorImpl();
        System.out.println(validator.isValidBracketSequence("( [ ] { } )"));
        System.out.println(validator.isValidBracketSequence("[(])"));
        System.out.println(validator.isValidBracketSequence("{[( )]}"));
        System.out.println(validator.getInvalidBracketIndexes("{[}"));
        System.out.println(validator.fixBracketSequence("{[!"));
        System.out.println(validator.fixBracketSequence("[[}]"));

    }

    /**
     * Проверяет, является ли переданная строка корректной скобочной последовательностью.
     * Используется стек для отслеживания открывающих скобок.
     *
     * @param input строка, содержащая скобки
     * @return true, если скобочная последовательность корректна, иначе false
     */
    //Проверяет  корректность последовательности
    @Override
    public boolean isValidBracketSequence(String input) {
        Deque<Character> stack = new ArrayDeque<>();//Создается stack для хранения открывающих скобок.
        for (char c : input.toCharArray()) {    //Перебираются символы строки:
            if (isOpenBracket(c)) {             //Если открывающая скобка ((, {, [), кладем в стек.
                stack.push(c);
            } else if (isCloserBracket(c)) {    //Если закрывающая скобка
                if (stack.isEmpty() || !isChecking(stack.pop(), c)) {
                    //Если стек пуст, значит у нас лишняя закрывающая скобка
                    //Мы извлекаем (pop()) верхнюю открывающую скобку из стека.
                    //Затем проверяем, совпадает ли она с текущей закрывающей скобкой c
                    return false;   //Ошибка: либо стек пуст, либо несоответствие скобок.
                }

            }
        }
        return stack.isEmpty();     //Все открывающие должны быть закрыты
    }

    /**
     * Возвращает список индексов некорректных скобок в строке.
     * Например, для входа "{[}" метод должен вернуть `[2]`, так как `}` не имеет пары.
     *
     * @param input строка, содержащая скобки
     * @return список индексов ошибочных скобок, если они есть, иначе пустой список
     */
    //Определяет ошибочные индексы
    @Override
    public List<Integer> getInvalidBracketIndexes(String input) {
        Deque<Character> stack = new ArrayDeque<>();     //Храним индексы открывающих скобок
        List<Integer> errors = new ArrayList<>();   //Возвращает список List<Integer> с индексами некорректных скобок.

        for (int i = 0; i < input.length(); i++) {  //Проход по строке
            char c = input.charAt(i);        //Символ, который мы сейчас анализируем
            if (isOpenBracket(c)) {         //Проверка открывающих скобок
                stack.push(c);
            } else if (isCloserBracket(c)) {    //Проверка закрывающих скобок
                if (stack.isEmpty()) { //Если стек пуст и встречена закрывающая скобка - это лишняя закрывающая скобка.
                } else {
                    char top = stack.pop(); //Берем верхнюю скобку top из стека.
                    if (!isChecking(top, c)) { //Проверяем, соответствует ли она текущей закрывающей скобке
                        errors.add(i);  //Если скобки не совпадают - добавляем индекс i в errors.
                    }
                }
            }
        }
        //Добавляем индексы незакрытых открывающих скобок
        if (!stack.isEmpty()) {
            int startIdx = input.length() - stack.size();
            for (int i = startIdx; i < input.length(); i++) {
                if (isOpenBracket(input.charAt(i))) {
                    errors.add(i);
                }
            }
        }
        return errors;
    }

    /**
     * Генерирует строку с исправленной скобочной последовательностью, если это возможно.
     * Например, для входа "{[}" метод может вернуть "{[]}".
     *
     * @param input строка, содержащая скобки
     * @return исправленная строка, если возможно, иначе пустая строка
     */
    //Если встречается открывающая скобка — добавляем в стек.
    //Если встречается закрывающая:
    //Если стек пуст — добавляем нужную открывающую перед ней.
    //Если последняя открытая скобка в стеке не соответствует — заменяем закрывающую.
    //В конце, если остались открывающие скобки — добавляем им закрывающие.

    //Исправляет ошибки в последовательности
    @Override
    public String fixBracketSequence(String input) {
        Deque<Character> stack = new ArrayDeque<>(); // используется для отслеживания открывающих скобок, ожидающих закрытия.
        List<Character> resultChars = new ArrayList<>();// список, в который поэтапно добавляются символы исправленной строки.

        for (char c : input.toCharArray()) {  //Преобразуем строку в массив символов и идем по каждому символу.
            if (isOpenBracket(c)) {
                stack.push(c);
                resultChars.add(c); //Добавляем в стек, ожидая соответствующую закрывающую.
            } else if (isCloserBracket(c)) {
                //Лишняя закрывающая скобка
                if (stack.isEmpty()) { //Если стек пуст, значит, закрывающая скобка не имеет пары.
                    resultChars.add(getOpeningBracket(c));//Добавляем недостающую открытую скобку перед c.
                    resultChars.add(c);
                } else {
                    //Проверяем соответствие верхней скобки в стеке
                    char top = stack.pop(); //Берем верхнюю скобку top из стека (не удаляем пока).
                    if (isChecking(top, c)) { //Если top и c совпадают, то: Удаляем top из стека и
                        resultChars.add(c); //Добавляем c в resultChars.
                    } else { //Неправильная закрывающая скобка
                        resultChars.add(getClosingBracket(top));
                    }

                }

            } else {
                resultChars.add(c);
            }
        }
        //Добавляем оставшиеся закрывающиеся скобки
        while (!stack.isEmpty()) { //Если в стеке остались - они не были закрыты.
            resultChars.add(getClosingBracket(stack.pop())); //Добавляем недостающие закрывающие скобки.
        }

        //Преобразуем resultChars в строку и возвращаем.
        String result = new String();
        for (Character ch : resultChars) {
            result += ch;
        }
        return result;
    }

    //Проверка открывающихся скобок
    private boolean isOpenBracket(char c) {
        return c == '(' || c == '[' || c == '{';
    }

    //Проверка на закрывающую скобку
    private boolean isCloserBracket(char c) {
        return c == ')' || c == ']' || c == '}';
    }

    //Проверка соответствия скобок
    private boolean isChecking(char open, char close) {
        return (open == '(' && close == ')' ||
                open == '[' && close == ']' ||
                open == '{' && close == '}');
    }

    //Получение закрывающей скобки по открывающей
    private char getClosingBracket(char open) {
        if (open == '(') {
            return ')';
        } else if (open == '[') {
            return ']';
        } else if (open == '{') {
            return '}';
        }
        return '\0'; //Заглушка
    }

    //Получение открывающей скобки по закрывающей
    private char getOpeningBracket(char close) {
        if (close == ')') {
            return '(';
        } else if (close == ']') {
            return '[';
        } else if (close == '}') {
            return '{';
        }
        return '\0'; //Заглушка
    }
}



