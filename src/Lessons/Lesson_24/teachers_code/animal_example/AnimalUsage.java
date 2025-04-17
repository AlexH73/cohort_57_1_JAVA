package Lessons.Lesson_24.teachers_code.animal_example;

public abstract class AnimalUsage {
    public static void main(String[] args) {
        Animal24 animal24 = new Animal24();
        animal24.voice();
        animal24.feed();

        Dog24 dog = new Dog24();
        dog.secure();
        dog.voice();
        //dog.feed();

        Cat24 cat24 = new Cat24();
        cat24.hunt();
        cat24.feed();
        cat24.voice();

        Animal24 catAnimal24 = new Cat24();

        //catAnimal.hunt();
        catAnimal24.feed();


    }

    public abstract void voice();
}
