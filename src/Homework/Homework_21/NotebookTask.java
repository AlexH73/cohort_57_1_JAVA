package Homework.Homework_21;

public class NotebookTask {
    public enum Priority {HIGH, MEDIUM, LOW}

    private String description;
    private Priority priority;
    private boolean isCompleted; // Новая функция: статус выполнения

    public NotebookTask(String description, Priority priority) {
        this.description = description;
        this.priority = priority;
        this.isCompleted = false; // По умолчанию задача не выполнена
    }

    // Геттеры и сеттеры
    public Priority getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    // Метод для пометки задачи как выполненной
    public void completeTask() {
        this.isCompleted = true;
        System.out.println("Задача выполнена: " + description);
    }

    @Override
    public String toString() {
        String status = isCompleted ? "[✓]" : "[ ]";
        return status + " [" + priority + "] " + description;
    }
}
