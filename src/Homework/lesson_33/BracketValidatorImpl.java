package Homework.lesson_33;

import java.util.*;

public class BracketValidatorImpl implements BracketValidator {

    private static final Map<Character, Character> BRACKETS = Map.of(
            '(', ')',
            '[', ']',
            '{', '}'
    );

    @Override
    public boolean isValidBracketSequence(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            if (BRACKETS.containsKey(c)) { // Öffnende Klammer
                stack.push(c);
            } else if (BRACKETS.containsValue(c)) { // Schließende Klammer
                if (stack.isEmpty() || BRACKETS.get(stack.pop()) != c) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    @Override
    public List<Integer> getInvalidBracketIndexes(String input) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> invalidIndexes = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (BRACKETS.containsKey(c)) { // Öffnende Klammer
                stack.push(i);
            } else if (BRACKETS.containsValue(c)) { // Schließende Klammer
                if (stack.isEmpty() || BRACKETS.get(input.charAt(stack.pop())) != c) {
                    invalidIndexes.add(i);
                }
            }
        }
        invalidIndexes.addAll(stack); // Übrig gebliebene Indizes hinzufügen
        return invalidIndexes;
    }

    @Override
    public String fixBracketSequence(String input) {
        Stack<Character> stack = new Stack<>();
        StringBuilder fixedInput = new StringBuilder(input);
        for (int i = 0; i < fixedInput.length(); i++) {
            char c = fixedInput.charAt(i);
            if (BRACKETS.containsKey(c)) {
                stack.push(c);
            } else if (BRACKETS.containsValue(c)) {
                if (stack.isEmpty() || BRACKETS.get(stack.peek()) != c) {
                    fixedInput.insert(i, BRACKETS.get(stack.pop())); // Fehlende öffnen/ schließen
                    i++;
                } else {
                    stack.pop();
                }
            }
        }
        while (!stack.isEmpty()) {
            fixedInput.append(BRACKETS.get(stack.pop()));
        }
        return fixedInput.toString();
    }
}

