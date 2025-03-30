package Homework.lesson_36;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

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
    public void copyFileWithLineNumbers(File inputFile, File outputFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))){

            String line;
            int lineNumber = 1;

            while ((line = reader.readLine()) != null) {
                String numberedLine = lineNumber + ". " + line;
                writer.write(numberedLine);
                writer.newLine();
                lineNumber ++;
            }
        } catch (IOException e) {
            System.err.println("Ошибка при обработке файла: " + e.getMessage());
            e.printStackTrace();
        }
    }

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
        List<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))){
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) { // Удаляем пустые и пробельные строки
                    lines.add(line);
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
            e.printStackTrace();
        }

        Collections.sort(lines); // Сортировка строк в алфавитном порядке

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (String sortLine : lines) {
                writer.write(sortLine);
                writer.newLine(); // Добавляем разделитель строк
            }
        } catch (IOException e) {
            System.err.println("Ошибка при записи файла: " + e.getMessage());
            e.printStackTrace();
        }
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
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                // Замена всех вхождений слова в строке
                String modifiedLine = line.replace(oldWord, newWord);
                writer.write(modifiedLine);
                writer.newLine(); // Сохранение перевода строки
            }
        } catch (IOException e) {
            System.err.println("Ошибка при обработке файла: " + e.getMessage());
            e.printStackTrace();
        }
    }
}