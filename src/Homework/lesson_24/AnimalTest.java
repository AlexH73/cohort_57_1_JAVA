package Homework.lesson_24;

import Lessons.Lesson_24.teachers_code.animal_example.Dog;

public class AnimalTest {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal("Неизвестное животное", 5);
        genericAnimal.displayInfo();
        genericAnimal.makeSound();

        System.out.println();

        DogAnimal myDog = new DogAnimal("Шарик", 8);
        myDog.displayInfo();
        myDog.makeSound();
    }
}
