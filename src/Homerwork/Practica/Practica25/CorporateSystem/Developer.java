package Homerwork.Practica.Practica25.CorporateSystem;

//✔ Developer – добавляет programmingLanguage (язык программирования).
//✔ У Developer метод work() выводит "Разработчик пишет код на {язык_программирования}.".
public class Developer extends Employee {
    protected String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, "Developer", salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        super.work();
        System.out.println("Разработчик пишет код на " + programmingLanguage + ".");
    }
}
