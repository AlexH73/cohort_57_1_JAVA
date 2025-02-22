package Hausaufgaben.Hausaufgaben_24.Employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee[] employees = {
            new Manager("Karl", "Manager"),
            new Developer("Max", "Developer")
        };

        for (Employee employee: employees) {
            employee.work();
        }
    }
}
