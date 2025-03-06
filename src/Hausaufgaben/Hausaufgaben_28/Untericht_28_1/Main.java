package Hausaufgaben.Hausaufgaben_28.Untericht_28_1;

public class Main {
    public static void main(String[] args) {
       Programmer[] programmers = {
          new Programmer("Jack", "java"),
          new Programmer("John", "java"),
          new Programmer("Oleg", "go"),
          new Programmer("Mike", "javascript"),
       };

       Manager manager = new Manager("Lena");
       manager.add(new Programmer("Jack", "java"));
       manager.add(new Programmer("John", "java"));

        System.out.println(manager);
        System.out.println("----------------------------");
        manager.add(new Programmer("Oleg", "go"));
        manager.add(new Programmer("Mike", "c++"));

        System.out.println(manager);

        System.out.println("----------------");
        for (int i = 0; i < manager.size() ; i++) {
            Programmer programmer = manager.get(i);
            if(programmer.getLanguage().equals("java")){
                System.out.println(programmer);
            }
        }
    }
}
