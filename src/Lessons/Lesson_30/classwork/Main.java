package Lessons.Lesson_30.classwork;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем список задач
        List<Task> tasks = new ArrayList<>();

        // Добавляем разнообразные задачи
        tasks.add(new Task("Подготовить отчет"));
        tasks.add(new Task("Проверить почту", "2023-11-15", 5));
        tasks.add(new Task("Обновить систему", "2023-12-01", 1));
        tasks.add(new Task("Встреча с командой", "2023-11-17", 3));
        tasks.add(new Task("Тестирование нового функционала", "2023-11-25", 4));

        // Создаем исполнителя задач
        TaskExecutor executor = new TaskExecutor(tasks);

        // Добавляем еще одну задачу динамически
        executor.addTask(new Task("Резервное копирование данных", "2023-11-16", 0));

        // Выводим все задачи
        executor.printAllTasks();

        // Получаем и выводим самые важные задачи
        System.out.println("\nСамая приоритетная задача: " +
                executor.getTaskByPriority().getTaskDescription());

        System.out.println("Самая срочная задача: " +
                executor.getTaskByDate().getTaskDescription());
    }
}
