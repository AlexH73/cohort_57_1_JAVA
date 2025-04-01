package Homework.lesson_35.Task5;

import java.io.File;

public class PrintDirectoryContentsTest {
    public static void main(String[] args) {
        FileInfo5 printer = new FileInfo5();
        File dir = new File("src\\Homework\\lesson_35\\Task3");
        printer.printDirectoryContents(dir);
    }
}
