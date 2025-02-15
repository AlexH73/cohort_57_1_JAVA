package Practice.Practice_24.the_working_team;

public class Main {

    public static void main(String[] args) {
        // Создание объектов разных типов сотрудников
        Employee employee = new Employee("Иван", "Работник", 50000);
        Manager manager = new Manager("Алексей", "Менеджер", 100000, 10);
        Developer developer = new Developer("Анна", "Разработчик", 80000, "Java");
        Intern intern = new Intern("Петр", "Стажёр", 20000, 6);

        // Вызов метода work() у каждого объекта
        employee.work(); // Ожидается: Работник выполняет свои обязанности.
        manager.work(); // Ожидается: Работник выполняет свои обязанности. Менеджер управляет командой и проводит встречи.
        developer.work(); // Ожидается: Разработчик пишет код на Java.
        intern.work(); // Ожидается: Стажёр учится и помогает команде.
    }
}
