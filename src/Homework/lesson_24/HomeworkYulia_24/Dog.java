package Homework.lesson_24.HomeworkYulia_24;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Гав!");
    }
}
