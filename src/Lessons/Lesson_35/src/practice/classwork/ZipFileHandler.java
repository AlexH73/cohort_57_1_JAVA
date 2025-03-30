package Lessons.Lesson_35.src.practice.classwork;

import java.util.List;

/**
 * Интерфейс для задачи 3: Создание и распаковка ZIP архива.
 */
public interface ZipFileHandler {

    /**
     * Создаёт ZIP-архив из списка файлов.
     *
     * @param filePaths     список путей к файлам, которые нужно заархивировать
     * @param zipOutputPath путь к создаваемому ZIP-файлу
     * @throws java.io.IOException если возникла ошибка при создании архива
     *
     * <h3>Шаги реализации:</h3>
     * <ol>
     *     <li>Создать FileOutputStream и обернуть его в ZipOutputStream.</li>
     *     <li>Для каждого файла:
     *         <ul>
     *             <li>Создать FileInputStream.</li>
     *             <li>Создать ZipEntry и передать в zipOutputStream.putNextEntry().</li>
     *             <li>Считать байты из файла и записать в архив.</li>
     *             <li>Закрыть ZipEntry и FileInputStream.</li>
     *         </ul>
     *     </li>
     *     <li>Закрыть ZipOutputStream.</li>
     * </ol>
     */
    void createZipArchive(List<String> filePaths, String zipOutputPath) throws Exception;

    /**
     * Распаковывает содержимое ZIP архива в указанную директорию.
     *
     * @param zipInputPath  путь к ZIP-файлу
     * @param extractToPath путь к директории, куда будет производиться извлечение файлов
     * @throws java.io.IOException если возникла ошибка при распаковке архива
     *
     * <h3>Шаги реализации:</h3>
     * <ol>
     *     <li>Создать FileInputStream и обернуть его в ZipInputStream.</li>
     *     <li>Перебрать все ZipEntry в архиве.</li>
     *     <li>Для каждого ZipEntry:
     *         <ul>
     *             <li>Создать соответствующий файл в целевой папке.</li>
     *             <li>Скопировать байты из архива в файл.</li>
     *         </ul>
     *     </li>
     *     <li>Закрыть ZipInputStream и потоки записи.</li>
     * </ol>
     */
    void extractZipArchive(String zipInputPath, String extractToPath) throws Exception;
}