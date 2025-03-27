package Lessons.Lesson_35.src.teacher_code;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class TeacherCode35 {
    public static void main(String[] args) throws IOException {
        String absolutePath = "/Users/imiftakhov/Desktop/Java/AIT-TR/cohort_57_1_JAVA/src/Lessons/Lesson_35/src/teacher_code/file.txt";
        String path = "src/Lessons/Lesson_35/src/teacher_code/file.txt";

        File textFile = new File(path);

        System.out.println("textFile.isFile() = " + textFile.isFile());
        System.out.println("textFile.isDirectory() = " + textFile.isDirectory());

        // File directory = new File();
    }
}
