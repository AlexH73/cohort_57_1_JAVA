package Lessons.Lesson_30.classwork;

import java.util.Comparator;

// Компаратор для сравнения задач по дате выполнения
public class DateComparator implements Comparator<Task> {
    @Override
    // Сравниваем две задачи по их дедлайну
    public int compare(Task o1, Task o2) {
        // Используем встроенное сравнение строк, так как дата в формате YYYY-MM-DD
        return o1.getDeadlineDate().compareTo(o2.getDeadlineDate());
    }
}
