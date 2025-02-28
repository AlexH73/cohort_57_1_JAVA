package Homework.lesson_26.HomeworkYulia_26;

public class MessyPerson {

    private String name;
    private int age;

    public MessyPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + " | Age: " + age);
    }

    public static void main(String[] args) {
        MessyPerson person = new MessyPerson("Alice", 25);
        person.display();
    }
}