package Lessons.Lesson_35.src.teacher_code;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class TeacherCode35 {
    public static void main(String[] args) throws IOException {
        String absolutePath = "/Users/imiftakhov/Desktop/Java/AIT-TR/cohort_57_1_JAVA/src/Lessons/Lesson_35/src/teacher_code/file.txt";
        String path = "src/Lessons/Lesson_35/src/teacher_code/file.txt";

        File textFile = new File(path);

        System.out.println("textFile.exists() = " + textFile.exists());
        System.out.println("textFile.isFile() = " + textFile.isFile());
        System.out.println("textFile.isDirectory() = " + textFile.isDirectory());

        File directory = new File("src/Lessons/Lesson_35/src/teacher_code/");

        System.out.println("directory.exists() = " + directory.exists());
        System.out.println("directory.isDirectory() = " + directory.isDirectory());
        System.out.println("directory.isFile() = " + directory.isFile());

        // создаем файл, который не существует в каталоге
        File fileThatNotExist = new File("src/Lessons/Lesson_35/src/teacher_code/file_not_exist.txt");

        System.out.println("fileThatNotExist.exists() = " + fileThatNotExist.exists());
        System.out.println("fileThatNotExist.isDirectory() = " + fileThatNotExist.isDirectory());
        System.out.println("fileThatNotExist.isFile() = " + fileThatNotExist.isFile());

        // создаем этот файл при помощи нашей программы
        System.out.println("fileThatNotExist.createNewFile() = " + fileThatNotExist.createNewFile());

        System.out.println("fileThatNotExist.exists() = " + fileThatNotExist.exists());
        System.out.println("fileThatNotExist.isDirectory() = " + fileThatNotExist.isDirectory());
        System.out.println("fileThatNotExist.isFile() = " + fileThatNotExist.isFile());

        // удаляем файл при помощи нашей программы
        System.out.println("fileThatNotExist.delete() = " + fileThatNotExist.delete());

        System.out.println("fileThatNotExist.exists() = " + fileThatNotExist.exists());
        System.out.println("fileThatNotExist.isDirectory() = " + fileThatNotExist.isDirectory());
        System.out.println("fileThatNotExist.isFile() = " + fileThatNotExist.isFile());

        File unexistDir = new File("src/Lessons/Lesson_35/src/teacher_code/file_not_exist");

        unexistDir.delete();

        if (!unexistDir.exists()) {
            unexistDir.mkdir();
            System.out.println("New directory has been created: " + unexistDir.getPath());
        }
    }
}
