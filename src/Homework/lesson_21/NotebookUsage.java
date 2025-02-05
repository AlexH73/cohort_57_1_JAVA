package Homework.lesson_21;

public class NotebookUsage {
    /**
     * <h1>Дополнительное задание (необязательное, для продвинутых студентов)</h1>
     * Создать новый класс `Notebook`, который будет хранить список задач (`Task`).
     * <p>
     * <b>Реализовать:</b><br>
     * 1. Поле `tasks` (список задач).<br>
     * 2. Метод `addTask(Task task)`, который добавляет задачу в список.<br>
     * 3. Метод `showAllTasks()`, который выводит все задачи.<br>
     * 4. Метод `showHighPriorityTasks()`, который выводит только задачи с высоким приоритетом.<br>
     * 5. Протестировать, создав `Notebook` и несколько задач.
     */
    public static void main(String[] args) {
        Notebook myNotebook = new Notebook();

        // Создаем массив задач
        NotebookTask[] tasks = {
                new NotebookTask("Сделать домашнее задание", NotebookTask.Priority.HIGH),
                new NotebookTask("Подготовить отчет", NotebookTask.Priority.HIGH),
                new NotebookTask("Купить продукты", NotebookTask.Priority.MEDIUM),
                new NotebookTask("Позвонить другу", NotebookTask.Priority.LOW),
                new NotebookTask("Исправить критический баг", NotebookTask.Priority.HIGH),
                new NotebookTask("Сходить в спортзал", NotebookTask.Priority.MEDIUM),
                new NotebookTask("Прочитать книгу", NotebookTask.Priority.LOW)
        };

        // Добавляем задачи в блокнот через цикл for
        for (NotebookTask task : tasks) {
            myNotebook.addTask(task);
        }

        // Тестируем методы блокнота
        myNotebook.showAllTasks();
        myNotebook.showHighPriorityTasks();
    }
}
