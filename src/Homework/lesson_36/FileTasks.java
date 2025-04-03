package Homework.lesson_36;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Класс с задачами на работу с файлами. Реализация методов пока отсутствует.
 * Студенты должны реализовать указанные методы, следуя описанию и подсказкам.
 */
public class FileTasks {

    /**
     * Задача 1: Копирование текстового файла с добавлением номера строки.
     * <p>
     * Программа должна считать текст из исходного файла и записать его в новый файл,
     * добавляя к каждой строке её порядковый номер (начиная с 1).
     * <p>
     * Пример:
     * Исходная строка: "Привет, мир!"
     * Результат: "1. Привет, мир!"
     * <p>
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
        if (inputFile == null || outputFile == null) {
            System.out.println("Ошибка: файлы не должны быть null.");
            return;
        }

        if (!inputFile.exists()) {
            System.out.println("Ошибка: исходный файл не найден.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            int lineNumber = 1;

            while ((line = reader.readLine()) != null) {
                writer.write(lineNumber + ". " + line);
                writer.newLine();
                lineNumber++;
            }

            System.out.println("Файл успешно скопирован в " + outputFile.getPath());

        } catch (IOException e) {
            System.out.println("Ошибка при обработке файлов: " + e.getMessage());
        }
    }

    /**
     * Задача 4: Сортировка строк в текстовом файле и запись в новый файл.
     * <p>
     * Необходимо прочитать все строки из исходного файла, отсортировать их в алфавитном порядке
     * и сохранить в новый файл.
     * <p>
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
        if (inputFile == null || outputFile == null) {
            System.out.println("Ошибка: файлы не должны быть null.");
            return;
        }

        if (!inputFile.exists()) {
            System.out.println("Ошибка: исходный файл не найден.");
            return;
        }

        List<String> lines = new ArrayList<>();

        // Читаем строки из файла и добавляем их в список
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
            return;
        }

        // Сортируем строки в алфавитном порядке
        Collections.sort(lines);

        // Записываем отсортированные строки в новый файл
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (String sortedLine : lines) {
                writer.write(sortedLine);
                writer.newLine();
            }
            System.out.println("Файл успешно отсортирован и записан в " + outputFile.getPath());
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }

    /**
     * Задача 6: Замена слова в текстовом файле.
     * <p>
     * Заменить все вхождения заданного слова в тексте файла на новое слово и записать результат в другой файл.
     * <p>
     * Пример:
     * Слово для замены: "Java", новое слово: "Python"
     * Исходная строка: "Я учу Java" → "Я учу Python"
     * <p>
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
        if (inputFile == null || outputFile == null || oldWord == null || newWord == null) {
            System.out.println("Ошибка: входные параметры не должны быть null.");
            return;
        }

        if (!inputFile.exists()) {
            System.out.println("Ошибка: исходный файл не найден.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                // Заменяем слово в строке
                String modifiedLine = line.replace(oldWord, newWord);
                writer.write(modifiedLine);
                writer.newLine();
            }

            System.out.println("Замена слов выполнена. Результат записан в " + outputFile.getPath());

        } catch (IOException e) {
            System.out.println("Ошибка при обработке файлов: " + e.getMessage());
        }
    }
}

