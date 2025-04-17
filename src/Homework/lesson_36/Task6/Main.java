package Homework.lesson_36.Task6;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import static Homework.lesson_36.FileTasksTest.baseDir;


public class Main {
    public static void main(String[] args) {
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");

        // Создаем тестовый файл
        TestFileCreator.createInputFile(inputFile);

        System.out.println("Проверь файл input.txt");


        if (!inputFile.exists()) {
            System.out.println("Файл input.txt не найден. Убедитесь, что он существует в рабочей директории. ");
        }


        File source = new File(baseDir + "/java_code.txt");
        File target = new File(baseDir + "/python_code.txt");

        String oldWord = "Java";
        String newWord = "Python";

        FileWordReplacer task6 = new FileWordReplacer();

        try {
            task6.replaceWordInFile(source, target, oldWord, newWord);

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
