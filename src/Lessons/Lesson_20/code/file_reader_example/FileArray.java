package Lessons.Lesson_20.code.file_reader_example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileArray {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("src/Lessons/Lesson_20/code/file_reader_example/file_1.txt");

        if (file1.exists()) {
            System.out.println("файл существует!");
        } else {
            System.out.println("файл не существует!");
        }

        // таким образом будем чиать из файла:
        Scanner scanner = new Scanner(file1);

        String fileContent = scanner.nextLine();

        System.out.println("fileContent = " + fileContent);
    }
}
