package Homework;

public class animal {
}
// TODO: Создать базовый класс `Animal` с полями `name` и `age`.
// 1. Реализовать метод `makeSound()`, который выводит общий звук.
// 2. Создать подкласс `Dog`, который переопределяет `makeSound()` и выводит "Гав!".

class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Общий метод для звука
    public void makeSound() {
        System.out.println("Животное издает звук");
    }
}

class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);  // Вызов конструктора родительского класса
    }
    @Override
    public void makeSound() {
        System.out.println("Гав!");
    }
}

