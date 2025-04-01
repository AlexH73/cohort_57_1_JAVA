package Lessons.Lesson_35.src.practice.classwork;

import java.io.*;
import java.util.List;
import java.util.zip.*;

/**
 * Реализация задачи 3: Создание и распаковка ZIP архива.
 */
public class ZipFileHandlerImpl implements ZipFileHandler {

    /**
     * Создаёт ZIP-архив из списка файлов.
     *
     * @param filePaths     список путей к файлам, которые нужно заархивировать
     * @param zipOutputPath путь к создаваемому ZIP-файлу
     * @throws IOException если возникла ошибка при создании архива
     */
    @Override
    public void createZipArchive(List<String> filePaths, String zipOutputPath) throws IOException {
        // Шаг 1. Создать FileOutputStream и ZipOutputStream для zipOutputPath
        // Шаг 2. Для каждого файла из filePaths:
        //    2.1. Создать FileInputStream
        //    2.2. Создать ZipEntry и добавить его через putNextEntry
        //    2.3. Скопировать содержимое файла в ZipOutputStream
        //    2.4. Закрыть текущий ZipEntry и FileInputStream
        // Шаг 3. Закрыть ZipOutputStream
    }

    /**
     * Распаковывает содержимое ZIP архива в указанную директорию.
     *
     * @param zipInputPath  путь к ZIP-файлу
     * @param extractToPath путь к директории, куда будет производиться извлечение файлов
     * @throws IOException если возникла ошибка при распаковке архива
     */
    @Override
    public void extractZipArchive(String zipInputPath, String extractToPath) throws IOException {
        // Шаг 1. Создать FileInputStream и ZipInputStream для zipInputPath
        // Шаг 2. В цикле читать ZipEntry:
        //    2.1. Для каждого ZipEntry создать файл в папке extractToPath
        //    2.2. Открыть FileOutputStream и скопировать содержимое из ZipInputStream
        //    2.3. Закрыть FileOutputStream
        // Шаг 3. Закрыть ZipInputStream
    }
}