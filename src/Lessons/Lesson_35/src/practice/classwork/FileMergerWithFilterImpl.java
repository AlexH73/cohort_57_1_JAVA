package Lessons.Lesson_35.src.practice.classwork;

import java.io.*;
import java.util.List;

/**
 * Реализация задачи 2: Объединение текстовых файлов с фильтрацией строк.
 */
public class FileMergerWithFilterImpl implements FileMergerWithFilter {

    /**
     * Объединяет содержимое нескольких текстовых файлов в один, исключая строки, содержащие ключевое слово.
     *
     * @param inputFilePaths список путей к исходным файлам
     * @param outputFilePath путь к итоговому файлу
     * @param keyword        слово-фильтр: если строка содержит его, она исключается из записи
     * @throws IOException если возникла ошибка при чтении или записи файлов
     */
    @Override
    public void mergeFilesExcludingKeyword(List<String> inputFilePaths, String outputFilePath, String keyword)
            throws IOException {
        // Шаг 1. Создать BufferedWriter для выходного файла
        // Шаг 2. Для каждого пути из inputFilePaths:
        //    2.1. Открыть BufferedReader
        //    2.2. Читать строки по очереди
        //    2.3. Если строка НЕ содержит keyword, записать её в выходной файл
        //    2.4. Закрыть BufferedReader
        // Шаг 3. Закрыть BufferedWriter
    }
}