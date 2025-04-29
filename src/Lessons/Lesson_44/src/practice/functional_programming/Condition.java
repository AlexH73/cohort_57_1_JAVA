package Lessons.Lesson_44.src.practice.functional_programming;

/**
 * Интерфейс с методом, принимающим один аргумент и возвращающим булево значение (аналог Predicate):
 */
@FunctionalInterface
interface Condition<T> {
    boolean test(T t);
}
