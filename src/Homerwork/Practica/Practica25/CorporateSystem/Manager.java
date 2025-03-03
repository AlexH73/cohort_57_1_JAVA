package Homerwork.Practica.Practica25.CorporateSystem;

//✔ Manager – добавляет teamSize (размер команды) и метод conductMeeting().
public class Manager extends Employee {
    protected int teamSize;

    public Manager(String name, double salary, int teamSize) {
        super(name, "Manager", salary);
        this.teamSize = teamSize;
    }

    public void conductMeeting() {
        System.out.println(name + " проводит собрание для команды из " + teamSize + " человек");
    }

    @Override
    public void work() {
        super.work();
        System.out.println("Менеджер управляет командой и проводит встречи.");
    }
}
