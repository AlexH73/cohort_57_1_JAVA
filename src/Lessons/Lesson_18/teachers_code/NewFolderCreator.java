package Lessons.Lesson_18.teachers_code;

import java.util.Scanner;

public class NewFolderCreator {
    public static void main(String[] args) {
        // input
        System.out.println("Hello! Enter your name:");

        Scanner myLocalReader = new Scanner(System.in);

        //позволяет считать все введенные данные от начала до конца строки:
        String name = myLocalReader.nextLine();
        System.out.printf("Hello, %s\n How old are you?", name);

        int age = myLocalReader.nextInt();

        System.out.println("Have u already celebrate birthday this year? y/n");

        String answer = myLocalReader.nextLine();

        // логическое "и" - "and" Python, "&&" Java
        // логическое "или" - "or" Python, "||" Java
        // логическое "отрицание" - "not" Python, "!" Java

        if (answer == "y" || answer == "n") {

        }


        System.out.printf("You've born in %d\n", (2025-age));

    }
}
