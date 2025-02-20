package Lessons.Lesson_26.student_code;

public class Animal {
    private String name;
    private int age;
    private Client owner;

    public Animal(String name, int age, Client owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + ", " + age + " лет, Владелец: " + owner.getName();
    }
}
