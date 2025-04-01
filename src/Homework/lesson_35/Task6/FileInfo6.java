package Homework.lesson_35.Task6;

import java.io.File;

/**
 * Задача 6: Создание новой директории.
 * <p>
 * Метод должен создать новую директорию по указанному пути.
 * Если она уже существует — ничего не делать.
 * <p>
 * Подсказки:
 * - Используй `mkdir()`.
 *
 * @param dir директория для создания
 */
public class FileInfo6 {
    public void createDirectory(File dir) {
        if (dir == null || !dir.exists()) {
            System.out.println("Ошибка: передан null-объект.");
            return;
        }

        if (dir.exists()) {
            System.out.println("Директория уже существует: " + dir.getAbsolutePath());
            return;
        }

        if (dir.mkdir()) {
            System.out.println("Директория создана: " + dir.getAbsolutePath());
        } else {
            System.out.println("Ошибка при создании директории: " + dir.getAbsolutePath());

        }

    }
}
