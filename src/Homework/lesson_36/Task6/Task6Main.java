package Homework.lesson_36.Task6;

import java.io.File;

public class Task6Main {
    public static void main(String[] args) {
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");
        String oldWord = "Java";
        String newWord = "Python";

        Task6 replacer = new Task6();
        replacer.replaceWordInFile(inputFile, outputFile, oldWord, newWord);
    }
}
