package Hausaufgaben.Hausaufgaben_24.Employee;

// В этих заданиях вам нужно переопределить методы в дочерних классах и использовать super для вызова метода родительского класса.

public class Employee {

// TODO: Переопределить метод `work()` в подклассах и использовать `super`.
// 1. `Employee` (базовый класс) содержит `work()`, который выводит "Работник выполняет свою работу."

    private String name;
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void work(){
        System.out.println("Работник выполняет свою работу." +  name +" "+ position);
    }


}