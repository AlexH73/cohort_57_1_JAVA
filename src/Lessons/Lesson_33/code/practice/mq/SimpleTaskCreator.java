package Lessons.Lesson_33.code.practice.mq;

public class SimpleTaskCreator {
    private SimpleManager manager;

    public SimpleTaskCreator(SimpleManager manager) {
        this.manager = manager;
    }

    public void setTasksToQueue(int tasks) throws InterruptedException {
        for (int i = 0; i < tasks; i++) {
            Integer time = 100;
            Task task = new Task("Task N " + i);
            System.out.printf("Creation  %s,  time %5d ms Queue\n", task.getTaskName(), time);
            Thread.sleep(time);
            manager.addTaskToQueue(task);
        }
    }

    public void setTasksToStack(int tasks) throws InterruptedException {
        for (int i = 0; i < tasks; i++) {
            Integer time = 100;
            Task task = new Task("Task N " + i);
            System.out.printf("Creation  %s,  time %5d ms Stack\n", task.getTaskName(), time);
            Thread.sleep(time);
            manager.addTaskToStack(task);
        }
    }
}
