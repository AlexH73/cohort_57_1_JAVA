package Homework.lesson_28;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Задача 1.</h1>
 * Давайте создадим класс программист (Programmer) у него будут следующие поля:
 * имя (String name) список технологий, которыми владеет List technologies,
 * например ("Java","Git", "JavaScript") Вам необходимо реализовать несколько методов:
 * метод, который позволит добавить технологию в список технологий программиста.
 * Можно чуть усложнить: Попробуйте реализовать метод таким образом,
 * чтобы он не позволял одному программисту дважды добавить одну и ту же технологию.
 * Метод, который позволит получить List список технологий,
 * которыми владеет программист метод, который позволит определить,
 * владеет ли заданной технологией программист
 */
public class Programmer {
    private String name;
    private List<String> technologies;

    public Programmer(String name) {
        this.name = name;
        this.technologies = new ArrayList<>();
    }

    // Добавление технологии с проверкой на дубликаты
    public void addTechnology(String technology) {
        if (!technologies.contains(technology)) {
            technologies.add(technology);
        }
    }

    // Получение списка технологий
    public List<String> getTechnologies() {
        return new ArrayList<>(technologies);
    }

    // Проверка владения технологией
    public boolean knowsTechnology(String technology) {
        return technologies.contains(technology);
    }

    // Получение name
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Программист {" +
                "имя ='" + name + '\'' +
                ", технологии =" + technologies +
                '}';
    }
}
