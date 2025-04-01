package Homework.lesson_36.Task4;

import java.io.*;

public class Task4Main {
    public static void main(String[] args) {
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");

        // Записываем тестовые строки в файл
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile))) {
            writer.write("Яблоко\nБанан\nГруша\nАпельсин\n");
        } catch (IOException e) {
            System.out.println("Ошибки при создании тестового файла: " + e.getMessage());
        }

        // Выполняем сортировку
        Task4 task = new Task4();
        task.sortLinesInFile(inputFile, outputFile);

        // Читаем и выводим отсортированные строки из output.txt
        System.out.println("Отсортированные строки записаны в output.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(outputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения output.txt: " + e.getMessage());
        }
    }
}
