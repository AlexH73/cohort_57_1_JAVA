package Homework.lesson_28;

public class ProgrammerUsage {
    public static void main(String[] args) {
    Programmer programmer = new Programmer("Johan");

    programmer.addTechnology("Java");
    programmer.addTechnology("Git");
    programmer.addTechnology("JavaScript");
    programmer.addTechnology("Java"); //Попытка повтора

    System.out.println("Технологии программиста " + programmer.name + ": "
            + programmer.getTechnologies());

    System.out.println("Владеет Java: " + programmer.hasTechnology("Java"));

    System.out.println("Владеет С++: " + programmer.hasTechnology("C++"));

}
}


