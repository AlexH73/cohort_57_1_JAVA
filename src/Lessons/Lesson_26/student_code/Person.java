package Lessons.Lesson_26.student_code;

public class Person {
    private String name;
    private int age;
    private String phoneNumber;

    public Person(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + ", " + age + " лет, Тел: " + phoneNumber;
    }
}
