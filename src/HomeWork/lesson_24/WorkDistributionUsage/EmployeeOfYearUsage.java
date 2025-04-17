package HomeWork.lesson_24.WorkDistributionUsage;

public class EmployeeOfYearUsage {
    public static void main(String[] args) {
        Employee worker = new Employee("Генадий - ", "Кухарка - ");
        worker.work();

        Manager worker1 = new Manager("Йохан - ", "менеджер - ");
        worker1.work();

        Developer worker2 = new Developer("Иван - ", "Разработчик - ");
        worker2.work();

    }
}
