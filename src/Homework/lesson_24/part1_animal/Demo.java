package Homework.lesson_24.part1_animal;

public class Demo {
    public static void main(String[] args) {
        // Создание объекта Animal
        Animal animal = new Animal("Без имени", 3);
        animal.makeSound();

        // Создание объекта Dog
        Dog dog = new Dog("Tyson", 5);
        dog.makeSound();

        // Вывод возраста
        System.out.println(dog.getName() + " возраст: " + dog.getAge() + " лет.");
    }
}
