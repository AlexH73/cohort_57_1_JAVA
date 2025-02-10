package consultations.c10.l21_task_4;


public class Notebook {
    Task[] tasks;
    int MAX_SIZE = 3;

    public Notebook() {
        this.tasks = new Task[this.MAX_SIZE];
    }

    boolean addTask(Task task) {
        for (int i = 0; i < this.tasks.length; i++) {
            if (this.tasks[i] != null) {
                continue;
            }

            this.tasks[i] = task;
            return true;
        }

        return false;
    }

    public void showAllTasks() {
        for (Task task: this.tasks) {
            if (task != null) {
                task.displayTask();
            }
        }
    }

    public void showHighPriorityTasks() {
        // Метод showHighPriorityTasks(), который выводит только задачи с высоким приоритетом.
        for (Task task: this.tasks) {
            if (task != null && task.isHighPriority()) {
                task.displayTask();
            }
        }
    }

    public void addTask(Homework.lesson_21.Task task1) {
    }
}
