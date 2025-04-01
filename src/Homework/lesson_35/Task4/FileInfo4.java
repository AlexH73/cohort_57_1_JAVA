package Homework.lesson_35.Task4;

import java.io.File;

/**
 * Задача 4: Удаление файла или директории.
 *
 * Удалить переданный файл или директорию.
 *
 * Подсказки:
 * - Используй метод `delete()`.
 * - Если удаляется директория, убедись, что она пустая.
 *
 * @param file файл или директория для удаления
 */
public class FileInfo4 {
    public void deleteFileOrDirectory(File file) {
        if (file == null || !file.exists()) {
            System.out.println("Файл или директория не существует.");
            return;
        }

        if (file.isDirectory()) {
            File[] contents = file.listFiles();
            if (contents != null && contents.length > 0) {
                System.out.println("Директория не пуста: " + file.getAbsolutePath());
                return;
            }
        }

        if (file.delete()) {
            System.out.println("Удалено: " + file.getAbsolutePath());
        } else {
            System.out.println("Не удалось удалить: " + file.getAbsolutePath());
        }

    }
}
