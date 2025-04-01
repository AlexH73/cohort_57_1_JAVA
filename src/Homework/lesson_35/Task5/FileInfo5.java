package Homework.lesson_35.Task5;

import java.io.File;

/**
 * Задача 5: Печать содержимого директории.
 * <p>
 * Если передан файл — сообщить, что это не директория.
 * Если передана директория — распечатать список всех файлов и папок внутри неё.
 * <p>
 * Подсказки:
 * - Используй `isDirectory()` и `listFiles()`.
 * - Проверь `null` и пустую директорию.
 *
 * @param dir директория для анализа
 */
public class FileInfo5 {
    public void printDirectoryContents(File dir) {
        if (dir == null || !dir.exists()) {
            System.out.println("Указанный путь не существует.");
            return;
        }

        if (!dir.isDirectory()) {
            System.out.println("Это не директория: " + dir.getAbsolutePath());
            return;
        }

        File[] contents = dir.listFiles();
        if (contents == null || contents.length == 0) {
            System.out.println("Директория пуста: " + dir.getAbsolutePath());
            return;
        }

        System.out.println("Содержимое директории: " + dir.getAbsolutePath());
        for (File file : contents) {
            System.out.println((file.isDirectory() ? "[DIR]" : "[FILE]") + file.getName());
        }

    }

}
