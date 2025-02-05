package Homework.Homework_21;

public class NotebookUsage {
    public static void main(String[] args) {
        Notebook workJournal = new Notebook();

        // Создаем задачи
        NotebookTask t1 = new NotebookTask("Подготовить презентацию", NotebookTask.Priority.HIGH);
        NotebookTask t2 = new NotebookTask("Заказать канцтовары", NotebookTask.Priority.MEDIUM);
        NotebookTask t3 = new NotebookTask("Обновить ПО на компьютерах", NotebookTask.Priority.HIGH);
        NotebookTask t4 = new NotebookTask("Проверить почту", NotebookTask.Priority.LOW);

        // Добавляем задачи
        workJournal.addTask(t1);
        workJournal.addTask(t2);
        workJournal.addTask(t3);
        workJournal.addTask(t4);

        // Демонстрация новых функций
        t1.completeTask(); // Помечаем задачу как выполненную
        workJournal.removeTask("Проверить почту"); // Удаляем задачу

        workJournal.sortTasksByPriority(); // Сортируем по приоритету
        workJournal.showAllTasks(); // Показываем все задачи
        workJournal.showCompletedTasks(); // Показываем выполненные

        workJournal.saveToFile("tasks.txt"); // Сохраняем в файл
    }
}
