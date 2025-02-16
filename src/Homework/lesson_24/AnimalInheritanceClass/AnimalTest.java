package Homework.lesson_24.AnimalInheritanceClass;
//Класс для тестирования
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
