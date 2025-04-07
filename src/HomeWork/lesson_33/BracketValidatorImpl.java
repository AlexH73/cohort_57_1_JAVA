package Homework.lesson_33;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BracketValidatorImpl implements BracketValidator {
    private Map<String, String> bracketValidater = new HashMap<>();

    @Override
    public boolean isValidBracketSequence(String input) {
        return false;
    }

    @Override
    public List<Integer> getInvalidBracketIndexes(String input) {
        return List.of();
    }

    @Override
    public String fixBracketSequence(String input) {
        return "";
    }
}
