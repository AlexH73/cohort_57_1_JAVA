package Lessons.Lesson_24;

public class Usage {
    public static void main(String[] args) {
        Manager max = new Manager("Max", "product manager", 50000);
        Developer nik = new Developer("Nik", "Developer", 90000);
        Intern ivan = new Intern("Ivan", "Intern", 40000);
        max.work();
        nik.work();
        ivan.work();
    }
}
