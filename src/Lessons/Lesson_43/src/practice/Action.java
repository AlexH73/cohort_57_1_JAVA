package Lessons.Lesson_43.src.practice;


/**
 * Интерфейс с методом, принимающим один аргумент и ничего не возвращающим (аналог Consumer):
 */
@FunctionalInterface
interface Action<T> {
    void execute(T t);
}
