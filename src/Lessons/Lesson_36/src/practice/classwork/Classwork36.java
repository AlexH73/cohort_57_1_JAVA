package Lessons.Lesson_36.src.practice.classwork;

import java.io.BufferedReader;
import java.io.File;
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


    /**
     * Liest den Inhalt einer Datei und gibt die Anzahl der Wörter zurück.
     * Ein Wort wird als eine Zeichenfolge betrachtet, die durch Leerzeichen oder Zeilenumbrüche getrennt ist.
     */

        private static int countWordsInFile(String path) {
            if (path == null || path.isEmpty()) {
                System.err.println("Ungültiger Dateipfad: " + path);
                return -1;
            }

            File file = new File(path);
            if (!file.exists() || !file.isFile()) {
                System.err.println("Datei existiert nicht oder ist keine reguläre Datei: " + path);
                return -1;
            }

            int wordCount = 0;

            try (BufferedReader bfReader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = bfReader.readLine()) != null) {
                    wordCount += line.trim().isEmpty() ? 0 : line.trim().split("\\s+").length;
                }
            } catch (IOException e) {
                System.err.println("Fehler beim Lesen der Datei: " + path);
                e.printStackTrace();
                return -1;
            }

            return wordCount;
        }
    }

