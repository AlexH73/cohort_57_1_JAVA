package Homework.lesson_35.Task2;

import java.io.File;

/**
 * Задача 2: Получение абсолютного пути и размера файла.
 * <p>
 * Метод должен распечатать:
 * - абсолютный путь к файлу;
 * - размер файла в байтах.
 * <p>
 * Подсказки:
 * - Используй `getAbsolutePath()` и `length()`.
 *
 * @param file файл для анализа
 */
public class PrintInfo {
    public void printFilePathAndSize(File file) {
        if (file.exists() && file.isFile()) {
            System.out.println("Абсолютный путь: " + file.getAbsolutePath());
            System.out.println("Размер файла: " + file.length() + " байт");
        } else {
            System.out.println("Файл не существует или это директория.");
        }
    }
}
