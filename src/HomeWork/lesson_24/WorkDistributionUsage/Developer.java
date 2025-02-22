package HomeWork.lesson_24.WorkDistributionUsage;

public class Developer extends Employee {
    public Developer(String name, String position) {
        super(name, position);
    }
    @Override
    public void work() {
        super.work();
        System.out.println("Пишет код!");
    }
}
