package Homework.lesson_36;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class FileTasks {

    //* Задача 1: Копирование текстового файла с добавлением номера строки.
    public void copyFileWithLineNumbers(File inputFile, File outputFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                writer.write(lineNumber + ". " + line);
                writer.newLine();  // Переход на новую строку
                lineNumber++;
            }

        } catch (IOException e) {
            System.out.println("[FAIL] Ошибка при обработке файла: " + e.getMessage());
        }
    }

    // Задача 4: Сортировка строк в текстовом файле и запись в новый файл.
    public void sortLinesInFile(File inputFile, File outputFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            List<String> lines = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }

            Collections.sort(lines);

            for (String sortedLine : lines) {
                writer.write(sortedLine);
                writer.newLine(); // Переход на новую строку
            }

        } catch (IOException e) {
            System.out.println("[FAIL] Ошибка при обработке файла: " + e.getMessage());
        }
    }

    // Задача 6: Замена слова в текстовом файле.
    public void replaceWordInFile(File inputFile, File outputFile, String oldWord, String newWord) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                // Заменяем все вхождения старого слова на новое
                String updatedLine = line.replace(oldWord, newWord);
                writer.write(updatedLine);
                writer.newLine(); // Переход на новую строку
            }

        } catch (IOException e) {
            System.out.println("[FAIL] Ошибка при обработке файла: " + e.getMessage());
        }
    }
}
