package Homerwork.Practica.Practica25.CorporateSystem;
//Шаг 1: Создание базового класса Employee
//✔ Поля name (имя), position (должность) и salary (зарплата).
//✔ Метод work(), который просто выводит "Работник выполняет свои обязанности.".
public class Employee {
    protected String name;
    protected String position;
    protected double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }


    public void work() {
        System.out.println("Работник выполняет свои обязанности.");
    }

}
