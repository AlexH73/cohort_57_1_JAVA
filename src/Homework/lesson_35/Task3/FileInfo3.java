package Homework.lesson_35.Task3;

import java.io.File;
import java.io.IOException;

/**
 * Задача 3: Создание файла, если он не существует.
 * <p>
 * Если файла не существует — создать его.
 * Если файл уже есть — ничего не делать.
 * <p>
 * Подсказки:
 * - Проверь `exists()`, затем вызови `createNewFile()`.
 * - Оберни в try-catch для обработки `IOException`.
 *
 * @param file файл, который нужно создать
 */
public class FileInfo3 {
    public void createFileIfNotExists(File file) {
        if (!file.exists()) {
            try {
                //Проверяем, существует ли родительская директория
                File parentDir = file.getParentFile();
                if (parentDir != null && !parentDir.exists()) {
                    if (parentDir.mkdirs()) {
                        System.out.println("Создана директория: " + parentDir.getAbsolutePath());
                    } else {
                        System.out.println("Не удалось создать директорию: " + parentDir.getAbsolutePath());
                        return;
                    }
                }
                //Создаём файл
                if (file.createNewFile()) {
                    System.out.println("Файл создан: " + file.getAbsolutePath());
                } else {
                    System.out.println("Не удалось создать файл.");
                }
            } catch (IOException e) {
                System.out.println("Ошибка при создании файла: " + e.getMessage());
            }
        } else {
            System.out.println("Файл уже существует: " + file.getAbsolutePath());
        }
    }

}
