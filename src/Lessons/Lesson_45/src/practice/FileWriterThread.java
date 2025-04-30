package Lessons.Lesson_45.src.practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterThread {
    public static void main(String[] args) {
        int num = 1000;
        String path = "src/Lessons/Lesson_45/src/practice/numbers.txt";
        boolean appendMode = false;

        Thread t1 = getTextWriter(num, path, appendMode);
        Thread t2 = getTextWriter(num, path, appendMode);

        t1.start();
        t2.start();
    }

    private static Thread getTextWriter(int num, String path, boolean appendMode) {
        Thread textWriter = new Thread(() ->
        {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, appendMode))) {
                for (int i = 0; i < num; i++) {
                    int random = (int) (Math.random() * 100_000);
                    writer.write(String.valueOf(random));
                    writer.write("\n");
                    writer.flush();
                }
            } catch (IOException e) {
            }
        }
        );
        return textWriter;
    }
}
