package Lessons.Lesson_35.src.student_code;

import java.io.File;

public class StudentCode35 {
    public static void main(String[] args) {
        File dir = new File("src/Other");

        System.out.println(dir.isDirectory());
        System.out.println(dir.isFile());

    }
}
