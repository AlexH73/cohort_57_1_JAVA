package Homework.lesson_35.Task6;

import java.io.File;

public class CreateDirectoryTest {
    public static void main(String[] args) {
        FileInfo6 creator = new FileInfo6();
        File dir = new File("src\\Homework\\lesson_35\\Task6");
        creator.createDirectory(dir);
    }
}
