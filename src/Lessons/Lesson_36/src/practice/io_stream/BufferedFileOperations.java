package Lessons.Lesson_36.src.practice.io_stream;

import java.io.*;
/**
 * Запись данных в файл с использованием BufferedOutputStream, который обеспечивает буферизацию вывода для увеличения
 * производительности. <p>
 * Чтение данных из файла посимвольно с использованием BufferedInputStream, который буферизует ввод для повышения
 * производительности.<p>
 * Запись строк в файл с использованием BufferedWriter, который предлагает эффективный способ записи текстовых
 * данных.<p>
 * Чтение строк из файла с использованием BufferedReader, который позволяет эффективно читать текст построчно.<p>
 */
public class BufferedFileOperations {

    public static void main(String[] args) {
        String filePath = "src/Lessons/Lesson_36/src/practice/io_streamexampleBuffered.txt";
        File file = new File(filePath);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        String data = "Hello, BufferedOutputStream!";
        writeFileUsingBufferedOutputStream(filePath, data);
        readFileUsingBufferedInputStream(filePath);

        data = "\nHello, BufferedWriter!";
        writeFileUsingBufferedWriter(filePath, data);
        readFileUsingBufferedReader(filePath);

        deleteFile(filePath);
    }

    public static void writeFileUsingBufferedOutputStream(String filePath, String data) {
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath, true))) {
            bos.write(data.getBytes());
            System.out.println("Data written with BufferedOutputStream");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFileUsingBufferedInputStream(String filePath) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath))) {
            int i;
            System.out.print("Data read with BufferedInputStream: ");
            while ((i = bis.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFileUsingBufferedWriter(String filePath, String data) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
            bw.write(data);
            System.out.println("Data written with BufferedWriter");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFileUsingBufferedReader(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("Data read with BufferedReader:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deleteFile(String filePath) {
        File file = new File(filePath);
        if (file.delete()) {
            System.out.println(filePath + " has been deleted.");
        } else {
            System.out.println("Could not delete " + filePath);
        }
    }
}

