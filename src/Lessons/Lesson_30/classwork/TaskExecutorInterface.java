package Lessons.Lesson_30.classwork;

public interface TaskExecutorInterface {
    // возвращает задачу с самым высоким приоритетом
    public Task getTaskByPriority();

    // возвращает задачу с самым близким дедлайном
    public Task getTaskByDate();
}
