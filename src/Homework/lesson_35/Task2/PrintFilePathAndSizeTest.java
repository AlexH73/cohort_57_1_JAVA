package Homework.lesson_35.Task2;

import java.io.File;

public class PrintFilePathAndSizeTest {
    public static void main(String[] args) {
        PrintInfo fileInfo = new PrintInfo();

        //Проверяем существующий файл
        File file1 = new File("src\\Lessons\\Lesson_35\\resources\\file1.txt"); //путь к существующему файлу
        fileInfo.printFilePathAndSize(file1);

        //Проверяем несуществующий файл
        File file2 = new File("src\\Lessons\\Lesson_35\\resources\\file7.txt");
        fileInfo.printFilePathAndSize(file2);

        //Проверяем директорию
        File file3 = new File("src\\Lessons\\Lesson_35\\resources"); //путь к существующей папке
        fileInfo.printFilePathAndSize(file3);
    }
}
