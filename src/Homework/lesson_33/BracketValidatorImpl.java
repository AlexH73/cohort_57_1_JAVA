package Homework.lesson_33;

import java.util.Stack;


public class BracketValidatorImpl implements BracketValidator {
    @Override
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) return false;
                char lastOpen = stack.pop();
                if ((ch == ')' && lastOpen != '(') ||
                        (ch == ']' && lastOpen != '[') ||
                        (ch == '}' && lastOpen != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        BracketValidator validator = new BracketValidatorImpl();

        System.out.println(validator.isValid("([]{})"));
        System.out.println(validator.isValid("[(])"));
        System.out.println(validator.isValid("{[()]}"));
        System.out.println(validator.isValid("{[}"));
    }
}
