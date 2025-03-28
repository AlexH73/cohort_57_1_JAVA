package Lessons.Lesson_35.src.practice.classwork;

import java.io.*;

/**
 * Реализация задачи 1: Копирование текстового файла с добавлением номера строки.
 */
public class LineNumberingFileCopierImpl implements LineNumberingFileCopier {
    public static void main(String[] args) {
        String input = "src/Lessons/Lesson_35/src/teacher_code/file.txt";
        String output = "src/Lessons/Lesson_35/src/practice/classwork/newFile.txt";

        LineNumberingFileCopierImpl lnfc = new LineNumberingFileCopierImpl();

        try {
            lnfc.copyWithLineNumbers(input, output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Читает содержимое текстового файла, добавляет к каждой строке её порядковый номер
     * и записывает результат в новый файл.
     * <p>
     * Пример строки: "1. Привет, мир!"
     *
     * @param inputFilePath  путь к исходному файлу
     * @param outputFilePath путь к файлу, куда будет записан результат
     * @throws IOException если возникла ошибка при чтении или записи
     */
    @Override
    public void copyWithLineNumbers(String inputFilePath, String outputFilePath) throws IOException {
        // Шаг 1. Открыть FileReader и BufferedReader для чтения исходного файла
        // Шаг 2. Открыть FileWriter и BufferedWriter для записи в новый файл
        // Шаг 3. Создать счетчик строк и читать файл построчно
        // Шаг 4. Для каждой строки записывать в формате "номер. строка"
        // Шаг 5. Закрыть все потоки в блоке finally (или использовать try-with-resources)
        try (
                BufferedReader bfReader = new BufferedReader(new FileReader(inputFilePath));
                BufferedWriter bfWriter = new BufferedWriter(new FileWriter(outputFilePath))
        ) {
            int counter = 1;
            String line;

            while ((line = bfReader.readLine()) != null) {
                bfWriter.write(counter + ". " + line);
                bfWriter.newLine();
                counter++;
            }
        }
    }
}