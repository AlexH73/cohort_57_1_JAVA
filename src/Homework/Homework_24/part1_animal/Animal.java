package Homework.Homework_24.part1_animal;

/** TODO: Создать базовый класс `Animal` с полями `name` и `age`.
 1. Реализовать метод `makeSound()`, который выводит общий звук.
 2. Создать подкласс `Dog`, который переопределяет `makeSound()` и выводит "Гав!".
*/

public class Animal {
    private String name;
    private int age;

    // Конструктор
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Геттеры для name и age
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Метод makeSound(), который выводит общий звук
    public void makeSound() {
        System.out.println("Животное " + name + " издает звук.");
    }
}
