package Homework.lesson_28;

import Homework.lesson_28.Task2.Programmer2;

import java.util.List;

public class ProgrammersListTest {
    public static void main(String[] args) {


        ProgrammersList programmersList = new ProgrammersList();

        Programmer2 slava = new Programmer2("Slava");
        slava.addTechnology("Java");
        slava.addTechnology("Python");


        programmersList.addProgrammer2(slava);

        List<Programmer2> javaProgrammers = programmersList.getProgrammersWithTechnology("Java");
        System.out.println("Программисты, владеющие Java:");
        for (Programmer2 p : javaProgrammers) {
            System.out.println(p.getName());
        }


    }

}
