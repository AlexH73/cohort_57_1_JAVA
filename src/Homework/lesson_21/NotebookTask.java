package Homework.lesson_21;

// Класс задачи с приоритетом
public class NotebookTask {
    private String description;
    private Priority priority;

    // Перечисление для приоритетов задач
    public enum Priority {
        HIGH, MEDIUM, LOW
    }

    // Конструктор задачи
    public NotebookTask(String description, Priority priority) {
        this.description = description;
        this.priority = priority;
    }

    // Геттер для описания задачи
    public String getDescription() {
        return description;
    }

    // Геттер для приоритета задачи
    public Priority getPriority() {
        return priority;
    }

    // Метод для строкового представления задачи
    @Override
    public String toString() {
        return "[" + priority + "] " + description;
    }
}
