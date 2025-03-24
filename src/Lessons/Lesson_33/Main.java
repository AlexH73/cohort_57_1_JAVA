package Lessons.Lesson_33;

import Homework.lesson_33.Variant.BracketValidator;
import Homework.lesson_33.Variant.BracketValidatorImpl;

/**
 * Примеры тестовых данных:
 * - Вход: "( [ ] { } )" → Выход: true
 * - Вход: "[(])" → Выход: false
 * - Вход: "{[( )]}" → Выход: true
 * - Вход: "{[}" → Выход: false
 */
public class Main {
    public static void main(String[] args) {
        BracketValidator validator = new BracketValidatorImpl();

        System.out.println(validator.isValidBracketSequence("( [ ] { } )"));    //true
        System.out.println(validator.isValidBracketSequence("[(])"));          //false
        System.out.println(validator.getInvalidBracketIndexes("{[( )]}"));    //[]
        System.out.println(validator.fixBracketSequence("{[}"));

    }
}
