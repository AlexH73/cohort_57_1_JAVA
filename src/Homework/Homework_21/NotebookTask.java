package Homework.Homework_21;

// Класс задачи с приоритетом
public class NotebookTask {
    public enum Priority { HIGH, MEDIUM, LOW }

    private String description; // Описание задачи
    private Priority priority; // Приоритет задачи
    private boolean isCompleted; // Флаг выполнения задачи

    // Конструктор задачи
    public NotebookTask(String description, Priority priority) {
        this.description = description;
        this.priority = priority;
        this.isCompleted = false;
    }

    // Геттер для приоритета задачи
    public Priority getPriority() { return priority; }

    // Геттер для описания задачи
    public String getDescription() { return description; }

    // Геттер для состояния выполнения задачи
    public boolean isCompleted() { return isCompleted; }

    // Метод для установки задачи как выполненной
    public void completeTask() {
        if (!isCompleted) { // Проверяем, не выполнена ли задача уже
            this.isCompleted = true;
            System.out.println("Задача выполнена: " + description);
        } else {
            System.out.println("Задача уже была выполнена: " + description);
        }
    }

    // Метод для строкового представления задачи
    @Override
    public String toString() {
        String status = isCompleted ? "[✓]" : "[ ]";
        return status + " [" + priority + "] " + description;
    }
}