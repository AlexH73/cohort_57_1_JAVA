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

    public static void scannerArray() throws FileNotFoundException {
        String basePath = "src/Lessons/Lesson_20/code/file_reader_example/file_";

        Scanner[] scanners = new Scanner[3]; // {null, null, null}


        scanners[0] = new Scanner(new File(basePath+ "1.txt"));
        scanners[1] = new Scanner(new File(basePath+ "2.txt"));
        scanners[2] = new Scanner(new File(basePath+ "3.txt"));


        String contentScanner2 = scanners[2].nextLine();
        System.out.println("scanners[2].nextLine() = " + contentScanner2);


    }

    public static void scannerArray() throws FileNotFoundException {
        String basePath = "src/Lessons/Lesson_20/code/file_reader_example/file_";

        Scanner[] scanners = new Scanner[3]; // {null, null, null}


        scanners[0] = new Scanner(new File(basePath+ "1.txt"));
        scanners[1] = new Scanner(new File(basePath+ "2.txt"));
        scanners[2] = new Scanner(new File(basePath+ "3.txt"));


        String contentScanner2 = scanners[2].nextLine();
        System.out.println("scanners[2].nextLine() = " + contentScanner2);


    }
}
