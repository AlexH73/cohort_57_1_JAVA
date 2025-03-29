package Homework.lesson_35.Task1;

import java.io.*;

public class Task1Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Создаем пример входного и выходного файла
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");

        // Записываем тестовую строку в исходный файл
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile))) {
            writer.write("Привет мир!");
            writer.newLine();
            writer.write("Как дела?");
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
            return;
        }

        // Создаем объект для выполнения копирования
        Task1 task = new Task1();
        // Выполняем копирование с добавлением номеров строк
        task.copyFileWithLineNumbers(inputFile, outputFile);
        // Проверяем результат
        try (BufferedReader reader = new BufferedReader((new FileReader(outputFile)))) {
            String line = reader.readLine();
            if (line != null) {
                System.out.println("Результат: " + line);   // Ожидаем: "1. Привет, мир!"
            } else {
                System.out.println("Файл output.txt пуст или не содержит строк.");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }

    }
}
