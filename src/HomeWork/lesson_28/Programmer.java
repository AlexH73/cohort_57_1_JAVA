package Homework.lesson_28;

import java.util.ArrayList;
import java.util.List;

public class Programmer {
    String name;
    List<String> technologies;

    public Programmer(String name) {
        this.name = name;
        this.technologies = new ArrayList<>();
    }

    public void addTechnology(String technology) {
        if (!technologies.contains(technology))
            technologies.add(technology);
    }

    public List<String> getTechnologies() {
        return new ArrayList<>(technologies); //Возвращаем копию списка
    }

    public boolean hasTechnology(String technology) {
        return technologies.contains(technology);
    }
}







