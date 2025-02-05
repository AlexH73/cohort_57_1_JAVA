package Practice.Practice_21;

public class TaskUsage {
    public static void main(String[] args) {
        // Создаем несколько объектов Task
        Task task1 = new Task("Finish Homework", "Complete the math homework", "New");
        Task task2 = new Task("Clean Room", "Tidy up the room and organize the desk", "In Progress");
        Task task3 = new Task("Buy Groceries", "Purchase vegetables, fruits, and milk", "New");
        Task task4 = new Task("Read Book", "Read the first 100 pages of the new novel", "Completed");
        Task task5 = new Task("Exercise", "Do a 30-minute workout session", "New");

        // Массив задач
        Task[] tasks = {task1, task2, task3, task4, task5};

        // Выводим информацию о каждой задаче
        System.out.println("\nAll tasks:");
        for (int i = 0; i < tasks.length; i++) {
            System.out.println("\nTask " + (i + 1) + ":");
            tasks[i].displayTask();
            System.out.println("toString = " + tasks[i].toString());
        }

        // Обновляем статус задачи и выводим информацию снова
        System.out.println("\nUpdating statuses...");
        task1.updateStatus("In Progress");
        task3.updateStatus("Completed");

        System.out.println("\nUpdated tasks:");
        for (int i = 0; i < tasks.length; i++) {
            System.out.println("\nTask " + (i + 1) + ":");
            tasks[i].displayTask();
            System.out.println("toString = " + tasks[i].toString());
        }
    }
}
