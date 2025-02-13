package Lessons.Lesson_24.teachers_code.animal_example;

public class Cat extends Animal {
    public void hunt() {
        System.out.println("Кот охотиться");
    }

    @Override
    public void feed() {
        System.out.println("кот ест");
    }
}
