package Lessons.Lesson_34.code.teacher_code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExampleCheckedException {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "src/Lessons/Lesson_34/code/teacher_code/example.txt";
        Scanner scanner = null;
        File file = new File(path);

        // ошибка потенципльно возникнет тут:
        scanner = new Scanner(file);
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }
}
