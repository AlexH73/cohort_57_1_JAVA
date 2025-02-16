package Homework.lesson_24;
/*Часть 1: Базовое наследование – создание иерархии классов
🔹 В первых двух заданиях необходимо создать базовый класс и унаследовать от него.
🔹 Каждый подкласс должен расширять функциональность, добавляя новые поля и методы.

// TODO: Создать базовый класс `Animal` с полями `name` и `age`.
// 1. Реализовать метод `makeSound()`, который выводит общий звук.
// 2. Создать подкласс `Dog`, который переопределяет `makeSound()` и выводит "Гав!".
class Animal {
    private String name;
    private int age;
}
// TODO: Создать базовый класс `Vehicle` с полями `speed` и `capacity`.
// 1. Реализовать метод `move()`, который выводит "Транспорт движется."
// 2. Создать подкласс `Car`, который переопределяет `move()` и выводит "Машина едет."
class Vehicle {
    private int speed;
    private int capacity;
}*/

public class Animal {
    private String name;
    private int age;

    //Конструктор
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //Геттеры
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    //Метод, который можно переопределить
    public void makeSound() {
        System.out.println("Животное издает звук.");
    }
    //Метод для отображения информации о животном
    public void displayInfo() {
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }

}
