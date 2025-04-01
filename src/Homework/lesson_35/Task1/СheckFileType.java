package Homework.lesson_35.Task1;

import java.io.File;

/**
 * Задача 1: Проверка существования файла и его типа.
 * <p>
 * Метод должен напечатать, существует ли файл по указанному пути,
 * а также вывести информацию: является ли он файлом или директорией.
 * <p>
 * Подсказки:
 * - Используй методы `exists()`, `isFile()`, `isDirectory()`.
 * - Для вывода можно использовать `System.out.println()`.
 *
 * @param file файл или директория для проверки
 */

public class СheckFileType {
    public void checkFileType(File file) {
        if (file.exists()) {
            if (file.isFile()) {
                System.out.println("Объект существует и является файлом.");
            } else if (file.isDirectory()) {
                System.out.println("Объект существует и является директорией.");
            }
        } else {
            System.out.println("Объект не существует");
        }

    }

}
