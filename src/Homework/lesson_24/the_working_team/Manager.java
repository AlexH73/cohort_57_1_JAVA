package Homework.lesson_24.the_working_team;

public class Manager extends Employee {

    // Конструктор
    public Manager(String name, String position) {
        super(name, position);
    }

    // Переопределение метода work()
    @Override
    public void work() {
        super.work();
        System.out.println("Проводит встречи.");
    }
}
