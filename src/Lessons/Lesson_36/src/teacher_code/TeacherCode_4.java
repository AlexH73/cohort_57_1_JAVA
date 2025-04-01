package Lessons.Lesson_36.src.teacher_code;

import java.io.*;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;

import static java.nio.charset.StandardCharsets.UTF_8;


public class TeacherCode_4 {
    public static void main(String[] args) throws IOException {
         usingFileInputStream();
         usingFileOutputStream();
        //usingFileReader();
        //usingFileWriter();


    }

    private static void usingFileInputStream() {
        String path = "src/Lessons/Lesson_36/src/teacher_code/file.txt";

        // try with resources
        try (FileInputStream fis = new FileInputStream(path)) {
            int i;

            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void usingFileOutputStream() throws IOException {
        String outPath = "src/Lessons/Lesson_36/src/teacher_code/out.txt";
        File out = new File(outPath);

        if (!out.exists()) out.createNewFile();

        try (FileOutputStream fos = new FileOutputStream(outPath)) {
            String data = "Hello, Java!";
            fos.write(data.getBytes());
            fos.write("Этот код демонстрирует чтение файла по одному байту за раз и вывод его содержимого в консоль.\n".getBytes());
            fos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void usingFileReader() {
        try (
                FileReader fr = new FileReader("src/Lessons/Lesson_36/src/teacher_code/file.txt");
                BufferedReader br = new BufferedReader(fr)
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void usingFileWriter() {
        try (FileWriter fw = new FileWriter("src/Lessons/Lesson_36/src/teacher_code/out.txt");
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("Hello, Java!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void usingFileReaderWithBuffer() {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("input.bin"))) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                System.out.println((char) bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void usingFileWriterWithBuffer() {
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("output.bin"))) {
            byte[] data = "hello Java".getBytes();// инициализация данных для записи;
            bos.write(data);
            // Запись выполняется эффективно, используя буфер для сбора данных перед их записью на диск.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
