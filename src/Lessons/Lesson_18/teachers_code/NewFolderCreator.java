package Lessons.Lesson_18.teachers_code;

import java.util.Scanner;

public class NewFolderCreator {
    public static void main(String[] args) {
        // input
        System.out.println("Hello! Enter your name:");

        Scanner myLocalReader = new Scanner(System.in);

        //позволяет считать все введенные данные от начала до конца строки:
        String name = myLocalReader.nextLine();
        System.out.printf("Hello, %s\nHow old are you?\n", name);

        // так как nextInt() оставит бегунок считывания сразу после числа, то нам
        // надо перенести его на начало новой строки, для этого можно разово вызвать:
        int age = myLocalReader.nextInt();
        myLocalReader.nextLine();

        // либо, воспользоваться альтернативой:
        // считать число,как текст и попытаться распарсить его в число

        // String strAge = myLocalReader.nextLine();
        // int age = Integer.parseInt(strAge);

        System.out.println("Have u already celebrate birthday this year? y/n");

        String answer = myLocalReader.nextLine();

        // логическое "и" - "and" Python, "&&" Java
        // логическое "или" - "or" Python, "||" Java
        // логическое "отрицание" - "not" Python, "!" Java


        // здесь ! используется так как нам надо отследить некорректный ввод,
        //  то есть не y/n

        while (!answer.equals("y") && !answer.equals("n")) {
            System.out.println("Enter please correct answer y or n");
            answer = myLocalReader.nextLine();
        }


        if (answer.equals("y") ) {
            System.out.printf("You've born in %d\n", (2025-age));
        } else {
            System.out.printf("You've born in %d\n", (2024-age));
        }
    }
}
