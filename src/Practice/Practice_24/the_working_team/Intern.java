package Practice.Practice_24.the_working_team;

/**
 * Шаг 2: Создание подклассов Manager, Developer, Intern
 * <p>
 * ✔ Manager – добавляет teamSize (размер команды) и метод conductMeeting().
 * ✔ Developer – добавляет programmingLanguage (язык программирования).
 * ✔ Intern – добавляет internshipDuration (продолжительность стажировки).
 */

public class Intern extends Employee {
    private int internshipDuration; // продолжительность стажировки в месяцах

    // Конструктор
    public Intern(String name, String position, double salary, int internshipDuration) {
        super(name, position, salary);
        this.internshipDuration = internshipDuration;
    }

    // Геттеры и сеттеры
    public int getInternshipDuration() {
        return internshipDuration;
    }

    public void setInternshipDuration(int internshipDuration) {
        this.internshipDuration = internshipDuration;
    }

    // Переопределение метода work()
    @Override
    public void work() {
        System.out.println("\nСтажёр учится и помогает команде.");
    }
}
