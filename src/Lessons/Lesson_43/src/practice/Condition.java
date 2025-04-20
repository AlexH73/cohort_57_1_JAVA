package Lessons.Lesson_43.src.practice;

/**
 * Интерфейс с методом, принимающим один аргумент и возвращающим булево значение (аналог Predicate):
 */
@FunctionalInterface
public interface Condition<T> {
    boolean test(T t);
}
