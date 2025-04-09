package Homerwork.Practica35;

import java.io.*;
import java.util.List;

// Шаг 1. Создать BufferedWriter для выходного файла
// Шаг 2. Для каждого пути из inputFilePaths:
//    2.1. Открыть BufferedReader
//    2.2. Читать строки по очереди
//    2.3. Если строка НЕ содержит keyword, записать её в выходной файл
//    2.4. Закрыть BufferedReader
// Шаг 3. Закрыть BufferedWriter
public class FileMergerWithFilter1Impl implements FileMergerWithFilter1 {
    @Override
    public void mergeFilesExcludingKeyword(List<String> inputFilePaths, String outputFilePath, String keyword)
            throws IOException {
        // Открываем выходной файл для записи (в режиме добавления)
        // Файл будет создан, если его нет.
        // Режим true — дописывает в файл, а не перезаписывает.
        try (BufferedWriter bfWriter = new BufferedWriter(new FileWriter(outputFilePath, true))) {
            // Перебираем все входные файлы
            for (String path : inputFilePaths) {
                //Открываем текущий входной файл
                try (BufferedReader bfReader = new BufferedReader(new FileReader(path))) {
                    String line;
                    // Читаем построчно
                    while ((line = bfReader.readLine()) != null) {
                        // Если keyword нет в строке (или он null) — записываем строку
                        if (keyword == null || !line.contains(keyword)) {//Если строка не содержит ключевое слово — она записывается в выходной файл.
                            bfWriter.write(line);
                            bfWriter.newLine();
                        }
                    }
                } catch (IOException e) {
                    // Можно логировать ошибку по конкретному файлу, но продолжаем дальше
                    System.err.println("Ошибка при обработке файла: " + path);
                    e.printStackTrace();
                }
            }
        }
    }
}





