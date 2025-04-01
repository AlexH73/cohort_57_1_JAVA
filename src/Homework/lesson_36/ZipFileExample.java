package Homework.lesson_36;

import java.io.*;
import java.nio.file.*;
import java.util.logging.*;
import java.util.zip.*;

public class ZipFileExample {
    private static final Logger LOGGER = Logger.getLogger(ZipFileExample.class.getName());

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
                    LOGGER.warning("Datei existiert nicht: " + filePath);
                    continue;
                }

                try (FileInputStream fis = new FileInputStream(file)) {
                    zos.putNextEntry(new ZipEntry(file.getName()));

                    byte[] buffer = new byte[8192];
                    int length;
                    while ((length = fis.read(buffer)) > 0) {
                        zos.write(buffer, 0, length);
                    }

                    zos.closeEntry();
                    LOGGER.info("Erfolgreich hinzugefügt: " + filePath);
                }
            }
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Fehler beim Erstellen des ZIP-Archivs", e);
        }
    }

    public static void extractZipArchive(String zipFilePath, String destDirPath) {
        File destDir = new File(destDirPath);
        if (!destDir.exists() && !destDir.mkdirs()) {
            LOGGER.severe("Konnte Zielverzeichnis nicht erstellen: " + destDirPath);
            return;
        }

        File zipFile = new File(zipFilePath);
        if (!zipFile.exists()) {
            LOGGER.severe("ZIP-Datei existiert nicht: " + zipFilePath);
            return;
        }

        try (ZipInputStream zis = new ZipInputStream(new FileInputStream(zipFilePath))) {
            ZipEntry entry;
            while ((entry = zis.getNextEntry()) != null) {
                File file = new File(destDir, entry.getName());

                if (entry.isDirectory()) {
                    if (!file.exists() && !file.mkdirs()) {
                        LOGGER.warning("Konnte Unterverzeichnis nicht erstellen: " + file.getAbsolutePath());
                    }
                    continue;
                }

                try (FileOutputStream fos = new FileOutputStream(file)) {
                    byte[] buffer = new byte[8192];
                    int length;
                    while ((length = zis.read(buffer)) > 0) {
                        fos.write(buffer, 0, length);
                    }
                }

                LOGGER.info("Erfolgreich extrahiert: " + entry.getName());
            }
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Fehler beim Extrahieren des ZIP-Archivs", e);
        }
    }
}

