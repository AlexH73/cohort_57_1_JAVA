package Homework.lesson_35.Task1;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        СheckFileType сhecker = new СheckFileType();

        //Проверяем файл
        File file1 = new File("src\\Lessons\\Lesson_35\\resources\\file1.txt");  //путь к существующему файлу
        System.out.println("file1.exists() = " + file1.exists());
        System.out.println("file1.isFile() = " + file1.isFile());
        System.out.println("file1.isDirectory() = " + file1.isDirectory());
        сhecker.checkFileType(file1);

        //Проверяем директорию
        File file2 = new File("src\\Lessons\\Lesson_35"); //путь к существующей папке
        System.out.println("\nfile2.exists() = " + file2.exists());
        System.out.println("file2.isFile() = " + file2.isFile());
        System.out.println("file2.isDirectory() = " + file2.isDirectory());
        сhecker.checkFileType(file2);


        //Проверяем несуществующий объект
        File file3 = new File("non_existent_file.txt");
        System.out.println("\nfile3.exists() = " + file3.exists());
        System.out.println("file3.isFile() = " + file3.isFile());
        System.out.println("file3.isDirectory() = " + file3.isDirectory());
        сhecker.checkFileType(file3);

    }
}
