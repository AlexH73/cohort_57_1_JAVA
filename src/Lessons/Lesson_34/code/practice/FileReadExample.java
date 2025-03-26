package Lessons.Lesson_34.code.practice;
import java.io.File;
import java.io.FileNotFoundException; // Импорт класса FileNotFoundException для обработки ошибок открытия файла
import java.util.Scanner;

public class FileReadExample {
    public static void main(String[] args) {
        Scanner fileReader = null;  // Объявление переменной fileReader для Scanner

        try {
            // Создание объекта File, который представляет файл "example.txt"
            File file = new File("example.txt");

            // Создание объекта Scanner для чтения данных из файла
            fileReader = new Scanner(file);

            // Цикл while продолжается, пока в файле есть следующая строка
            while (fileReader.hasNextLine()) {
                // Чтение следующей строки из файла
                String data = fileReader.nextLine();

                // Вывод прочитанной строки в консоль
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            // Блок catch перехватывает исключение FileNotFoundException
            // Вывод сообщения об ошибке в случае, если файл не найден
            System.out.println("Произошла ошибка: файл не найден.");

            // Вывод трассировки стека для диагностики исключения
            e.printStackTrace();
        } finally {
            // Блок finally гарантирует закрытие ресурса Scanner
            if (fileReader != null) {
                fileReader.close(); // Закрытие Scanner
                System.out.println("Ресурс Scanner был закрыт.");
            }
        }
    }
}
