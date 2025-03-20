package Lessons.Lesson_33.code.practice.mq;

public class SimpleConsumer {
    private SimpleManager manager;

    public SimpleConsumer(SimpleManager manager) {
        this.manager = manager;
    }

    public void listenQueue() throws InterruptedException {
        while (true) {
            Task task = manager.getTaskFromQueue();
            Integer time = 500;
            if (task != null) {
                System.out.printf("Execution %s,  time %5d ms Queue\n", task.getTaskName(), time);
            }
            Thread.sleep(time);
        }
    }

    public void listenStack()  {
        while (true) {

            Task task = manager.getTaskFromStack();
            Integer time = 500;
            if (task != null) {
                System.out.printf("Execution %s,  time %5d ms Stack\n", task.getTaskName(), time);
            }
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
            }
        }
    }
}
