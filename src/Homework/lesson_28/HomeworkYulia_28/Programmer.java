package Homework.lesson_28.HomeworkYulia_28;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Programmer {
    private String name;
    private Set<String> technologies;

    public Programmer(String name) {
        this.name = name;
        this.technologies = new HashSet<>();
    }

    public void addTechnology(String technology) {
        if (technologies.add(technology)) {
            System.out.println(technology + " добавлена.");
        } else {
            System.out.println(technology + " уже есть в списке.");
        }
    }

    public String getName() {
        return name;
    }

    public List<String> getTechnologies() {
        return List.copyOf(technologies);
    }

    public boolean knowsTechnology(String technology) {
        return technologies.contains(technology);
    }

    public static void main(String[] args) {
        Programmer programmer = new Programmer("Иван");
        programmer.addTechnology("Java");
        programmer.addTechnology("C++");
        programmer.addTechnology("Java"); // Попытка добавить дубликат

        System.out.println("Список технологий: " + programmer.getTechnologies());
        System.out.println("Знает ли Java? " + programmer.knowsTechnology("Java"));
        System.out.println("Знает ли Python? " + programmer.knowsTechnology("Python"));



        ProgrammersList programmersList = new ProgrammersList();

        Programmer p1 = new Programmer("Alice");
        p1.addTechnology("Java");
        programmersList.addProgrammer(p1);

        Programmer p2 = new Programmer("Bob");
        p2.addTechnology("JavaScript");
        programmersList.addProgrammer(p2);

        List<Programmer> javaDevelopers = programmersList.getProgrammersWithTechnology("Java");
        System.out.println("Программисты, владеющие Java:");
        for (Programmer programmer1 : javaDevelopers) {
            System.out.println(programmer1.getName());
        }
    }
}
