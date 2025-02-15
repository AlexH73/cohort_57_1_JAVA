package Practice.Practice_24.the_working_team;

/**
 * Шаг 2: Создание подклассов Manager, Developer, Intern
 * <p>
 * ✔ Manager – добавляет teamSize (размер команды) и метод conductMeeting().
 * ✔ Developer – добавляет programmingLanguage (язык программирования).
 * ✔ Intern – добавляет internshipDuration (продолжительность стажировки).
 */

public class Developer extends Employee {
    private String programmingLanguage;

    // Конструктор
    public Developer(String name, String position, double salary, String programmingLanguage) {
        super(name, position, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // Геттеры и сеттеры
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    // Переопределение метода work()
    @Override
    public void work() {
        System.out.println("\nРазработчик пишет код на " + programmingLanguage + ".");
    }
}
