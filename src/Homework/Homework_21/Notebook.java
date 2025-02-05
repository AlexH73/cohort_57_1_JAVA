package Homework.Homework_21;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Notebook {
    private List<NotebookTask> tasks = new ArrayList<>();

    // Основные методы
    public void addTask(NotebookTask task) {
        tasks.add(task);
        System.out.println("Добавлена: " + task);
    }

    // Новый метод: удаление задачи по описанию
    public void removeTask(String description) {
        boolean removed = tasks.removeIf(t -> t.getDescription().equalsIgnoreCase(description));
        System.out.println(removed ? "Задача удалена: " + description : "Задача не найдена: " + description);
    }

    // Новый метод: сортировка задач по приоритету
    public void sortTasksByPriority() {
        tasks.sort(Comparator.comparingInt(t ->
                t.getPriority().ordinal() // HIGH=0, MEDIUM=1, LOW=2
        ));
        System.out.println("Задачи отсортированы по приоритету");
    }

    // Новый метод: вывод выполненных задач
    public void showCompletedTasks() {
        List<NotebookTask> completed = tasks.stream()
                .filter(NotebookTask::isCompleted)
                .collect(Collectors.toList());

        if (completed.isEmpty()) {
            System.out.println("Нет выполненных задач");
            return;
        }
        System.out.println("\nВыполненные задачи:");
        completed.forEach(System.out::println);
    }

    // Новый метод: сохранение в файл
    public void saveToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (NotebookTask task : tasks) {
                writer.write(task.toString());
                writer.newLine();
            }
            System.out.println("Задачи сохранены в файл: " + filename);
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }

    // Существующие методы с улучшениями
    public void showAllTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Список задач пуст");
            return;
        }
        System.out.println("\nВсе задачи (" + tasks.size() + "):");
        tasks.forEach(System.out::println);
    }

    public void showHighPriorityTasks() {
        List<NotebookTask> highPriority = tasks.stream()
                .filter(t -> t.getPriority() == NotebookTask.Priority.HIGH)
                .collect(Collectors.toList());

        if (highPriority.isEmpty()) {
            System.out.println("Нет задач с высоким приоритетом");
            return;
        }
        System.out.println("\nВысокий приоритет (" + highPriority.size() + "):");
        highPriority.forEach(System.out::println);
    }
}
