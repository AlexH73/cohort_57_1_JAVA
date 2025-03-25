package Lessons.Lesson_30.classwork;

import java.util.Comparator;

// Компаратор для сравнения задач по приоритету
public class PriorityComparator implements Comparator<Task> {
    @Override
    // Сравниваем задачи по приоритету (чем меньше число, тем выше приоритет)
    public int compare(Task o1, Task o2) {
        // Обратный порядок сортировки, так как 0 - высший приоритет
        return Integer.compare(o1.getPriority(), o2.getPriority());
    }
}
