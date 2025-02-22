package Hausaufgaben.Hausaufgaben_24.Employee;

public class Developer extends Manager{
    public Developer(String name, String position) {
        super(name, position);
    }

    // 3. `Developer` переопределяет `work()` и добавляет "Пишет код."
    @Override
    public void work() {
        super.work();
        System.out.println("Пишет код.");
    }
}
