package Lessons.Lesson_26.student_code;

public class Person {
    private int age;
    private String name;
    private String phoneNumber;

    public Person(String name, int age, String phoneNumber) {
        this.age = age;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + ", " + age + " лет, телефонный номер: " + phoneNumber;
    }
}
