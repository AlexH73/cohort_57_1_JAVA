package Homework.lesson_28.Task2;

import java.util.ArrayList;
import java.util.List;

public class Programmer2 {
    private String name;
    private String technology;
    private List<String> technologies;


    public Programmer2(String name) {
        this.name = name;
        this.technologies = new ArrayList<>();
    }

    //Добавляет технологию, если её ещё нет в списке (предотвращает дубликаты).
    public void addTechnology(String technology) {
        if (!technologies.contains(technology)) {
            technologies.add(technology);
            System.out.println("Технология " + technology + " добавлена для " + name);
        } else {
            System.out.println(name + " уже владеет технологией: " + technology);
        }
    }

    //Возвращает неизменяемый список технологий (List.copyOf()
    // предотвращает его изменение извне
    public List<String> getTechnologies() {
        return List.copyOf(technologies);

    }

    //Проверяет,владеет ли программист заданной технологией (true или false).
    public boolean hasTechnology(String technology) {
        return technologies.contains(technologies);
    }

    //Возвращает имя программиста.
    public String getName() {
        return name;
    }
}
