package Lessons.Lesson_35.src.practice.classwork;

import java.io.IOException;
import java.util.List;

import java.io.IOException;
import java.util.List;

public class FileMergerWithFilterImplRunner {
    public static void main(String[] args) {
        // Pfade zu den Eingabedateien
        List<String> inputFilePaths = List.of(
                "src/Lessons/Lesson_35/src/practice/classwork/files/file1.txt",
                "src/Lessons/Lesson_35/src/practice/classwork/files/file2.txt" // Korrektur: Unterschiedliche Dateien verwenden
        );

        // Pfad zur Ausgabedatei
        String outputFilePath = "src/Lessons/Lesson_35/src/practice/classwork/files/out.txt";

        // Schlüsselwort für die Filterung
        String keyword = "файл";

        // Instanziierung der Implementierungsklasse
        FileMergerWithFilterImpl fileMerger = new FileMergerWithFilterImpl();

        try {
            // Methode ausführen
            fileMerger.mergeFilesExcludingKeyword(inputFilePaths, outputFilePath, keyword);
            System.out.println("Dateien erfolgreich zusammengeführt!");
        } catch (IOException e) {
            // Aussagekräftigere Fehlermeldung
            System.err.println("Fehler beim Zusammenführen der Dateien: " + e.getMessage());
        }
    }
}

