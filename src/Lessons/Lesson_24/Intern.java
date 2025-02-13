package Lessons.Lesson_24;

public class Intern extends Employee {

    private int internshipDuration;

    public Intern(String name, String position, int salary) {
        super(name, position, salary);
    }

    public int getInternshipDuration() {
        return internshipDuration;
    }

    public void setInternshipDuration(int internshipDuration) {
        this.internshipDuration = internshipDuration;
    }

    @Override
    public void work() {
        System.out.println("Стажеры учатся и помогают команде!");
    }
}
