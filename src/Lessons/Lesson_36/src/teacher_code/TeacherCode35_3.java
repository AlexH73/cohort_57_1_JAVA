package Lessons.Lesson_36.src.teacher_code;

import java.io.*;
import java.util.Scanner;


// прктика чтения и записи в файл
public class TeacherCode35_3 {
    public static void main(String[] args) throws IOException {
        File classwork35dir = new File("src/Lessons/Lesson_35/src/practice/classwork");

        if (classwork35dir.exists() && classwork35dir.isDirectory()) {
            File[] filesInClasswork35dir = classwork35dir.listFiles();

//            for (File file : filesInClasswork35dir) {
//                System.out.println(file.getPath());
//            }
        }

        File textFile = new File("src/Lessons/Lesson_35/src/teacher_code/file.txt");
        File newTextFile = new File("src/Lessons/Lesson_35/src/teacher_code/file_new.txt");
        if (!newTextFile.exists()) {
            newTextFile.createNewFile();
        }

        FileReader reader = new FileReader(textFile);
        FileWriter writer = new FileWriter(newTextFile);

        BufferedReader bfReader = new BufferedReader(reader);
        BufferedWriter bfWriter = new BufferedWriter(writer);

        try {
            String content = bfReader.readLine();
            while (content != null) {
                bfWriter.write(content + "\n");
                content = bfReader.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            bfWriter.close();
            bfReader.close();
        }
    }
}
