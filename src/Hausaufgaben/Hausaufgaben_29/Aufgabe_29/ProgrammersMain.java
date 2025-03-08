package Hausaufgaben.Hausaufgaben_29.Aufgabe_29;

public class ProgrammersMain {
    public static void main(String[] args) {
        Programmer p1 = new Programmer("Alice");
        p1.addTechnology("Java");
        p1.addTechnology("Git");
        p1.addTechnology("JavaScript");

        System.out.println("Technologies Alice knows: " + p1.getTechnologies());

        p1.removeTechnology("Git");
        System.out.println("Technologies Alice knows after removing Git: " + p1.getTechnologies());

        Programmer p2 = new Programmer("Bob");
        p2.addTechnology("Python");
        p2.addTechnology("Java");

        ProgrammersList programmersList = new ProgrammersList();
        programmersList.addProgrammer(p1);
        programmersList.addProgrammer(p2);

        System.out.println("Programmers who know Java: " + programmersList.getProgrammersWithTechnology("Java"));
    }
}

