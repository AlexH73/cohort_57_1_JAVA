package Homework.lesson_35;

import java.io.*;

public class Task4Main {
    public static void main(String[] args) {
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");

        // Записываем тестовые строки в файл
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile))) {
            writer.write("Яблоко\nБанан\nГруша\nАпельсин");
        } catch (IOException e) {
            System.out.println("Ошибки при создании тестового файла: " + e.getMessage());
        }

        // Выполняем сортировку
        Task4 task = new Task4();
        task.sortLinesInFile(inputFile, outputFile);

        // Проверяем результат
        System.out.println("Отсортированные стрроки записаны в output.txt");

    }
}
