package Homework.lesson_28.Task2;


import java.util.ArrayList;
import java.util.List;

public class ProgrammersList {
    private List<Programmer> programmers;

    public ProgrammersList() {
        this.programmers = new ArrayList<>();
    }

    //Метод для добавления программиста в список
    public void addProgrammer(Programmer programmer) {
        programmers.add(programmer);
    }

    //Метод для получения всех программистов, владеющих заданной технологией
    public List<Programmer> getProgrammersByTechnology(String technology) {
        List<Programmer> result = new ArrayList<>();
        for (Programmer programmer : programmers) {
            if (programmer.hasTechnology(technology)) {
                result.add(programmer);
            }
        }
        return result;
    }

    //Метод для вывода списка программистов
    public void printProgrammers() {
        for (Programmer programmer : programmers) {
            System.out.println(programmer);
        }
    }
}

