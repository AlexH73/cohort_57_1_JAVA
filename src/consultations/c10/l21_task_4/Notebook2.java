package consultations.c10.l21_task_4;

import java.util.ArrayList;
import java.util.List;


public class Notebook2 {
    List<Task> tasks;

    public Notebook2() {
        this.tasks = new ArrayList<>();
    }

    boolean addTask(Task task) {
        this.tasks.add(task);
        return true;
    }

    void showAllTasks() {
        for (Task task: this.tasks) {
            task.displayTask();
        }
    }

    void showHighPriorityTasks() {
        for (Task task: this.tasks) {
            if (task.isHighPriority()) {
                task.displayTask();
            }
        }
    }
}
