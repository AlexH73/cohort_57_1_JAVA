package Homework.lesson_28.Task1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Programmer {
    private String name;
    private Set<String> technologies; //Используем Set<String>, чтобы избежать дубликатов.

    public Programmer(String name) {
        this.name = name;
        this.technologies = new HashSet<>();
    }

    //contains(technology) — это метод интерфейса Set, который проверяет,
    // есть ли в множестве элемент с таким значением.
    public void addTechnology(String technology) {
        if (technologies.contains(technology)) {
            System.out.println(name + " уже владеет технологией: " + technology);
        } else {
            technologies.add(technology);
            System.out.println("Технология " + technology + " добавлена для " + name);
        }
    }

    // List.copyOf(technologies), создать неизменяемый список(нельзя модифицировать снаружи).
    //метод возвращает список технологий программиста.
    public List<String> getTechnologies() {
        return List.copyOf(technologies);
    }

    public boolean hasTechnology(String technology) {
        return technologies.contains(technology);
    }
}
