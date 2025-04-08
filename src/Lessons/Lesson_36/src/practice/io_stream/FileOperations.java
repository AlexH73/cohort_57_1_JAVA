package Lessons.Lesson_36.src.practice.io_stream;

import java.io.*;

/**
 * writeFileUsingFileOutputStream записывает данные в файл, используя FileOutputStream. Данные дописываются в конец
 * файла благодаря использованию конструктора с параметром true. <p>
 * readFileUsingFileInputStream читает данные из файла посимвольно, используя FileInputStream. <p>
 * writeFileUsingFileWriter записывает данные в файл, используя FileWriter. Также в режиме дозаписи. <p>
 * readFileUsingFileReader читает данные из файла построчно, используя FileReader в сочетании с
 * BufferedReader. <p>
 * deleteFile удаляет файл по указанному пути.<p>
 */
public class FileOperations {
    public static void main(String[] args) {
        String filePath = "src/Lessons/Lesson_36/src/practice/example.txt";
        File file = new File(filePath);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        writeFileUsingFileOutputStream(filePath, "Hello, FileOutputStream!");
        readFileUsingFileInputStream(filePath);

        writeFileUsingFileWriter(filePath, "\nHello, FileWriter!");
        readFileUsingFileReader(filePath);

        deleteFile(filePath);
    }

    public static void writeFileUsingFileOutputStream(String filePath, String data) {
        try (FileOutputStream fos = new FileOutputStream(filePath, false)) { // Режим дозаписи
            fos.write(data.getBytes());
            System.out.println("Data written with FileOutputStream");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFileUsingFileInputStream(String filePath) {
        try (FileInputStream fis = new FileInputStream(filePath)) {
            int i;
            System.out.print("Data read with FileInputStream: ");
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFileUsingFileWriter(String filePath, String data) {
        try (FileWriter fw = new FileWriter(filePath, true)) { // Режим дозаписи
            fw.write(data);
            System.out.println("Data written with FileWriter");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFileUsingFileReader(String filePath) {
        try (FileReader fr = new FileReader(filePath); BufferedReader br = new BufferedReader(fr)) {
            String line;
            System.out.println("Data read with FileReader:");
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

