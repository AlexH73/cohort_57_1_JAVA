package Homework.Homework_21;

public class NotebookUsage {
    public static void main(String[] args) {
        // Создание объекта блокнота
        Notebook workJournal = new Notebook();

        // Создание объектов задач
        NotebookTask[] tasks = {
                new NotebookTask("Сделать домашнее задание", NotebookTask.Priority.HIGH),
                new NotebookTask("Подготовить отчет", NotebookTask.Priority.HIGH),
                new NotebookTask("Купить продукты", NotebookTask.Priority.MEDIUM),
                new NotebookTask("Позвонить другу", NotebookTask.Priority.LOW),
                new NotebookTask("Исправить критический баг", NotebookTask.Priority.HIGH),
                new NotebookTask("Сходить в спортзал", NotebookTask.Priority.MEDIUM),
                new NotebookTask("Прочитать книгу", NotebookTask.Priority.LOW),
                new NotebookTask("Написать тесты для нового функционала", NotebookTask.Priority.HIGH),
                new NotebookTask("Создать резервную копию базы данных", NotebookTask.Priority.MEDIUM),
                new NotebookTask("Обновить документацию проекта", NotebookTask.Priority.LOW),
                new NotebookTask("Провести ревизию кода", NotebookTask.Priority.HIGH),
                new NotebookTask("Настроить CI/CD pipeline", NotebookTask.Priority.MEDIUM)
        };

        // Добавляем задачи в блокнот через цикл for
        for (NotebookTask task : tasks) {
            workJournal.addTask(task);
        }

        // Помечаем первую задачу как выполненную
        workJournal.completeTask("Сделать домашнее задание");

        // Удаляем выполненную задачу
        workJournal.removeTask("Сделать домашнее задание");

        // Сортируем задачи по приоритету
        workJournal.sortTasksByPriority();

        // Отображаем все задачи
        workJournal.showAllTasks();

        // Отображаем задачи с высоким приоритетом
        workJournal.showHighPriorityTasks();

        // Отображаем выполненные задачи
        workJournal.showCompletedTasks();

        // Сохраняем задачи в файл
        workJournal.saveToFile("tasks.txt");
    }
}