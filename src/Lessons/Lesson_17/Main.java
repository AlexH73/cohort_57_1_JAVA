package Lessons.Lesson_17;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // sout

        System.out.println("hello");

        // "var" вместо конкретного типа данных используется только в последних версиях джавы
        var x = "sdfsd";

        // x = 10; - так сделать нельзя, так как в джава мы не можем менять тип данных в переменной

        // примитивные типы данных:
        byte a = 11;    // -128 to 127                      8bit    01010101
        short b = 12;   // -32000 to 32000                  16bit     0101010101010101
        int c = 13;     // -2_147_000_000 to +2_147_000_000 32bit  (default)
        long d = 14L;   //                                  64bit

        double e = 23.234; // (default)     64 bit
        float f = 234.345F; //              32 bit

        boolean g = true; // false          32bit  (1bit зависит от провайдера)

        // char - псевдочисленная переменная
        char h1 = 'F';
        char h2 = 77;

        System.out.println("h2 = " + h2);
        int intFromChar = h1;

        System.out.println(intFromChar);

        System.out.println("double = " + (1.0 / 3));
        System.out.println("float  = " + (1.0F / 3));

        String str = " Just text ";

        System.out.printf("*%s*\n", str.strip());
        System.out.printf("*%s*\n", str.toUpperCase());
        System.out.printf("*%s*\n", str.toLowerCase());

        str = str.strip();

        System.out.printf("*%s*\n", str);

        System.out.println("str.length() = " + str.length());

        System.out.println("str.replace(\"text\", \"aaa\") = " + str.replace("text", "aaa"));

        System.out.println("str.startsWith(\"Ju\") = " + str.startsWith("Ju"));
        System.out.println("str.endsWith(\"text\") = " + str.endsWith("text"));
        System.out.println("str.endsWith(\"te\") = " + str.endsWith("te"));
        System.out.println("str.contains(\"te\") = " + str.contains("te"));
        String str2 = "one;two;three";

        System.out.println("str2 = " + str2);
        System.out.println("str2.split(\",\") = " + Arrays.toString(str2.split(";"))); // ["one", "two", "three"]
        System.out.println("String.join(\";\", \"apple\", \"banana\", \"peach\") = " + String.join(";", "apple", "banana", "peach"));


        // получение срезов (подстрок)
        System.out.println("str.substring(4) = " + str.substring(4));
        System.out.println("str.substring(0,4) = " + str.substring(0, 4));


        // для массивов допустимо обратить по индексу к элементу
        String[] strings = {"one", "two", "three"};
        System.out.println("strings[1] = " + strings[1]);

        // для строк - не допустимо обратиться к символу по индексу:
        // str[1] - недопустимая операция, используй:
        str.charAt(1);

        // проверка строки на пустоту
        String emptyString = "";
        String blankString = "       ";

        // метод isEmpty() - вернет true, если в строке 0 символов
        System.out.println("emptyString.isEmpty() = " + emptyString.isEmpty());
        // метод isBlank() - вернет true, если в строке нет других символов, кроме пробелов или переноса строки "\n", "\t" и тд
        System.out.println("emptyString.isBlank() = " + emptyString.isBlank());

        System.out.println("blankString.isEmpty() = " + blankString.isEmpty());
        System.out.println("blankString.isBlank() = " + blankString.isBlank());
    }

}