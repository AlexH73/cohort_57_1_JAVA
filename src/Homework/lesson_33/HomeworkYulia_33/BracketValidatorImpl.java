package Homework.lesson_33.HomeworkYulia_33;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Stack;
import java.util.HashMap;
import java.util.Arrays;

public class BracketValidatorImpl implements BracketValidator {
    private static Map<String, String> brackets;

    static {
        brackets = new HashMap<>();
        brackets.put(")", "(");
        brackets.put("]", "[");
        brackets.put("}", "{");
    }

    @Override
    public boolean isValidBracketSequence(String input) {
        Stack<String> stack = new Stack<>();
        List<String> symbols = Arrays.asList(input.split(""));

        for (String sb : symbols) {
            if (brackets.containsValue(sb)) {
                stack.push(sb);
            } else if (brackets.containsKey(sb)) {
                if (stack.isEmpty() || !stack.pop().equals(brackets.get(sb))) {
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
        List<String> symbols = Arrays.asList(input.split(""));

        for (int i = 0; i < symbols.size(); i++) {
            String sb = symbols.get(i);
            if (brackets.containsValue(sb)) {
                stack.push(i);
            } else if (brackets.containsKey(sb)) {
                if (stack.isEmpty() || !symbols.get(stack.peek()).equals(brackets.get(sb))) {
                    invalidIndexes.add(i);
                } else {
                    stack.pop();
                }
            }
        }
        invalidIndexes.addAll(stack);
        return invalidIndexes;
    }

    @Override
    public String fixBracketSequence(String input) {
        List<String> result = new ArrayList<>(Arrays.asList(input.split("")));
        Stack<Integer> stack = new Stack<>();
        List<String> symbols = Arrays.asList(input.split(""));

        for (int i = 0; i < symbols.size(); i++) {
            String sb = symbols.get(i);
            if (brackets.containsValue(sb)) {
                stack.push(i);
            } else if (brackets.containsKey(sb)) {
                if (stack.isEmpty() || !symbols.get(stack.peek()).equals(brackets.get(sb))) {
                    result.add(i, brackets.get(sb));
                    i++;
                } else {
                    stack.pop();
                }
            }
        }
        while (!stack.isEmpty()) {
            result.add(getClosingBracket(symbols.get(stack.pop())));
        }
        return String.join("", result);
    }

    private String getClosingBracket(String openBracket) {
        switch (openBracket) {
            case "(":
                return ")";
            case "[":
                return "]";
            case "{":
                return "}";
            default:
                return "";
        }
    }
}
