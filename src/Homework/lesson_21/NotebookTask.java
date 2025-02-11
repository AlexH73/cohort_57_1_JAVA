package Homework.lesson_21;

import java.util.ArrayList;
import java.util.List;

/*Дополнительное задание (необязательное, для продвинутых студентов)
Создать новый класс Notebook, который будет хранить список задач (Task). Реализовать:

Поле tasks (список задач).
Метод addTask(Task task), который добавляет задачу в список.
Метод showAllTasks(), который выводит все задачи.
Метод showHighPriorityTasks(), который выводит только задачи с высоким приоритетом.
Протестировать, создав Notebook и несколько задач.*/
/*public class NotebookTask {
    //Поле Task хранит список задач
    List<Task> tasks;
    //Конструктор для инициализации списка задач
    public NotebookTask() {
        tasks = new ArrayList<>();
    }

    //Метод addTask(Task task), который добавляет задачу в список
    public void addTask(Task task) {
        tasks.add(task);
    }
   //Метод showAllTasks(), который выводит все задачи
    public void showAllTasks() {
        System.out.println("Все задачи в блокноте: ");
        for (Task task : tasks) {
            task.displayTask();
        }
    }
    //Метод showHighPriorityTasks(), который выводит только задачи с высоким приоритетом
    public void showHighPriorityTasks() {
        System.out.println("Задачи с высоким приоритетом:");
        for (Task task : tasks) {
            if (task.isHighPriority()) {
                task.displayTask();
            }
        }
    }


}
*/