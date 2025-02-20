package Lessons.Lesson_26.student_code;

public class Dog extends Animal{
    public Dog(String name, int age, Client owner) {
        super(name, age, owner);
    }

    public void bark() {
        System.out.println(getName() + " гавкает!");
    }
}
