package Homework.Homework_24.part1_vehicle;

// TODO: Создать базовый класс `Vehicle` с полями `speed` и `capacity`.
// 1. Реализовать метод `move()`, который выводит "Транспорт движется."
// 2. Создать подкласс `Car`, который переопределяет `move()` и выводит "Машина едет."

public class Vehicle {
    private int speed;
    private int capacity;

    // Метод `move()`, который выводит "Транспорт движется."
    public void move() {
        System.out.println("Транспорт движется.");
    }
}
