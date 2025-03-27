package Lessons.Lesson_35.src.practice.classwork;

/**
 * Интерфейс для задачи 1: Копирование текстового файла с добавлением номера строки.
 */
public interface LineNumberingFileCopier {

    /**
     * Читает содержимое текстового файла, добавляет к каждой строке её порядковый номер
     * и записывает результат в новый файл.
     * <p>
     * Пример строки: "1. Привет, мир!"
     *
     * @param inputFilePath  путь к исходному файлу
     * @param outputFilePath путь к файлу, куда будет записан результат
     * @throws java.io.IOException если возникла ошибка при чтении или записи
     *
     * <h3>Шаги реализации:</h3>
     * <ol>
     *     <li>Создать FileReader и BufferedReader для чтения исходного файла.</li>
     *     <li>Создать FileWriter и BufferedWriter для записи в целевой файл.</li>
     *     <li>Считать построчно, добавляя к каждой строке номер строки (начиная с 1).</li>
     *     <li>Записать новую строку в выходной файл.</li>
     *     <li>Закрыть все потоки в блоке finally или использовать try-with-resources.</li>
     * </ol>
     */
    void copyWithLineNumbers(String inputFilePath, String outputFilePath) throws Exception;
}