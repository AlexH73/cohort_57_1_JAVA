package Homework.lesson_24.EmployeeRedefinitionWork;
// 2. `Manager` переопределяет `work()` и добавляет "Проводит встречи.

//Подкласс Manager, наследуется от Employee
public class Manager extends Employee {

    //Конструктор
    public Manager(String name) {
        super(name, "Менеджер");
    }
    //Переопределенный метод work()
    @Override
    public void work() {
        super.work(); //Вызывает метод work() родительского класса
        System.out.println("Проводит встречи.");
    }
}
