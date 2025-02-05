package Homework.lesson_21;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Класс блокнота для управления задачами
public class Notebook {
    private List<NotebookTask> tasks = new ArrayList<>();

    // Метод для добавления задачи в блокнот
    public void addTask(NotebookTask task) {
        tasks.add(task);
        System.out.println("Добавлена задача: " + task);
    }

    // Метод для отображения всех задач
    public void showAllTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Список задач пуст");
            return;
        }

        System.out.println("\nВсе задачи:");
        tasks.forEach(System.out::println);
    }

    // Метод для отображения задач с высоким приоритетом
    public void showHighPriorityTasks() {
        List<NotebookTask> highPriority = tasks.stream()
                .filter(t -> t.getPriority() == NotebookTask.Priority.HIGH)
                .collect(Collectors.toList());

        if (highPriority.isEmpty()) {
            System.out.println("\nНет задач с высоким приоритетом");
            return;
        }

        System.out.println("\nЗадачи с высоким приоритетом:");
        highPriority.forEach(System.out::println);
    }
}
