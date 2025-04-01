package Lessons.Lesson_36.src.teacher_code;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;

import static java.nio.charset.StandardCharsets.UTF_8;


public class TeacherCode_4 {
    public static void main(String[] args) throws IOException {
        String path = "src/Lessons/Lesson_36/src/teacher_code/file.txt";

        // try with resources
        try (FileInputStream fis = new FileInputStream(path)) {
            int i;

            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String outPath = "src/Lessons/Lesson_36/src/teacher_code/out.txt";
        File out = new File(outPath);

        if (!out.exists()) out.createNewFile();

        try (FileOutputStream fos = new FileOutputStream(outPath)) {
            String data = "Hello, Java!";
            fos.write(data.getBytes());
            fos.write("Этот код демонстрирует чтение файла по одному байту за раз и вывод его содержимого в консоль.\n".getBytes());
            fos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
