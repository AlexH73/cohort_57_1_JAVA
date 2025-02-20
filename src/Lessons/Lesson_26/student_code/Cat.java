package Lessons.Lesson_26.student_code;

public class Cat extends Animal {

    public Cat(String name, int age, Client owner) {
        super(name, age, owner);
    }

    public void meow() {
        System.out.println("Мяу!");
    }
}
