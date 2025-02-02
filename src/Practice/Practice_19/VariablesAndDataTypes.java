package Practice.Practice_19;

import java.util.Arrays;

public class VariablesAndDataTypes {
    /**
     * Задача 3: Переменные и типы данных
     * <p>
     * Напишите программу, которая объявляет и инициализирует переменные следующих типов:
     * <p>
     *     int<br>
     *     double<br>
     *     boolean<br>
     *     char<br>
     *     String
     * <p>
     * Выведите значения каждой переменной на консоль.
      */
    public static void main(String[] args) {
        // Инициализируем переменные.
        int intNumber = 10;                 // Целое число
        double fNamber = 25.65;             // Число с плавающей точкой
        boolean booleanValue = true;        // Логическое значение
        char singleCharacter = '§';         // Одиночный символ
        String string = "Java это круто";   // Ссылочный тип

        // Вывод объявленных переменных.
        System.out.println("int intNumber = " + intNumber);
        System.out.println("double fNamber = " + fNamber);
        System.out.println("boolean booleanValue = " + booleanValue);
        System.out.println("char singleCharacter = " + singleCharacter);
        System.out.println("String string = " + string);
    }
}
