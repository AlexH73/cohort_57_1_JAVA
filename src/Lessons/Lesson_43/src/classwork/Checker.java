package Lessons.Lesson_43.src.classwork;

// Определение функционального интерфейса
@FunctionalInterface
interface Checker<T> {
    boolean check(T t);
}
