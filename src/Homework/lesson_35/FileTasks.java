package Homework.lesson_35;

import java.io.*;

/**
 * Класс с задачами на работу с файлами. Реализация методов пока отсутствует.
 * Студенты должны реализовать указанные методы, следуя описанию и подсказкам.
 */
public class FileTasks {

    /**
     * Задача 1: Копирование текстового файла с добавлением номера строки.
     *
     * Программа должна считать текст из исходного файла и записать его в новый файл,
     * добавляя к каждой строке её порядковый номер (начиная с 1).
     *
     * Пример:
     * Исходная строка: "Привет, мир!"
     * Результат: "1. Привет, мир!"
     *
     * Подсказки по реализации:
     * - Используй `BufferedReader` и `FileReader` для чтения строк из файла.
     * - Используй `BufferedWriter` и `FileWriter` для записи результата.
     * - Обрабатывай исключения `IOException`, `FileNotFoundException`.
     * - Не забудь закрыть все потоки (в блоке finally или с try-with-resources).
     *
     * @param inputFile  исходный файл
     * @param outputFile файл для записи результата
     */
    public void copyFileWithLineNumbers(File inputFile, File outputFile) throws IOException {
        File readFile = new File(inputFilePath);
        File WriteFile = new File(outputFilePath);

        if (!writeFile.exists()) {
            writeFile.createNewFile();
        }

        FileReader reader = new FileReader(riedFile);
        FileWriter writer = new FileWriter(writeFile);

        BufferedReader bufferedReader = new BufferedReader(reader);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        try {
            int counter = 1;
            String line = bufferedReader.readLine();

            while (line != null) {
                String string = counter + ". " + line + "\n";
                bufferedWriter.write(string);
                counter++;
                line = bufferedReader.readLine();
            }
        } catch (IOException ioException) {
        ioException.printStackTrace();
    }finally {
        bufferedReader.close();
        bufferedWriter.close();
    }
        // TODO: Реализовать метод

    /**
     * Задача 4: Сортировка строк в текстовом файле и запись в новый файл.
     *
     * Необходимо прочитать все строки из исходного файла, отсортировать их в алфавитном порядке
     * и сохранить в новый файл.
     *
     * Подсказки по реализации:
     * - Считай все строки в список (`List<String>`), использовав `BufferedReader`.
     * - Используй `Collections.sort()` или `list.sort()`.
     * - Запиши отсортированные строки в файл с помощью `BufferedWriter`.
     * - Обрабатывай исключения `IOException`, `FileNotFoundException`.
     *
     * @param inputFile  исходный файл
     * @param outputFile файл для записи отсортированных строк
     */
    public void sortLinesInFile(File inputFile, File outputFile) {
        // TODO: Реализовать метод
    }

    /**
     * Задача 6: Замена слова в текстовом файле.
     *
     * Заменить все вхождения заданного слова в тексте файла на новое слово и записать результат в другой файл.
     *
     * Пример:
     * Слово для замены: "Java", новое слово: "Python"
     * Исходная строка: "Я учу Java" → "Я учу Python"
     *
     * Подсказки по реализации:
     * - Читай построчно, заменяй через метод `String.replace(oldWord, newWord)`.
     * - Записывай результат в новый файл построчно.
     * - Обрабатывай исключения `IOException`, `FileNotFoundException`.
     *
     * @param inputFile  исходный файл
     * @param outputFile файл для записи результата
     * @param oldWord    слово, которое нужно заменить
     * @param newWord    новое слово
     */
    public void replaceWordInFile(File inputFile, File outputFile, String oldWord, String newWord) {
        // TODO: Реализовать метод
    }
}