package Homework.lesson_35.Task4;

import java.io.File;

public class DeleteFileOrDirectoryTest {
    public static void main(String[] args) {
        FileInfo4 deleter = new FileInfo4();
        File file = new File("src\\Homework\\lesson_35\\Task3\\testfile.txt");
        deleter.deleteFileOrDirectory(file);
    }
}
