package Lessons.Lesson_30.classwork;

public class Task {
    private String taskDescription;
    private String deadlineDate; // format "YYYY-mm-dd"
    private int priority;// от 0 до 10, 0 - низкий приоритет, 10 - самый высокий приоритет

    public Task(String taskDescription, String deadlineDate, int priority) {
        this.taskDescription = taskDescription;
        this.deadlineDate = deadlineDate;
        this.priority = priority;
    }

    public Task(String taskDescription) {
        this.taskDescription = taskDescription;
        this.priority = 5;
        this.deadlineDate = "2025-04-11";
    }

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

    public static void main(String[] args) {
        Task task = new Task("Создать класс Task", "2025-04-11", 10);
    }
}
