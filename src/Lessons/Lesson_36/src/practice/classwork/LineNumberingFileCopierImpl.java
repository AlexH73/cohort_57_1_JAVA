package Lessons.Lesson_36.src.practice.classwork;

import Lessons.Lesson_35.src.practice.classwork.LineNumberingFileCopier;

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
        File readFile = new File(inputFilePath);
        File writFile = new File(outputFilePath);

        if (!writFile.exists()) {
            writFile.createNewFile();
        }

        FileReader reader = new FileReader(readFile);
        FileWriter writer = new FileWriter(writFile);

        BufferedReader bfReader = new BufferedReader(reader);
        BufferedWriter bfWriter = new BufferedWriter(writer);

        try {
            int counter = 1;
            String line = bfReader.readLine();

            while (line != null) {
                String string = counter + ". " + line + "\n";
                bfWriter.write(string);

                counter++;

                line = bfReader.readLine();
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            bfReader.close();
            bfWriter.close();
        }
    }
}