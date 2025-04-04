package Lessons.Lesson_36.src.practice.classwork;

import Lessons.Lesson_35.src.practice.classwork.FileMergerWithFilterImpl;

import java.io.IOException;
import java.util.List;

public class FileMergerWithFilterImplRunner {
    public static void main(String[] args) {
        List<String> paths = List.of("src/Lessons/Lesson_35/src/practice/classwork/files/file1.txt",
                "src/Lessons/Lesson_35/src/practice/classwork/files/file1.txt");

        String out = "src/Lessons/Lesson_35/src/practice/classwork/files/out.txt";

        Lessons.Lesson_35.src.practice.classwork.FileMergerWithFilterImpl fmfi = new FileMergerWithFilterImpl();
        try {
            fmfi.mergeFilesExcludingKeyword(paths, out, "файл");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
