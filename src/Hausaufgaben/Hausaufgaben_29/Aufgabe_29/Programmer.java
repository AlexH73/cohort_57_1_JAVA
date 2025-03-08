package Hausaufgaben.Hausaufgaben_29.Aufgabe_29;

import java.util.ArrayList;
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

    public String getName() {
        return name;
    }

    public boolean addTechnology(String technology) {
        return technologies.add(technology);
    }

    public boolean removeTechnology(String technology) {
        return technologies.remove(technology);
    }

    public List<String> getTechnologies() {
        return new ArrayList<>(technologies);
    }

    public boolean knowsTechnology(String technology) {
        return technologies.contains(technology);
    }
}


