package Lessons.Lesson_24;

public class Manager extends Employee {
    private int team;

    public Manager(String name, String position, int salary) {
        super(name, position, salary);
    }

    public int teamSize() {
        return team;
    }

    public void conductMeeting() {
        String name = super.getName();
        System.out.println(name + " провел митинг!");
    }

    @Override
    public void work() {
        super.work();
        System.out.println("Менеджер управляет командой и проводит встречи.");
    }
}
