package Homework.lesson_24.HomeworkYulia_24;

public class Manager extends Employee {
    public Manager(String name, String position) {
        super(name, position);
    }



    @Override
    public void work() {
        super.work();
        System.out.println(getName() + " проводит встречи.");
    }
}
