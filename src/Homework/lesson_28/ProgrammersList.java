package Homework.lesson_28;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Задача 2</h1>
 * Давайте создадим класс ProgrammersList (список программистов).
 * В этом классе должно быть единственное поле List и несколько методов:
 * метод, который позволяет добавить программиста в список метод,
 * который позволяет получить всех программистов владеющих заданной технологией.
 */
public class ProgrammersList {
    private List<Programmer> programmers;

    public ProgrammersList() {
        this.programmers = new ArrayList<>();
    }

    // Добавление программиста в список
    public void addProgrammer(Programmer programmer) {
        programmers.add(programmer);
    }

    // Поиск программистов с заданной технологией
    public List<Programmer> getProgrammersWithTechnology(String technology) {
        List<Programmer> result = new ArrayList<>();
        for (Programmer programmer : programmers) {
            if (programmer.knowsTechnology(technology)) {
                result.add(programmer);
            }
        }
        return result;
    }
}
