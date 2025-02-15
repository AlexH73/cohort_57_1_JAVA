package Practice.Practice_24.the_working_team;

/**
 * Шаг 1: Создание базового класса Employee
 * <p>
 * ✔ Поля name (имя), position (должность) и salary (зарплата).
 * ✔ Метод work(), который просто выводит "Работник выполняет свои обязанности.".
 */
public class Employee {
    private String name, position;
    private double salary;

    // Конструктор
    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    // Метод work()
    public void work() {
        System.out.println("\nРаботник выполняет свои обязанности.");
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
