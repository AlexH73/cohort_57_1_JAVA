package Lessons.Lesson_20.code.file_reader_example;

import java.io.File;
import java.util.Scanner;

public class FileArray {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        File file1 = new File("src/Lessons/Lesson_20/code/file_reader_example/file_1.txt");

        if (file1.exists()) {
            System.out.println("файл существует!");
        } else {
            System.out.println("файл не существует!");
        }
    }
}
