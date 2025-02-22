package HomeWork.lesson_24.WorkDistributionUsage;

public class Manager extends Employee {

    public Manager(String name, String position) {
        super(name, "Manager - ");
    }
    @Override
    public void work() {
        super.work();
        System.out.println("и проводит встречи!");
    }
}
