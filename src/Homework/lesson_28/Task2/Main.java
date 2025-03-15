package Homework.lesson_28.Task2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProgrammersList programmersList = new ProgrammersList();

        Programmer alice = new Programmer("Alice");
        alice.addTechnology("Java");
        alice.addTechnology("Git");

        Programmer bob = new Programmer("Bob");
        bob.addTechnology("Python");
        bob.addTechnology("Git");

        programmersList.addProgrammer(alice);
        programmersList.addProgrammer(bob);
        // Вывод всех программистов
        System.out.println("Все программисты: ");
        programmersList.printProgrammers();

        // Получение программистов, владеющих Java
        System.out.println("\nПрограммисты, которые знают Java:");
        List<Programmer> javaDevelopers = programmersList.getProgrammersByTechnology("Java");
        for (Programmer programmer : javaDevelopers) {
            System.out.println(programmer);
        }
    }
}

