package Homework.lesson_28.Task2;

import java.util.ArrayList;
import java.util.List;

public class Programmer {
    private String name;
    private List<String> technologies;

    public Programmer(String name) {
        this.name = name;
        this.technologies = new ArrayList<>();

    }

    //Метод для проверки владения технологией
    public boolean hasTechnology(String technology) {
        return technology.contains(technology);
    }

    public void addTechnology(String technology) {
        if (technologies.contains(technology)) {
            System.out.println(name + " уже владеет технологией: " + technology);
        } else {
            technologies.add(technology);
            System.out.println("Технология " + technology + " добавлена для " + name);
        }
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", technologies=" + technologies +
                '}';
    }
}
