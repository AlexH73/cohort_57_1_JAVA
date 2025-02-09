package consultations.c10.l21_task_4;

public class Main {
    public static void main(String[] args) {
        Task task1 = new Task("зарядка", 1, "запланировано");
        Task task2 = new Task("позавтракать", 2, "запланировано");
        Task task3 = new Task("почесать кота", 5, "сделано");

        Notebook notebook = new Notebook();
        notebook.addTask(task1);
        notebook.addTask(task2);
        notebook.addTask(task3);

        notebook.showAllTasks();

        System.out.println("-------");

        notebook.showHighPriorityTasks();
    }
}
