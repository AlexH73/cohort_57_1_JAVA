// Задание 3: Расширение класса Task
//добавить поле priority (целое число), которое обозначает приоритет задачи (чем меньше число, тем выше приоритет).
//Реализовать метод isHighPriority(), который возвращает true, если приоритет задачи меньше 3, и false в противном случае.
//В методе displayTask() добавить вывод приоритета и его классификацию (например, "Высокий", "Средний", "Низкий").
//Протестировать код создав несколько задач.

package Homework.lesson_21.HomeworkYulia_21;

public class Task {
    String title;
    String description;
    int priority;

    public Task(String title, String description, int priority) {

        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    public boolean isHighPriority() {
        return priority < 3;
    }

    private String getPriorityLevel() {
        if (priority < 3) {
            return "Высокий";
        } else if (priority <= 5) {
            return "Средний";
        } else {
            return "Низкий";
        }
    }

    public void displayTask() {
        System.out.println("Задача: " + title);
        System.out.println("Описание: " + description);
        System.out.println("Приоритет: " + priority + " (" + getPriorityLevel() + ")");
        System.out.println("Высокий приоритет? " + (isHighPriority() ? "Да" : "Нет"));
        System.out.println("---------------------------");

    }
}
