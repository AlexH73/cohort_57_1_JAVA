package Homerwork.Practica.Practica25.CorporateSystem;

//✔ Intern – добавляет internshipDuration (продолжительность стажировки).
//✔ У Intern метод work() выводит "Стажёр учится и помогает команде.".
public class Intern extends Employee {
    private int internshipDuration;

    public Intern(String name, double salary, int internshipDuration) {
        super(name, "Intern", salary);
        this.internshipDuration = internshipDuration;
    }

    @Override
    public void work() {
        super.work();
        System.out.println("Стажёр учится и помогает команде.");
    }
}
