package Hausaufgaben.Hausaufgaben_24.Animal_Mappe;

public class AnimalMain {
    public static void main(String[] args) {
        Animal[] animals = {
            new Dog(),
            new Cat(),
            new Canary()
        };
        for (Animal animal : animals) {
        animal.voice();
        animal.feed();
        }

        Dog dog = new Dog();
        dog.secure();

        Cat cat = new Cat();
        cat.hunt();

        Canary canary = new Canary();
        canary.fly();
    }
}
