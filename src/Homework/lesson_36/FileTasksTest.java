package Homework.lesson_36;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

/**
 * Ручные тесты для класса FileTasks.
 * Запускаются через обычный main и выводят результаты в консоль.
 */
public class FileTasksTest {

    private static final String baseDir = "src/Homework/lesson_36/files";
    private static final FileTasks fileTasks = new FileTasks();

    public static void main(String[] args) {
        testCopyFileWithLineNumbers();
        testSortLinesInFile();
        testReplaceWordInFile();
    }

    /**
     * Тестирует метод copyFileWithLineNumbers.
     * Проверяет, что:
     * - файл создан;
     * - строки не пустые;
     * - строки пронумерованы.
     */
    public static void testCopyFileWithLineNumbers() {
        File source = new File(baseDir + "/source.txt");
        File target = new File(baseDir + "/target_copy.txt");

        try {
            fileTasks.copyFileWithLineNumbers(source, target);

            if (!target.exists()) {
                System.out.println("[FAIL] copyFileWithLineNumbers: Файл не был создан.");
                return;
            }

            List<String> lines = Files.readAllLines(target.toPath());
            if (lines.isEmpty()) {
                System.out.println("[FAIL] copyFileWithLineNumbers: Файл пуст.");
                return;
            }

            boolean allNumbered = true;
            for (int i = 0; i < lines.size(); i++) {
                if (!lines.get(i).startsWith((i + 1) + ". ")) {
                    System.out.printf("[FAIL] copyFileWithLineNumbers: Строка %d не начинается с '%d. '%n",
                            i + 1, i + 1);
                    allNumbered = false;
                }
            }

            if (allNumbered) {
                System.out.println("[OK] copyFileWithLineNumbers выполнен успешно.");
            }

        } catch (IOException e) {
            System.out.println("[FAIL] copyFileWithLineNumbers: Ошибка чтения/записи: " + e.getMessage());
        }
    }

    /**
     * Тестирует метод sortLinesInFile.
     * Проверяет, что:
     * - файл создан;
     * - строки отсортированы по алфавиту.
     */
    public static void testSortLinesInFile() {
        File source = new File(baseDir + "/source.txt");
        File target = new File(baseDir + "/sorted.txt");

        try {
            fileTasks.sortLinesInFile(source, target);

            if (!target.exists()) {
                System.out.println("[FAIL] sortLinesInFile: Файл не был создан.");
                return;
            }

            List<String> lines = Files.readAllLines(target.toPath());
            List<String> sorted = List.copyOf(lines).stream().sorted().toList();

            if (!lines.equals(sorted)) {
                System.out.println("[FAIL] sortLinesInFile: Строки не отсортированы.");
            } else {
                System.out.println("[OK] sortLinesInFile выполнен успешно.");
            }

        } catch (IOException e) {
            System.out.println("[FAIL] sortLinesInFile: Ошибка чтения/записи: " + e.getMessage());
        }
    }

    /**
     * Тестирует метод replaceWordInFile.
     * Проверяет, что:
     * - файл создан;
     * - старое слово отсутствует;
     * - новое слово присутствует.
     */
    public static void testReplaceWordInFile() {
        File source = new File(baseDir + "/java_code.txt");
        File target = new File(baseDir + "/python_code.txt");

        String oldWord = "Java";
        String newWord = "Python";

        try {
            fileTasks.replaceWordInFile(source, target, oldWord, newWord);

            if (!target.exists()) {
                System.out.println("[FAIL] replaceWordInFile: Файл не был создан.");
                return;
            }

            List<String> lines = Files.readAllLines(target.toPath());
            boolean containsOld = lines.stream().anyMatch(line -> line.contains(oldWord));
            boolean containsNew = lines.stream().anyMatch(line -> line.contains(newWord));

            if (containsOld) {
                System.out.println("[FAIL] replaceWordInFile: Старое слово все еще присутствует в файле.");
            } else if (!containsNew) {
                System.out.println("[FAIL] replaceWordInFile: Новое слово не найдено в файле.");
            } else {
                System.out.println("[OK] replaceWordInFile выполнен успешно.");
            }

        } catch (IOException e) {
            System.out.println("[FAIL] replaceWordInFile: Ошибка чтения/записи: " + e.getMessage());
        }
    }
}