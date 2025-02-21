package Hausaufgaben.Hausaufgaben_21.Task;

public class Task {
    String title;
    String description;
    String status;
    int priority;

    public Task(String taskTitle, String taskDescription, String taskStatus, int taskPriority) {
        title = taskTitle;
        description = taskDescription;
        status = taskStatus;
        priority = taskPriority;
    }

    public void setTask(String taskTitle, String taskDescription, String taskStatus, int taskPriority) {
        title = taskTitle;
        description = taskDescription;
        status = taskStatus;
        priority = taskPriority;
    }

    public void updateStatus() {
        status = "Completed";
    }

    public boolean isHighPriority() {
        return priority < 3;
    }

    public void displayTask() {
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Status: " + status);
        System.out.println("Priority: " + priority + " (" + getPriorityClassification() + ")");
    }

    private String getPriorityClassification() {
        if (priority < 3) {
            return "High";
        } else if (priority < 6) {
            return "Medium";
        } else {
            return "Low";
        }
    }

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

