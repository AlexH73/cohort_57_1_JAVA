package Lessons.Lesson_35.src.teacher_code;

import java.io.*;
import java.util.Scanner;


// прктика чтения и записи в файл
public class TeacherCode35_2 {
    public static void main(String[] args) throws IOException {
        File classwork35dir = new File("src/Lessons/Lesson_35/src/practice/classwork");

        if (classwork35dir.exists() && classwork35dir.isDirectory()) {
            File[] filesInClasswork35dir = classwork35dir.listFiles();

            for (File file : filesInClasswork35dir) {
                System.out.println(file.getPath());
            }
        }

        File textFile = new File("src/Lessons/Lesson_35/src/teacher_code/file.txt");

        Scanner scanner = new Scanner(System.in);
        // String line = scanner.nextLine();
        // System.out.println("line = " + line);

        Scanner fileScanner = new Scanner(textFile);

        while (fileScanner.hasNext()) {
            String content = fileScanner.nextLine();
            System.out.println(content.toUpperCase());
        }

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("src/Lessons/Lesson_35/src/teacher_code/file.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            br.close();
        }



    }
}
