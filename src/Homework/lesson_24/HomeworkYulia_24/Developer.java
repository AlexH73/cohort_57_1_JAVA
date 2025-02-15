package Homework.lesson_24.HomeworkYulia_24;

public class Developer extends Employee{

    public Developer(String name, String position) {
        super(name, position);
    }

    @Override
    public void work() {
        super.work();
        System.out.println(getName() + " пишет код.");
    }
}
