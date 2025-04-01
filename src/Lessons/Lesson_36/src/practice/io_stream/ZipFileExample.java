package Lessons.Lesson_36.src.practice.io_stream;

import java.io.*;
import java.nio.file.Files;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
 * createZipArchive: Этот метод принимает путь к архиву, который будет создан, и массив путей файлов, которые должны
 * быть добавлены в архив. Для каждого файла создается ZipEntry, и содержимое файла записывается в архив. <p>
 * extractZipArchive: Этот метод принимает путь к ZIP архиву для распаковки и директорию, куда будут извлекаться файлы.
 * Для каждого ZipEntry в архиве создается файл в указанной директории, и содержимое ZipEntry записывается в этот файл.
 * <p>
 */
public class ZipFileExample {

    public static void main(String[] args) {
        String dirPath = "src/Lessons/Lesson_36/src/practice/io_stream/";
        String[] files = {dirPath + "file1.txt", dirPath + "file2.txt"};
        String zipFile = dirPath + "archive.zip";
        String extractDir = "extractedFiles";

        createZipArchive(zipFile, files);
        extractZipArchive(zipFile, extractDir);
    }

    public static void createZipArchive(String zipFilePath, String[] filePaths) {
        try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipFilePath))) {
            for (String filePath : filePaths) {
                File file = new File(filePath);
                if (!file.exists()) {
                    System.out.println("File does not exist: " + filePath);
                    continue;
                }

                zos.putNextEntry(new ZipEntry(file.getName()));

                byte[] bytes = Files.readAllBytes(file.toPath());
                zos.write(bytes, 0, bytes.length);
                zos.closeEntry();

                System.out.println("Successfully added to zip: " + filePath);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void extractZipArchive(String zipFilePath, String destDirPath) {
        File destDir = new File(destDirPath);
        if (!destDir.exists()) {
            destDir.mkdir();
        }

        try (ZipInputStream zis = new ZipInputStream(new FileInputStream(zipFilePath))) {
            ZipEntry entry;
            while ((entry = zis.getNextEntry()) != null) {
                File file = new File(destDir, entry.getName());

                try (FileOutputStream fos = new FileOutputStream(file)) {
                    byte[] buffer = new byte[1024];
                    int length;
                    while ((length = zis.read(buffer)) > 0) {
                        fos.write(buffer, 0, length);
                    }
                }

                System.out.println("Successfully extracted: " + entry.getName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

