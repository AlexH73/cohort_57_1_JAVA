package Lessons.Lesson_34.code.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Метод checkAge использует throw для генерации исключения, если переданный возраст не соответствует условиям. <p>
 * Метод readFile использует throws для указания, что он может выбросить исключение FileNotFoundException. <p>
 * В методе main демонстрируется вызов этих методов с обработкой возможных исключений в блоках try-catch. <p>
 */
public class ExceptionExample {

    // Метод, который проверяет валидность возраста пользователя
    // Использует 'throw' для генерации исключения
    public void checkAge(int age) {
        if (age < 18) {
            // Если возраст меньше 18, генерируем исключение IllegalArgumentException
            throw new IllegalArgumentException("Возраст должен быть не меньше 18 лет");
        }
        System.out.println("Возраст проверен: пользователь совершеннолетний");
    }

    // Метод, который читает данные из файла
    // Использует 'throws' для указания, что метод может выбросить исключение FileNotFoundException
    public void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);

        // Создание объекта Scanner для чтения файла
        // Scanner может выбросить FileNotFoundException, если файл не найден
        Scanner fileReader = new Scanner(file);

        while (fileReader.hasNextLine()) {
            // Выводим содержимое файла в консоль
            String data = fileReader.nextLine();
            System.out.println(data);
        }

        // Закрываем Scanner
        fileReader.close();
    }

    public static void main(String[] args) {
        ExceptionExample example = new ExceptionExample();

        // Вызываем метод checkAge
        try {
            example.checkAge(17); // Попытка передать недопустимый возраст
        } catch (IllegalArgumentException ex) {
            System.out.println("Перехвачено исключение: " + ex.getMessage());
        }

        // Вызываем метод readFile
        try {
            example.readFile("test.txt"); // Попытка открыть файл
        } catch (FileNotFoundException ex) {
            System.out.println("Перехвачено исключение: файл не найден.");
        }
    }
}
