//  В первых двух заданиях необходимо создать базовый класс и унаследовать от него.
//🔹 Каждый подкласс должен расширять функциональность, добавляя новые поля и методы.
//
/// / TODO: Создать базовый класс `Animal` с полями `name` и `age`.
/// / 1. Реализовать метод `makeSound()`, который выводит общий звук.
/// / 2. Создать подкласс `Dog`, который переопределяет `makeSound()` и выводит "Гав!".

package Homework.lesson_24.HomeworkYulia_24;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {}
}

