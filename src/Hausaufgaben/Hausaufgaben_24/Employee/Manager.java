package Hausaufgaben.Hausaufgaben_24.Employee;

public class Manager extends Employee {
    public Manager(String name, String position) {
        super(name, position);
    }
    // 2. `Manager` переопределяет `work()` и добавляет "Проводит встречи."

    @Override
    public void work() {
        super.work();
        System.out.println("Проводит встречи.");
    }
}
