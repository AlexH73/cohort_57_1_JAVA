package Lessons.Lesson_35.src.practice.classwork;

import java.io.*;
import java.util.List;
import java.util.zip.*;

/**
 * Реализация задачи 3: Создание и распаковка ZIP архива.
 */

public class ZipFileHandlerImpl implements ZipFileHandler {
    public static void main(String[] args) {
        ZipFileHandlerImpl handler = new ZipFileHandlerImpl();

        String path = "src/Lessons/Lesson_35/src/practice/classwork/files/";

        // Тест архивации
        try {
            handler.createZipArchive(
                    List.of(path + "file1.txt", path + "file2.txt"),
                    path + "archive.zip"
            );
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Тест распаковки
        try {
            handler.extractZipArchive(path + "archive.zip", path + "unpacked");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Создаёт ZIP-архив из списка файлов.
     *
     * @param filePaths     список путей к файлам, которые нужно заархивировать
     * @param zipOutputPath путь к создаваемому ZIP-файлу
     * @throws IOException если возникла ошибка при создании архива
     */
    @Override
    public void createZipArchive(List<String> filePaths, String zipOutputPath) throws IOException {
        // Шаг 1. Создать FileOutputStream и ZipOutputStream для zipOutputPath
        // Шаг 2. Для каждого файла из filePaths:
        //    2.1. Создать FileInputStream
        //    2.2. Создать ZipEntry и добавить его через putNextEntry
        //    2.3. Скопировать содержимое файла в ZipOutputStream
        //    2.4. Закрыть текущий ZipEntry и FileInputStream
        // Шаг 3. Закрыть ZipOutputStream
        try (ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(zipOutputPath))) {
            for (String filePath : filePaths) {
                File file = new File(filePath);
                if (!file.exists()) {
                    throw new FileNotFoundException("File not found: " + filePath);
                }

                try (FileInputStream fis = new FileInputStream(file)) {
                    ZipEntry zipEntry = new ZipEntry(file.getName()); // Используем file.getPath() для сохранения структуры
                    zipOut.putNextEntry(zipEntry);

                    byte[] buffer = new byte[1024];
                    int length;
                    while ((length = fis.read(buffer)) > 0) {
                        zipOut.write(buffer, 0, length);
                    }
                    zipOut.closeEntry();
                }
            }
        }
    }

    /**
     * Распаковывает содержимое ZIP архива в указанную директорию.
     *
     * @param zipInputPath  путь к ZIP-файлу
     * @param extractToPath путь к директории, куда будет производиться извлечение файлов
     * @throws IOException если возникла ошибка при распаковке архива
     */
    @Override
    public void extractZipArchive(String zipInputPath, String extractToPath) throws IOException {
        // Шаг 1. Создать FileInputStream и ZipInputStream для zipInputPath
        // Шаг 2. В цикле читать ZipEntry:
        //    2.1. Для каждого ZipEntry создать файл в папке extractToPath
        //    2.2. Открыть FileOutputStream и скопировать содержимое из ZipInputStream
        //    2.3. Закрыть FileOutputStream
        // Шаг 3. Закрыть ZipInputStream
        File destDir = new File(extractToPath);
        if (!destDir.exists()) {
            destDir.mkdirs();
        }

        try (ZipInputStream zipIn = new ZipInputStream(new FileInputStream(zipInputPath))) {
            ZipEntry entry;
            while ((entry = zipIn.getNextEntry()) != null) {
                File file = new File(destDir, entry.getName());

                // Защита от Path Traversal
                String canonicalDestPath = destDir.getCanonicalPath();
                String canonicalEntryPath = file.getCanonicalPath();

                if (!canonicalEntryPath.startsWith(canonicalDestPath + File.separator)) {
                    throw new IOException("Invalid ZIP entry: " + entry.getName());
                }

                if (entry.isDirectory()) {
                    file.mkdirs();
                } else {
                    try (FileOutputStream fos = new FileOutputStream(file)) {
                        byte[] buffer = new byte[1024];
                        int length;
                        while ((length = zipIn.read(buffer)) > 0) {
                            fos.write(buffer, 0, length);
                        }
                    }
                }
                zipIn.closeEntry();
            }
        }
    }
}