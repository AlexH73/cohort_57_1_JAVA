package Lessons.Lesson_36.src.practice.classwork;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Прочитать содержимое файла и вернуть количество слов в этом файле<p>
 *     словом считается что егодно, кроме пробела,
 *     что слева и справа имеет пробелы или перенос строк/новую строку.
 *
 * Использовать BufferedReader
 *
 */
public class Classwork36 {
    public static void main(String[] args) {
        String path1 = "/some/incorrect/file.txt";
        String path2 =null;
        String path3 = "src/Lessons/Lesson_36/src/practice/classwork/out.txt";

        System.out.println("countWordsInFile(path1) = " + countWordsInFile(path1));
        System.out.println("countWordsInFile(path2) = " + countWordsInFile(path2));
        System.out.println("countWordsInFile(path3) = " + countWordsInFile(path3));

    }

    // учесть обработку ошибок
    // использовать счетчик слов, увеливае его на количество слов в каждой строке
    // те использовать цикл для подсчета
    private static int countWordsInFile(String path) {
        // обратить внимание на метод split в классе String, чтобы разбить строку на массив слов
        // и через длину массива узнать количество слов.


        try (BufferedReader bfReader = new BufferedReader(new FileReader(path))) {

        } catch (IOException e) {
            e.printStackTrace();
        }
        return -1;
    }
}
