package Homerwork.Practica34;

import Lessons.Lesson_34.code.teacher_code.NegativeNumberException;

public class CreateExceptionExample {
    public static void main(String[] args) throws NegativeNumberException{
        System.out.println(checkPositiveNumber(4));
        System.out.println(checkPositiveNumber(423));
        System.out.println(checkPositiveNumber(-4));
    }

    public static boolean checkPositiveNumber(double number) throws NegativeNumberException {
        if (number >= 0) {
            return true;
        }
        throw new NegativeNumberException("Число не может быть отрицательным!");
    }

}
