package Homework.lesson_35.Task1;
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

import java.io.*;

public class Task1 {


    public void copyFileWithLineNumbers(File inputFile, File outputFile) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                writer.write(lineNumber + ". " + line);
                writer.newLine();
                lineNumber++;
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e.getMessage());
        }

    }

}
