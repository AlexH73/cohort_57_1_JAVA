package Homework.lesson_28.HomeworkYulia_28;

import java.util.ArrayList;
import java.util.List;

class ProgrammersList {
    private List<Programmer> programmers;

    public ProgrammersList() {
        this.programmers = new ArrayList<>();
    }

    public void addProgrammer(Programmer programmer) {
        programmers.add(programmer);
    }

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

