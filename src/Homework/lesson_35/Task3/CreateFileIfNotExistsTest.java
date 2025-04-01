package Homework.lesson_35.Task3;

import java.io.File;


public class CreateFileIfNotExistsTest {
    public static void main(String[] args) {
        FileInfo3 fileCreator = new FileInfo3(); // Создаём объект класса

        // Указываем путь к файлу
        File file = new File("src\\Homework\\lesson_35\\Task3\\testfile1.txt");

        // Создаём файл
        fileCreator.createFileIfNotExists(file);
    }
}
