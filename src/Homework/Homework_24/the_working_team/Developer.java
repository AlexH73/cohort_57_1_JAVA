package Homework.Homework_24.the_working_team;

public class Developer extends Employee {

    // Конструктор
    public Developer(String name, String position) {
        super(name, position);
    }

    // Переопределение метода work()
    @Override
    public void work() {
        super.work();
        System.out.println("Пишет код.");
    }
}
