package Lessons.Lesson_20.code.file_reader_example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileArray {
    public static void main(String[] args) {
        File file1 = new File("src/Lessons/Lesson_20/code/file_reader_example/file_1.txt");

        if (file1.exists()) {
            System.out.println("Файл існує!");
        } else {
            System.out.println("Файл не існує!");
            return; // Вихід із програми, якщо файл не знайдено
        }

        try (Scanner scanner = new Scanner(file1)) { // Автоматичне закриття Scanner
            if (scanner.hasNextLine()) {
                String fileContent = scanner.nextLine();
                System.out.println("fileContent = " + fileContent);
            } else {
                System.out.println("Файл порожній.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Помилка читання файлу: " + e.getMessage());
        }

        try {
            MethodScannerArrayV2();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не знайдено: " + e.getMessage());
        }
    }

    public static void MethodScannerArrayV2() throws FileNotFoundException {
        String basePath = "src/Lessons/Lesson_20/code/file_reader_example/file_";

        Scanner[] scanners = new Scanner[3];

        try {
            scanners[0] = new Scanner(new File(basePath + "1.txt"));
            scanners[1] = new Scanner(new File(basePath + "2.txt"));
            scanners[2] = new Scanner(new File(basePath + "3.txt"));

            if (scanners[2].hasNextLine()) {
                String contentScanner2 = scanners[2].nextLine();
                System.out.println("scanners[2].nextLine() = " + contentScanner2);
            } else {
                System.out.println("Файл 3.txt порожній.");
            }
        } finally {
            for (Scanner scanner : scanners) {
                if (scanner != null) {
                    scanner.close(); // Закриваємо всі Scanner
                }
            }
        }
    }
}
