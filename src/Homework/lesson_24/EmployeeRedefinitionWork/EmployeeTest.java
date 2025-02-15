package Homework.lesson_24.EmployeeRedefinitionWork;

//Тестовый класс
public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Иван", "Работник");
        employee.work();

        System.out.println();

        Manager manager = new Manager("Татьяна");
        manager.work();

        System.out.println();

        Developer developer = new Developer("Максим");
        developer.work();

    }
}
