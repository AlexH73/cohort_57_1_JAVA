package Practice.Practice_24.the_working_team;

/**
 * Шаг 2: Создание подклассов Manager, Developer, Intern
 * <p>
 * ✔ Manager – добавляет teamSize (размер команды) и метод conductMeeting().
 * ✔ Developer – добавляет programmingLanguage (язык программирования).
 * ✔ Intern – добавляет internshipDuration (продолжительность стажировки).
 */
public class Manager extends Employee{
    private int teamSize;

    // Конструктор
    public Manager(String name, String position, double salary, int teamSize) {
        super(name, position, salary);
        this.teamSize = teamSize;
    }

    // Геттеры и сеттеры
    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    // Метод conductMeeting()
    public void conductMeeting() {
        System.out.println("Менеджер проводит встречу.");
    }

    // Переопределение метода work()
    @Override
    public void work() {
        super.work();
        System.out.println("Менеджер управляет командой и проводит встречи.");
    }
}
