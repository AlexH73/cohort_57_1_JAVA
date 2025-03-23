package Homework.lesson_33.HomeworkYulia_33;

public class Main {
    public static void main(String[] args) {

        BracketValidator validator = new BracketValidatorImpl();

        System.out.println(validator.isValidBracketSequence("{[()]}")); // true
        System.out.println(validator.isValidBracketSequence("{[(])}")); // false
        System.out.println(validator.getInvalidBracketIndexes("{[}]")); // [2]
        System.out.println(validator.fixBracketSequence("{[}]")); // "{[]}
    }
}
