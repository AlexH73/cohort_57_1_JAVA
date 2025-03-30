package Homework.lesson_35;

import java.io.File;

/**
 * Класс с задачами на закрепление методов класса {@link File}.
 * Студенты должны реализовать указанные методы, следуя описанию и подсказкам.
 */
public class FileInfoTasks {

    /**
     * Задача 1: Проверка существования файла и его типа.
     *
     * Метод должен напечатать, существует ли файл по указанному пути,
     * а также вывести информацию: является ли он файлом или директорией.
     *
     * Подсказки:
     * - Используй методы `exists()`, `isFile()`, `isDirectory()`.
     * - Для вывода можно использовать `System.out.println()`.
     *
     * @param file файл или директория для проверки
     */
    public void checkFileType(File file) {
        if (file.exists()) {
            if (file.isFile()) {
                System.out.println(file + " - это файл.");
            } else if (file.isDirectory()) {
                System.out.println(file + " - это директория.");
            }
        } else {
            System.out.println("Файл или директория не существует: " + file);
        }
    }


    /**
     * Задача 2: Получение абсолютного пути и размера файла.
     *
     * Метод должен распечатать:
     * - абсолютный путь к файлу;
     * - размер файла в байтах.
     *
     * Подсказки:
     * - Используй `getAbsolutePath()` и `length()`.
     *
     * @param file файл для анализа
     */
    public void printFilePathAndSize(File file) {
        if (file.exists() && file.isFile()) {
            System.out.println("Абсолютный путь: " + file.getAbsolutePath());
            System.out.println("Размер файла: " + file.length() + " байт");
        } else {
            System.out.println("Файл не существует или не является файлом: " + file);
        }
    }

/**
     * Задача 3: Создание файла, если он не существует.
     *
     * Если файла не существует — создать его.
     * Если файл уже есть — ничего не делать.
     *
     * Подсказки:
     * - Проверь `exists()`, затем вызови `createNewFile()`.
     * - Оберни в try-catch для обработки `IOException`.
     *
     * @param file файл, который нужно создать
     */
    public void createFileIfNotExists(File file) {
        if (file.exists()) {
            if (file.isFile()) {
                System.out.println(file + " - это файл.");
            } else if (file.isDirectory()) {
                System.out.println(file + " - это директория.");
            }
        } else {
            System.out.println("Файл или директория не существует: " + file);
        }
    }

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
    public void deleteFileOrDirectory(File file) {
        if (file.exists()) {
            if (file.isDirectory() && file.list().length > 0) {
                System.out.println("Невозможно удалить директорию, так как она не пуста: " + file);
            } else if (file.delete()) {
                System.out.println("Удалено: " + file);
            } else {
                System.out.println("Не удалось удалить: " + file);
            }
        } else {
            System.out.println("Файл или директория не существует: " + file);
        }
    }

    /**
     * Задача 5: Печать содержимого директории.
     *
     * Если передан файл — сообщить, что это не директория.
     * Если передана директория — распечатать список всех файлов и папок внутри неё.
     *
     * Подсказки:
     * - Используй `isDirectory()` и `listFiles()`.
     * - Проверь `null` и пустую директорию.
     *
     * @param dir директория для анализа
     */
    public void printDirectoryContents(File dir) {
        if (!dir.exists()) {
            System.out.println("Директория не существует: " + dir);
            return;
        }
        if (!dir.isDirectory()) {
            System.out.println("Это не директория: " + dir);
            return;
        }
        File[] files = dir.listFiles();
        if (files == null || files.length == 0) {
            System.out.println("Директория пуста: " + dir);
            return;
        }
        System.out.println("Содержимое директории " + dir + ":");
        for (File file : files) {
            System.out.println("- " + file.getName());
        }
    }

    /**
     * Задача 6: Создание новой директории.
     *
     * Метод должен создать новую директорию по указанному пути.
     * Если она уже существует — ничего не делать.
     *
     * Подсказки:
     * - Используй `mkdir()`.
     *
     * @param dir директория для создания
     */
    public void createDirectory(File dir) {
        if (!dir.exists()) {
            if (dir.mkdir()) {
                System.out.println("Директория создана: " + dir);
            } else {
                System.out.println("Не удалось создать директорию: " + dir);
            }
        } else {
            System.out.println("Директория уже существует: " + dir);
        }
    }
}
