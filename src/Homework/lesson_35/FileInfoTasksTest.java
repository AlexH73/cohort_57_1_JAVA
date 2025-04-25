package Homework.lesson_35;

import java.io.File;
import java.io.IOException;

/**
 * Ручные тесты для класса FileInfoTasks.
 * Запускаются через main и выводят результат выполнения каждой задачи.
 */
public class FileInfoTasksTest {

    private static final FileInfoTasks fileInfoTasks = new FileInfoTasks();

    public static void main(String[] args) {
        testCheckFileType();
        testPrintFilePathAndSize();
        testCreateFileIfNotExists();
        testDeleteFileOrDirectory();
        testPrintDirectoryContents();
        testCreateDirectory();
    }

    public static void testCheckFileType() {

        File file = new File("src/Homework/lesson_35/FileInfoTasks.java");
        File dir = new File("src/Homework/lesson_35");

        System.out.println("==> checkFileType с файлом:");
        fileInfoTasks.checkFileType(file);
        System.out.println("==> checkFileType с директорией:");
        fileInfoTasks.checkFileType(dir);
    }

    public static void testPrintFilePathAndSize() {
        File file = new File("src/Homework/lesson_35/FileInfoTasks.java");
        System.out.println("==> printFilePathAndSize:");
        fileInfoTasks.printFilePathAndSize(file);
    }

    public static void testCreateFileIfNotExists() {
        File file = new File("src/Homework/lesson_35/test_created.txt");
        if (file.exists()) file.delete();

        fileInfoTasks.createFileIfNotExists(file);

        if (file.exists()) {
            System.out.println("[OK] createFileIfNotExists: Файл создан.");
        } else {
            System.out.println("[FAIL] createFileIfNotExists: Файл не был создан.");
        }
    }

    public static void testDeleteFileOrDirectory() {
        File file = new File("src/Homework/lesson_35/delete_me.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("[FAIL] deleteFileOrDirectory: Не удалось создать файл для теста.");
        }

        fileInfoTasks.deleteFileOrDirectory(file);

        if (!file.exists()) {
            System.out.println("[OK] deleteFileOrDirectory: Файл успешно удалён.");
        } else {
            System.out.println("[FAIL] deleteFileOrDirectory: Файл не был удалён.");
        }
    }

    public static void testPrintDirectoryContents() {
        File dir = new File("src/Homework/lesson_35");
        File notDir = new File("src/Homework/lesson_35/FileInfoTasks.java");

        System.out.println("==> printDirectoryContents с директорией:");
        fileInfoTasks.printDirectoryContents(dir);
        System.out.println("==> printDirectoryContents с файлом:");
        fileInfoTasks.printDirectoryContents(notDir);
    }

    public static void testCreateDirectory() {
        File newDir = new File("src/Homework/lesson_35/new_directory_test");
        if (newDir.exists()) newDir.delete();

        fileInfoTasks.createDirectory(newDir);

        if (newDir.exists() && newDir.isDirectory()) {
            System.out.println("[OK] createDirectory: Директория успешно создана.");
        } else {
            System.out.println("[FAIL] createDirectory: Директория не была создана.");
        }
    }
}