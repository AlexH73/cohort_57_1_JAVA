/*
package Homework.lesson_28.ProgrammersList;

import java.util.List;

public class ProgrammersList {
        private String name;
        private List<String> technologies;

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

    class ProgrammersList {
        private List<Programmer> programmers;

        public ProgrammersList() {
            this.programmers = new ArrayList<>();
        }

        public void addProgrammer(Programmer programmer) {
            programmers.add(programmer);
        }

        public List<Programmer> getProgrammersByTechnology(String technology) {
            List<Programmer> result = new ArrayList<>();
            for (Programmer programmer : programmers) {
                if (programmer.getTechnologies().contains(technology)) {
                    result.add(programmer);
                }
            }
            return result;
        }
    }

}
*/