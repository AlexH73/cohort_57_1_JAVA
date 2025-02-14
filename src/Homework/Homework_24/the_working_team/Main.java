package Homework.Homework_24.the_working_team;

public class Main {
    public static void main(String[] args) {
        // Тестирование классов Employee, Manager и Developer
        Employee employee = new Employee("Иван", "Работник");
        Manager manager = new Manager("Алексей", "Менеджер");
        Developer developer = new Developer("Анна", "Разработчик");

        employee.work(); // Ожидается: Работник выполняет свою работу.
        manager.work(); // Ожидается: Работник выполняет свою работу. Проводит встречи.
        developer.work(); // Ожидается: Работник выполняет свою работу. Пишет код.
    }
}
