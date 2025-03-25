package Lessons.Lesson_34.code.teacher_code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExampleCheckedException {
    // если у нас в приложении нет try-catch блока, то мы можем использовать throws,
    // но, если будет ошибка, это привдеет к остановке работы приложения на том месте,
    // где возникла ошибка
    // public static void main(String[] args) throws FileNotFoundException {
    public static void main(String[] args) {
        String path = "src/Lessons/Lesson_34/code/teacher_code/example2.txt";
        Scanner scanner = null;
        File file = new File(path);

        // ошибка потенциально возникнет тут:
        try {
            scanner = new Scanner(file);
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        System.out.println("\n\nзакончил свою работу благополучно");
    }
}
