package consultations.c10.l21_task_4;


public class Task {
    String title;
    String status;
    int priority;

    public Task(String title, int priority, String status) {
        this.title = title;
        this.priority = priority;
        this.status = status;
    }

    void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    boolean isHighPriority() {
        return this.priority < 3;
    }

    void displayTask() {
        System.out.printf(
            "\n%s. %s - %s\n",
            this.priority,
            this.title, this.status
        );
    }
}
