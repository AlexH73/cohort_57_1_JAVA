package Homework.Homework_21;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Notebook {
    private List<NotebookTask> tasks = new ArrayList<>(); // Список для хранения задач

    // Метод для добавления задачи
    public void addTask(NotebookTask task) {
        tasks.add(task);
        System.out.println("Добавлена: " + task);
    }

    // Метод для удаления задачи по описанию
    public void removeTask(String description) {
        boolean removed = tasks.removeIf(t ->
                t.getDescription().equalsIgnoreCase(description)
        );
        System.out.println(removed ? "Задача удалена: " + description
                : "Задача не найдена: " + description); // Сообщение об удалении
    }

    // Метод для сортировки задач по приоритету
    public void sortTasksByPriority() {
        tasks.sort(Comparator.comparingInt(t ->
                t.getPriority().ordinal() // Сортировка по приоритету (ordinal возвращает порядок перечисления)
        ));
        System.out.println("Задачи отсортированы по приоритету");
    }

    // Метод для отображения выполненных задач
    public void showCompletedTasks() {
        List<NotebookTask> completed = tasks.stream()
                .filter(NotebookTask::isCompleted) // Фильтрация выполненных задач
                .collect(Collectors.toList());

        if (completed.isEmpty()) {
            System.out.println("Нет выполненных задач");
            return;
        }
        System.out.println("\nВыполненные задачи:");
        completed.forEach(System.out::println); // Вывод выполненных задач
    }

    // Метод для отображения задач с высоким приоритетом
    public void showHighPriorityTasks() {
        List<NotebookTask> highPriority = tasks.stream()
                .filter(t -> t.getPriority() == NotebookTask.Priority.HIGH) // Фильтрация задач с высоким приоритетом
                .collect(Collectors.toList());

        if (highPriority.isEmpty()) {
            System.out.println("Нет задач с высоким приоритетом");
            return;
        }
        System.out.println("\nВысокий приоритет (" + highPriority.size() + "):");
        highPriority.forEach(System.out::println); // Вывод задач с высоким приоритетом
    }

    // Метод для отображения всех задач
    public void showAllTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Список задач пуст");
            return;
        }
        System.out.println("\nВсе задачи (" + tasks.size() + "):");
        tasks.forEach(System.out::println); // Вывод всех задач
    }

    // Метод для сохранения задач в файл
    public void saveToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (NotebookTask task : tasks) {
                writer.write(task.toString()); // Запись задачи в файл
                writer.newLine(); // Переход на новую строку
            }
            System.out.println("Задачи сохранены в файл: " + filename); // Сообщение об успешном сохранении
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage()); // Обработка ошибок
        }
    }

    // Метод для выполнения задачи по описанию
    public void completeTask(String description) {
        for (NotebookTask task : tasks) {
            if (task.getDescription().equalsIgnoreCase(description)) {
                task.completeTask();
                return;
            }
        }
        System.out.println("Задача не найдена: " + description);
    }
}