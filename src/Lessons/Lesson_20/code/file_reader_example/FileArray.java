package Lessons.Lesson_20.code.file_reader_example;

import java.io.File;
import java.util.Scanner;

public class FileArray {
        File file1 = new File("src/Lessons/Lesson_20/code/file_reader_example/file_1.txt");

        if (file1.exists()) {
            System.out.println("файл существует!");
        } else {
            System.out.println("файл не существует!");
        }
    }

    public static void scannerArray() {
        Scanner[] scanners = new Scanner[3]; // {null, null, null}





    }
}
