package Practice.ThirdParty.polymorphism.zoo;

public class Zoo {
    public static void main(String[] args) {
        Animal[] animals = {
                new Lion("Simba", "Лев", 5),
                new Elephant("Dumbo", "Слон", 10),
                new Monkey("George", "Обезьяна", 3),
                new Lion("Scar", "Лев", 8),
                new Elephant("Babar", "Слон", 7),
                new Monkey("Abu", "Обезьяна", 4)
        };
        for (Animal zoo : animals){
            System.out.println(zoo.makeSound());
            System.out.println(zoo.getInfo());
            System.out.println();
        }

    }
}