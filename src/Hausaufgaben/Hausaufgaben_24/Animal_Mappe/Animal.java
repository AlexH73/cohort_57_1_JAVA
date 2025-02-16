package Hausaufgaben.Hausaufgaben_24.Animal_Mappe;

// TODO: Создать базовый класс `Animal` с полями `name` и `age`.
// 1. Реализовать метод `makeSound()`, который выводит общий звук.
// 2. Создать подкласс `Dog`, который переопределяет `makeSound()` и выводит "Гав!".
public class Animal {
    public void voice() {
        System.out.println("Животное издает звук");
    }

    public void feed() {
        System.out.println("Животное ест");
    }
}
