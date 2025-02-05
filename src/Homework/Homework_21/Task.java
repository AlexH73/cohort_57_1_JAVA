package Homework.Homework_21;

public class Task {
    String title;
    String description;
    String status;
    int priority; // Добавляем поле для приоритета

    // Конструктор класса Task
    public Task(String taskTitle, String taskDescription, String taskStatus, int taskPriority) {
        title = taskTitle;
        description = taskDescription;
        status = taskStatus;
        priority = taskPriority;
    }

    // Метод для установки значений полей задачи
    public void setTask(String taskTitle, String taskDescription, String taskStatus, int taskPriority) {
        title = taskTitle;
        description = taskDescription;
        status = taskStatus;
        priority = taskPriority;
    }

    // Метод для обновления статуса задачи на "Completed"
    public void updateStatus() {
        status = "Completed";
    }

    // Метод для проверки, является ли задача высокоприоритетной
    public boolean isHighPriority() {
        return priority < 3;
    }

    // Метод для отображения информации о задаче
    public void displayTask() {
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Status: " + status);
        System.out.println("Priority: " + priority + " (" + getPriorityClassification() + ")");
    }

    // Метод для получения классификации приоритета
    private String getPriorityClassification() {
        if (priority < 3) {
            return "High";
        } else if (priority < 6) {
            return "Medium";
        } else {
            return "Low";
        }
    }

    // Переопределение метода toString
    @Override
    public String toString() {
        return "Task {" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", priority=" + priority + " (" + getPriorityClassification() + ")" +
                '}';
    }
}
