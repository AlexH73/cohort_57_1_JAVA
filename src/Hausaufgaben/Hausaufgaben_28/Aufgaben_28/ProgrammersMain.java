package Hausaufgaben.Hausaufgaben_28.Aufgaben_28;

import Hausaufgaben.Hausaufgaben_28.Untericht_28_3.Manager;

import java.awt.*;
import java.util.Scanner;

public class ProgrammersMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ProgrammersList programmersList = createProgrammersList(scanner);
        do {
            System.out.println("Хотите добавить в команду программиста (Y/N)? ");
            String answer = scanner.nextLine();
            if(answer.equals("N")){
                break;
            }
            Programmer programmer = ProgrammersMain.readProgrammer(scanner);
            programmersList.addProgrammer(programmer);

        }while (true);
        System.out.println("-----------------------");
        System.out.println(programmersList);
    }
    public static ProgrammersList createProgrammersList(Scanner scanner){
        return new ProgrammersList();
    }

    public static Programmer readProgrammer(Scanner scanner) {
        System.out.println("введите имя программиста");
        String name = scanner.nextLine();
        System.out.println("язык программирования:");
        String technologies  = scanner.nextLine();
        return new Programmer(name, null);

    }
}
