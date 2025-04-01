package Homework.lesson_35;

import java.io.File;
import java.io.IOException;

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
                System.out.println("Объект существует и является файлом.");
            } else if(file.isDirectory()) {
                System.out.println("Объект существует и является директорией.");
            }
        } else {
            System.out.println("Объект не существует");
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
            System.out.println("Размер файла: " + file.length() + "байт");
        } else {
            System.out.println("Файл не существует или это директория.");
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
        if (!file.exists()) {
            try {
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
        // TODO: Реализовать метод
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
        // TODO: Реализовать метод
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
        // TODO: Реализовать метод
    }
}