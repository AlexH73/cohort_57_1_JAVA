package Homework.lesson_35;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task4{
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
        List<String> lines = new ArrayList<>();

        // Чтение строк из файла
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) ;
            {
                lines.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
            return;
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e.getMessage());
            return;
        }

        // Сортировка строк
        Collections.sort(lines);
        // Запись отсортированных строк в новый файл
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (String sortedLine : lines) {
                writer.write(sortedLine);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }
    }
}

