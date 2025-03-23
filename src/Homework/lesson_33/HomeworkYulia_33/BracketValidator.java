package Homework.lesson_33.HomeworkYulia_33;

import java.util.List;

public interface BracketValidator {

    boolean isValidBracketSequence(String input);

    List<Integer> getInvalidBracketIndexes(String input);

    String fixBracketSequence(String input);
}
