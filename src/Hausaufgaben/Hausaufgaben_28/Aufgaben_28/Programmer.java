package Hausaufgaben.Hausaufgaben_28.Aufgaben_28;

import java.util.ArrayList;
import java.util.List;

public class Programmer {
    private String name;
    private List <String> technologies = new ArrayList<>();

    public Programmer(String name, List<String> technologies) {
        this.name = name;
        this.technologies = technologies;
    }

    public String getName() {
        return name;
    }

    public List<String> getTechnologies() {
        return technologies;
    }

    @Override
    public String toString() {
        return "Programmer{" + name +
                ", technologies=" + technologies +
                '}';
    }
}
