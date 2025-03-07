package Hausaufgaben.Hausaufgaben_28.Aufgaben_28;

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

    public static readProgrammer(Scanner scanner){
        System.out.println("введите имя программиста");
        String name = scanner.nextLine();
        System.out.println("язык программирования:");
        String language = scanner.nextLine();
        return new Programmer(name,technologies);

    }
}
