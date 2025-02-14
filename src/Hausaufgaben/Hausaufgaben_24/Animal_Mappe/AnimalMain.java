package Hausaufgaben.Hausaufgaben_24.Animal_Mappe;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.voice();
        animal.feed();

        Dog dog = new Dog();
        dog.secure();
        dog.voice();
        dog.feed();

        Cat cat = new Cat();
        cat.hunt();
        cat.voice();
        cat.feed();

        Animal catAnimal = new Cat();
        catAnimal.feed();

        Canary canary = new Canary();
        canary.fly();
        canary.feed();
        canary.voice();

    }
}
