package Lessons.Lesson_36.src.practice.io_stream;

import java.io.*;
import java.util.Scanner;

public class IOExamples {

    public static void main(String[] args) {
//        readBytesFromFile();
//        writeBytesToFile();
//        readTextFromFile();
//        writeTextToFile();
//        readFromConsole();

        String dirPath = "src/Lessons/Lesson_36/src/practice/io_stream/new_folder";
        File file = new File(dirPath);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        //        System.out.println(file.exists());
//        System.out.println(file.isFile());
//        System.out.println(file.isDirectory());

        // System.out.println(file.mkdir()); - создает папку
//         System.out.println(file.createNewFile()); //  - создает новый файл
//
//        Scanner fileScanner = new Scanner(file);
//
//        while (fileScanner.hasNext()) {
//            System.out.print(fileScanner.nextLine() + " ");
//        }

        try(BufferedWriter br = new BufferedWriter(new FileWriter(file));) {
            br.write("asdsa");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // Метод для чтения байт из файла с использованием FileInputStream
    public static void readBytesFromFile() {
        try (FileInputStream fis = new FileInputStream("src/Lessons/Lesson_36/src/practice/io_stream/input.txt")) {
            int data;
            // Чтение байт из файла до тех пор, пока не достигнут конец файла (-1)
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);  // Преобразование байта в символ и вывод на консоль
            }
        } catch (IOException e) {

            System.err.println(e.getMessage()); // Обработка исключений ввода/вывода
        }
    }

    // Метод для записи байт в файл с использованием FileOutputStream
    public static void writeBytesToFile() {
        try (FileOutputStream fos = new FileOutputStream("src/Lessons/Lesson_36/src/practice/io_stream/output.txt")) {
            String message = "hello there!";
            fos.write(message.getBytes());  // Преобразование строки в массив байт и запись в файл
        } catch (IOException e) {
            e.printStackTrace();  // Обработка исключений ввода/вывода
        }
    }

    // Метод для чтения текста из файла с использованием BufferedReader и FileReader
    public static void readTextFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("src/Lessons/Lesson_36/src/practice/io_stream/input.txt"))) {
            String line;
            // Чтение строк из файла до тех пор, пока не достигнут конец файла (null)
            while ((line = br.readLine()) != null) {
                System.out.println(line);  // Вывод строки на консоль
            }
        } catch (IOException e) {
            e.printStackTrace();  // Обработка исключений ввода/вывода
        }
    }

    // Метод для записи текста в файл с использованием BufferedWriter и FileWriter
    public static void writeTextToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/Lessons/Lesson_36/src/practice/io_stream/output2.txt"))) {
            bw.write("Hello, BufferedWriter!");  // Запись строки в файл
        } catch (IOException e) {
            e.printStackTrace();  // Обработка исключений ввода/вывода
        }
    }

    // Метод для чтения данных из консоли с использованием System.in и Scanner
    public static void readFromConsole() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();  // Чтение строки из консоли
            System.out.println("Hello, " + name + "!");
        }
    }
}

