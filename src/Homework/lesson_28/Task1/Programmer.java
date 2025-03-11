package Homework.lesson_28.Task1;

import java.util.ArrayList;
import java.util.List;

public class Programmer {
    private String name;
    private List<String> technologies; //Можно еще использовать Set<String>, чтобы избежать дубликатов.

    public Programmer(String name) {
        this.name = name;
        this.technologies = new ArrayList<>();
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

    // List.copyOf(technologies), создать неизменяемый список.
    //метод возвращает список технологий программиста.
    public List<String> getTechnologies() {
        return List.copyOf(technologies);
    }

    public boolean hasTechnology(String technology) {
        return technologies.contains(technology);
    }
}
