package Lessons.Lesson_36.src.practice.classwork;

import java.util.List;

/**
 * Интерфейс для задачи 2: Объединение текстовых файлов с фильтрацией строк.
 */
public interface FileMergerWithFilter {

    /**
     * Объединяет содержимое нескольких текстовых файлов в один, исключая строки, содержащие ключевое слово.
     *
     * @param inputFilePaths список путей к исходным файлам
     * @param outputFilePath путь к итоговому файлу
     * @param keyword        слово-фильтр: если строка содержит его, она исключается из записи
     * @throws java.io.IOException если возникла ошибка при чтении или записи файлов
     *
     * <h3>Шаги реализации:</h3>
     * <ol>
     *     <li>Создать FileWriter и BufferedWriter для результирующего файла.</li>
     *     <li>Для каждого входного файла:
     *         <ul>
     *             <li>Создать FileReader и BufferedReader.</li>
     *             <li>Прочитать построчно содержимое и проверить, содержит ли строка ключевое слово.</li>
     *             <li>Если не содержит — записать в выходной файл.</li>
     *             <li>Закрыть потоки.</li>
     *         </ul>
     *     </li>
     *     <li>После завершения — закрыть BufferedWriter.</li>
     * </ol>
     */
    void mergeFilesExcludingKeyword(List<String> inputFilePaths, String outputFilePath, String keyword) throws Exception;
}