package Homework.Homework_24.the_working_team;

public class Developer extends Manager {

    // Конструктор
    public Developer(String name, String position) {
        super(name, position);
    }

    // Переопределение метода work()
    @Override
    public void work() {
        System.out.println("\nРаботник выполняет свою работу.");
        System.out.println("Пишет код.");
    }
}
