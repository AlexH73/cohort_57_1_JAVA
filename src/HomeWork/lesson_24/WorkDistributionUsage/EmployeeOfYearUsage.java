package HomeWork.lesson_24.WorkDistributionUsage;

public class EmployeeOfYearUsage {
    public static void main(String[] args) {
        Employee worker = new Employee("Генадий - ", "Кухарка - ");
        worker.work();

        Manager worker1 = new Manager("Йохан - ", "менеджер - ");
        System.out.println(worker1.getName() + worker1.getPosition() + "Проводит встречи!");
        worker1.work();

        Developer worker2 = new Developer("Иван - ", "Разработчик - ");
        System.out.println(worker2.getName() + worker2.getPosition() + "Пишет код!");
        worker2.work();



    }
}
