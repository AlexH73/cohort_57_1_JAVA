package Homework.lesson_36.Task6;

import java.io.*;

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

public class Task6 {
    public void replaceWordInFile(File inputFile, File outputFile, String oldWord, String newWord) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.replace(oldWord, newWord));
                writer.newLine();
            }

            System.out.println("Файл успешно обработан и сохранен в: " + outputFile.getAbsolutePath());
        } catch (FileNotFoundException e) {
            System.err.println("Ошибка: Файл не найден - " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Ошибка ввода/вывода -  " + e.getMessage());
        }

    }
}
