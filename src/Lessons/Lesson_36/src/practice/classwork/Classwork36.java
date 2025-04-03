package Lessons.Lesson_36.src.practice.classwork;

import java.io.*;

/**
 * Прочитать содержимое файла и вернуть количество слов в этом файле<p>
 * словом считается что егодно, кроме пробела,
 * что слева и справа имеет пробелы или перенос строк/новую строку.
 * <p>
 * Использовать BufferedReader
 */
public class Classwork36 {
    public static void main(String[] args){
        String path1 = "/some/incorrect/file.txt";
        String path2 = null;
        String path3 = "src/Lessons/Lesson_36/src/practice/classwork/out.txt";
        try {
            System.out.println("countWordsInFile(path1) = " + countWordsInFile(path1));
            System.out.println("countWordsInFile(path2) = " + countWordsInFile(path2));
            System.out.println("countWordsInFile(path3) = " + countWordsInFile(path3));

        } catch (IOException e) {
            System.err.println("Ошибка при обработке файла: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // учесть обработку ошибок
    // использовать счетчик слов, увиливая его на количество слов в каждой строке
    // те использовать цикл для подсчета
    private static int countWordsInFile(String path) throws FileNotFoundException {
        // обратить внимание на метод split в классе String, чтобы разбить строку на массив слов
        // и через длину массива узнать количество слов.

        int wordsCount = 0;

        if (path == null) {
            return -1;
        }

        File filePath = new File(path);
        if (filePath.isFile()) {
            try (BufferedReader bfReader = new BufferedReader(new FileReader(path))) {

                String line = bfReader.readLine();

                while (line != null) {
                    if (!line.isBlank()) {
                        //String[] words = line.split(" "); // "\\s+" - Учитываем любое количество пробелов
                        // words = "one two  three".split(" ") -> {"one", "two", "", "three"}
                        String[] words = line.split("\\s+"); // "\\s+" - Учитываем любое количество пробелов
                        //words = "one two  three".split("\\s+") -> {"one", "two", "three"}
                        wordsCount += words.length;
                    }
                    line = bfReader.readLine();
                }
            } catch (IOException e) {
                System.err.println("Ошибка при обработке файла: " + e.getMessage());
                e.printStackTrace();
            }
        }
        return wordsCount;
    }
}
