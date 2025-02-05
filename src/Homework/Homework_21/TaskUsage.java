package Homework.Homework_21;

public class TaskUsage {
    /**
     * <h1>Задание 3: Расширение класса Task</h1>
     * <p>
     *     Добавить поле priority (целое число), которое обозначает
     *     приоритет задачи (чем меньше число, тем выше приоритет).
     *     Реализовать метод isHighPriority(), который возвращает true,
     *     если приоритет задачи меньше 3, и false в противном случае.
     *     В методе displayTask() добавить вывод приоритета и его
     *     классификацию (например, "Высокий", "Средний", "Низкий").
     *     Протестировать код создав несколько задач.
     */
    public static void main(String[] args) {
        // Создаем несколько объектов Task
        Task task1 = new Task("Finish Homework", "Complete the math homework", "New", 1);
        Task task2 = new Task("Clean Room", "Tidy up the room and organize the desk", "In Progress", 4);
        Task task3 = new Task("Buy Groceries", "Purchase vegetables, fruits, and milk", "New", 2);
        Task task4 = new Task("Read Book", "Read the first 100 pages of the new novel", "Completed", 5);
        Task task5 = new Task("Exercise", "Do a 30-minute workout session", "New", 6);

        // Массив задач
        Task[] tasks = {task1, task2, task3, task4, task5};

        // Выводим информацию о каждой задаче
        System.out.println("\nAll tasks:");
        for (int i = 0; i < tasks.length; i++) {
            System.out.println("\nTask " + (i + 1) + ":");
            tasks[i].displayTask();
            System.out.println("Is high priority? " + tasks[i].isHighPriority());
            System.out.println("toString: " + tasks[i].toString());
        }

        // Обновляем статус задачи и выводим информацию снова
        System.out.println("\nUpdating statuses...");
        task1.updateStatus();
        task3.updateStatus();

        System.out.println("\nUpdated tasks:");
        for (int i = 0; i < tasks.length; i++) {
            System.out.println("\nTask " + (i + 1) + ":");
            tasks[i].displayTask();
            System.out.println("toString: " + tasks[i].toString());
        }
    }
}
