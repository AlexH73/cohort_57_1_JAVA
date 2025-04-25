package Homework.lesson_24.VehicleInheritanceClass;
/*Часть 1: Базовое наследование – создание иерархии классов
🔹 В первых двух заданиях необходимо создать базовый класс и унаследовать от него.
🔹 Каждый подкласс должен расширять функциональность, добавляя новые поля и методы.
// TODO: Создать базовый класс `Vehicle` с полями `speed` и `capacity`.
// 1. Реализовать метод `move()`, который выводит "Транспорт движется."
// 2. Создать подкласс `Car`, который переопределяет `move()` и выводит "Машина едет."
class Vehicle {
    private int speed;
    private int capacity;
}*/
// 1. Реализовать метод `move()`, который выводит "Транспорт движется."
//Базовый класс Vehicle
public class Vehicle {
    private int speed;          //поля speed,capacity объявлены как private, доступ к ним осуществляется через геттеры.
    private int capacity;

    //Конструкторы
    public Vehicle(int speed, int capacity) {
        this.speed = speed;
        this.capacity = capacity;
    }
    //Геттеры
    public int getSpeed() {
        return speed;
    }

    public int getCapacity() {
        return capacity;
    }
    //Метод, который можно переопределить
    public void move() {
        System.out.println("Транспорт движется.");
    }
    //Метод для отображения информации о транспорте
    public void displayInfo() {
        System.out.println("Скорость: " + speed + "км/ч, Вместимость: " + capacity + " человек.");
    }
}
