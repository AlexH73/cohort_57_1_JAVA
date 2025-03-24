package Homework.lesson_33.Variant;

import java.util.*;

public class BracketValidatorImpl implements BracketValidator {
    private static final Map<Character, Character> bracketPairs = Map.of(
            ')', '(',
            ']', '[',
            '}', '{'
    );

    @Override
    public boolean isValidBracketSequence(String input) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char ch : input.toCharArray()) {
            if (bracketPairs.containsValue(ch)) {  // Открывающая скобка
                stack.push(ch);
            } else if (bracketPairs.containsKey(ch)) {  // Закрывающая скобка
                if (stack.isEmpty() || stack.pop() != bracketPairs.get(ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    @Override
    public List<Integer> getInvalidBracketIndexes(String input) {
        Deque<Integer> stack = new ArrayDeque<>();
        List<Integer> invalidIndexes = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (bracketPairs.containsValue(ch)) {
                stack.push(i);
            } else if (bracketPairs.containsKey(ch)) {
                if (stack.isEmpty() || input.charAt(stack.peek()) != bracketPairs.get(ch)) {
                    invalidIndexes.add(i);
                } else {
                    stack.pop();
                }
            }
        }

        while (!stack.isEmpty()) {
            invalidIndexes.add(stack.pop());
        }
        Collections.sort(invalidIndexes);
        return invalidIndexes;
    }

    @Override
    public String fixBracketSequence(String input) {
        Deque<Integer> stack = new ArrayDeque<>();
        StringBuilder result = new StringBuilder(input);

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (bracketPairs.containsValue(ch)) {
                stack.push(i);
            } else if (bracketPairs.containsKey(ch)) {
                if (stack.isEmpty() || input.charAt(stack.peek()) != bracketPairs.get(ch)) {
                    result.setCharAt(i, ' ');  // Удаляем ошибочную скобку
                } else {
                    stack.pop();
                }
            }
        }

        while (!stack.isEmpty()) {
            result.setCharAt(stack.pop(), ' ');
        }

        return result.toString().replaceAll(" ", "");
    }

    @Override
    public String toString() {
        return "BracketValidatorImpl{}";
    }
}


