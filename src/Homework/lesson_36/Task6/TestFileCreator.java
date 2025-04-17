package Homework.lesson_36.Task6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileCreator {
    public static void createInputFile(File inputFile) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile))) {
            writer.write("Я учу Java.\n");
            writer.write(" Java - это популярный язык программирования.\n");
            writer.write("Многие разработчики любят  Java.\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

