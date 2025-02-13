package Lessons.Lesson_24;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, String position, int salary) {
        super(name, position, salary);
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println("Разработчик пишет код на " + programmingLanguage);
    }
}
