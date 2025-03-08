package Homework.lesson_28.Task2;

import java.util.ArrayList;
import java.util.List;

public class ProgrammersList {
    private List<Programmer2> programmers;   //список программистов.
    private String technology;

    //Инициализирует пустой список программистов.
    public ProgrammersList() {
        this.programmers = new ArrayList<Programmer2>();
    }

    //Добавляет программиста в список.
    public void addProgrammer2(Programmer2 programmer) {
        programmers.add(programmer);
    }

    public List<Programmer2> getProgrammersWithTechnology(String Technology) {
        List<Programmer2> result = new ArrayList<>();
        for (Programmer2 programmer : programmers) {
            if (programmer.hasTechnology(technology)) {
                result.add(programmer);
            }
        }
        return result;
    }
}
