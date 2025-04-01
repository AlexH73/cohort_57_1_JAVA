package Homework.lesson_36;

import java.io.*;
import java.nio.charset.StandardCharsets;


public class TeacherCode_4_1 {
    public static void main(String[] args) throws IOException {
        String path = "src/Lessons/Lesson_36/src/teacher_code/file.txt";

        // try with resources - mit UTF-8
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String outPath = "src/Lessons/Lesson_36/src/teacher_code/out.txt";
        File out = new File(outPath);

        if (!out.exists()) out.createNewFile();

        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outPath), StandardCharsets.UTF_8))) {
            writer.write("Hello, Java!");
            writer.newLine();
            writer.write("Этот код демонстрирует чтение и запись mit UTF-8.");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
