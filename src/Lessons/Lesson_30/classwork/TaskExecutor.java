package Lessons.Lesson_30.classwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Реализация интерфейса управления задачами
public class TaskExecutor implements TaskExecutorInterface {
    private List<Task> tasks; // Список задач

    // Конструктор с защитным копированием
    public TaskExecutor(List<Task> tasks) {
        this.tasks = new ArrayList<>(tasks); // Защитное копирование
    }

    @Override
    // Получение задачи с самым высоким приоритетом
    public Task getTaskByPriority() {
        if (tasks.isEmpty()) return null; // Проверка на пустой список
        List<Task> sorted = new ArrayList<>(tasks); // Копируем список
        sorted.sort(new PriorityComparator());
        // Collections.sort(sorted, new PriorityComparator()); // Сортируем
        return sorted.get(0); // Возвращаем первый элемент
    }

    @Override
    // Получение задачи с ближайшей датой
    public Task getTaskByDate() {
        if (tasks.isEmpty()) return null;
        List<Task> sorted = new ArrayList<>(tasks);
        sorted.sort(new DateComparator());
        // Collections.sort(sorted, new DateComparator());
        return sorted.get(0);
    }

    // Метод для вывода всех задач
    public void printAllTasks() {
        System.out.println("\nТекущие задачи:");
        for (Task task : tasks) {
            System.out.printf(
                    "%-25s | Приоритет: %2d | Дата: %s%n",
                    task.getTaskDescription(),
                    task.getPriority(),
                    task.getDeadlineDate()
            );
        }
    }

    // Дополнительный метод для добавления задач
    public void addTask(Task task) {
        tasks.add(task);
    }
}
