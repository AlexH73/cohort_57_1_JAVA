package Lessons.Lesson_36.src.practice.classwork;

import Lessons.Lesson_35.src.practice.classwork.FileMergerWithFilter;

import java.io.*;
import java.util.List;

/**
 * Реализация задачи 2: Объединение текстовых файлов с фильтрацией строк.
 */
public class FileMergerWithFilterImpl implements FileMergerWithFilter {
    public static void main(String[] args) {
        List<String> paths = List.of("src/Lessons/Lesson_36/src/practice/classwork/files/file1.txt",
                "src/Lessons/Lesson_36/src/practice/classwork/files/file2.txt");
        String outPath = "src/Lessons/Lesson_36/src/practice/classwork/out.txt";
        String keyWord = "файл";

        FileMergerWithFilterImpl fmwfi = new FileMergerWithFilterImpl();

        try {
            fmwfi.mergeFilesExcludingKeyword(paths, outPath, keyWord);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

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
        File writFile = new File(outputFilePath);
        writFile.createNewFile();


        // в качестве аргумента при создании FileWriter(outputFilePath, true) добавлен "true" - эта опция позволяет
        // дозаписывать текст в файл, а не записывать каждый раз с нуля, удаляя старый текст.
        try (BufferedWriter bfWriter = new BufferedWriter(new FileWriter(outputFilePath, true))) {

            for (String path : inputFilePaths) {

                // данная конструкция нужна тк у нас список файлов и мы создаем много BufferedReader
                // каждый раз открывая новое соединение и тратя ресурсы
                try (BufferedReader bfReader = new BufferedReader(new FileReader(path))) {
                    // считывает из файла текст до переноса строки
                    String line = bfReader.readLine();
                    while (line != null) {
                        if (!line.contains(keyword)) {
                            bfWriter.write(line + "\n");

                            // метод flush() - записывает то, что было в буфере в файл, если его не использовать,
                            // то информация будет записана, только когда будем закрывать BufferedWriter, то есть
                            // при операции bfWriter.close(). Это не правильно, тк буфер может переполниться и
                            // мы потеряем данные
                            bfWriter.flush();
                        }

                        line = bfReader.readLine();
                    }
                }
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}