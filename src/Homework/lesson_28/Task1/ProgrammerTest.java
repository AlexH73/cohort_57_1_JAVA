package Homework.lesson_28.Task1;

public class ProgrammerTest {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("ALF");
        programmer.addTechnology("Java");
        programmer.addTechnology("Git");
        programmer.addTechnology("Java");

        System.out.println("Список технологий: " + programmer.getTechnologies());
        System.out.println("Владеет ли ALF Java ? " + programmer.hasTechnology("Java"));
        System.out.println("Владеет ли ALF Python ? " + programmer.hasTechnology("Python"));
    }
}
