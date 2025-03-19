package Homework.animal;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);  // Вызов конструктора родительского класса
    }
    @Override
    public void makeSound() {
        System.out.println("Гав!");
    }
}
