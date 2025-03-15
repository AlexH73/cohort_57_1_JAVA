package Lessons.Lesson_30.classwork;

public class Task {
    private String taskDescription; // Описание задачи
    private String deadlineDate; //  Дата выполнения в формате "YYYY-mm-dd"
    private int priority;// Приоритет от 0 (высший) до 10 (низший)

    // Основной конструктор
    public Task(String taskDescription, String deadlineDate, int priority) {
        this.taskDescription = taskDescription;
        this.deadlineDate = deadlineDate;
        this.priority = priority;
    }

    // Вспомогательный конструктор с значениями по умолчанию
    public Task(String taskDescription) {
        this(taskDescription, "2025-04-11", 5); // Вызов основного конструктора
    }

    // Геттеры и сеттеры
    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getDeadlineDate() {
        return deadlineDate;
    }

    public void setDeadlineDate(String deadlineDate) {
        this.deadlineDate = deadlineDate;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
