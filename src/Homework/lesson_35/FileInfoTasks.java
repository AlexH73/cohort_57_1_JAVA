package Homework.lesson_35;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * Класс с задачами на закрепление методов класса {@link File}.
 * Студенты должны реализовать указанные методы, следуя описанию и подсказкам.
 */
public class FileInfoTasks {

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
    public void checkFileType(File file) {
        if (file.exists() && file.isFile()) {
            System.out.println(file + " - Является файлом");
        } else if (file.exists() && file.isDirectory()) {
            System.out.println(file + " - Является директорией");
        } else {
            System.err.println("Путь " + file + " не существует или недоступен.");
        }
    }

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
    public void printFilePathAndSize(File file) {
        System.out.println("Абсолютный путь к файлу: " + file.getAbsolutePath());
        System.out.println("Размер файла в байтах: " + file.length());
    }

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
    public void createFileIfNotExists(File file) {
        try {
            if (file.exists()) {
                System.out.println("Файл " + file + " уже существует.");
            } else if (!file.exists()) {
                file.createNewFile();
                System.out.println("Файл " + file + " создан");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Задача 4: Удаление файла или директории.
     * <p>
     * Удалить переданный файл или директорию.
     * <p>
     * Подсказки:
     * - Используй метод `delete()`.
     * - Если удаляется директория, убедись, что она пустая.
     *
     * @param file файл или директория для удаления
     */
    public void deleteFileOrDirectory(File file) {
        if (file.isFile()) {
            if (file.delete()) {
                System.out.println("Файл " + file + " успешно удален.");
            } else {
                System.out.println("Не удалось удалить файл " + file);
            }
        } else if (file.isDirectory()) {
            if (file.list().length == 0) {
                if (file.delete()) {
                    System.out.println("Директория " + file + " успешно удалена");
                } else {
                    System.out.println("Не удалось удалить директорию " + file);
                }
            } else {
                System.out.println("Директория " + file + " не пуста.");
            }
        }
    }

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
    public void printDirectoryContents(File dir) {
        if (dir.isFile()) {
            System.out.println(dir + " — это файл, а не директория.");
        } else if (dir.isDirectory()) {
            String[] contents = dir.list();
            if (contents == null) {
                System.out.println("Ошибка доступа к директории " + dir);
            } else if (contents.length == 0) {
                System.out.println("Директория " + dir + " пуста.");
            } else {
                System.out.println("Содержимое директории " + dir + ": " + Arrays.toString(contents));
            }
        }
    }

    /**
     * Задача 6: Создание новой директории.
     * <p>
     * Метод должен создать новую директорию по указанному пути.
     * Если она уже существует — ничего не делать.
     * <p>
     * Подсказки:
     * - Используй `mkdir()`.
     *
     * @param dir директория для создания
     */
    public void createDirectory(File dir) {
        if (!dir.exists()) {
            if (dir.mkdirs()) {
                System.out.println("Директория " + dir + " успешно создана.");
            } else {
                System.out.println("Не удалось создать директорию " + dir);
            }
        }
    }
}