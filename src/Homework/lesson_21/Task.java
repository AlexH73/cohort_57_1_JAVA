package Homework.lesson_21;
/*Задание 3: Расширение класса Task
Добавить поле priority (целое число), которое обозначает приоритет задачи (чем меньше число, тем выше приоритет).
Реализовать метод isHighPriority(), который возвращает true, если приоритет задачи меньше 3,
и false в противном случае.
В методе displayTask() добавить вывод приоритета и его классификацию (например, "Высокий", "Средний", "Низкий").
Протестировать код создав несколько задач.*/
public class Task {
    String description;
    int priority;

    //Конструктор для инициализации задачи
    public Task(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }
    //метод isHighPriority(), который возвращает true, если приоритет задачи меньше 3
    // Метод для проверки, является ли задача высокоприоритетной
    public boolean isHighPriority() {
        return priority < 3;
    }
    //Метод для получения классификации приоритета
    public String getPriorityClassification() {
        if (priority < 3) {
            return "Высокий";
        } else if (priority < 6) {
            return "Средний";
        } else {
            return "Низкий";
        }
    }
    //Метод displayTask() выводит информацию о задаче, включая описание, числовой приоритет и его классификацию,
    // а также пометку, является ли задача высокоприоритетной
    public void displayTask() {
        System.out.println("Задача: " + description);
        System.out.println("Приоритет: " + priority + "(" + getPriorityClassification() + ")");
        System.out.println("------------------------------");
    }


}


