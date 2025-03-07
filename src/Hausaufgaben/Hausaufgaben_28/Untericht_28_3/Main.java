package Hausaufgaben.Hausaufgaben_28.Untericht_28_3;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager manager = createManager(scanner);
        do {
            System.out.println("Хотите добавить в команду программиста (Y/N)? ");
            String answer = scanner.nextLine();
            if(answer.equals("N")){
                break;
            }
            Programmer programmer = readProgrammer(scanner);
            manager.addProgrammer(programmer);
        }while (true);
        System.out.println("-----------------------");
        System.out.println(manager);
    }
    public static Manager createManager(Scanner scanner){
        System.out.println("Введите имя менеджера:");
        String name = scanner.nextLine();
        return new Manager(name);
    }

    public static Programmer readProgrammer(Scanner scanner){
        System.out.println("введите имя программиста");
        String name = scanner.nextLine();
        System.out.println("язык программирования:");
        String language = scanner.nextLine();
        return new Programmer(name,language);

    }

}
