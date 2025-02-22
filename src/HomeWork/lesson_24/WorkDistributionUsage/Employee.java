package HomeWork.lesson_24.WorkDistributionUsage;

public class Employee {
    private String name;
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void work(){
        System.out.println(name + position + "Варит Кофе!");
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }
}
