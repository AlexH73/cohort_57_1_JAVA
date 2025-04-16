package Lessons.Lesson_24.teachers_code.animal_example;

public abstract class AnimalUsage {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.voice();
        animal.feed();

        Dog dog = new Dog();
        dog.secure();
        dog.voice();
        //dog.feed();

        Cat cat = new Cat();
        cat.hunt();
        cat.feed();
        cat.voice();

        Animal catAnimal = new Cat();

        //catAnimal.hunt();
        catAnimal.feed();


    }

    public abstract void voice();
}
