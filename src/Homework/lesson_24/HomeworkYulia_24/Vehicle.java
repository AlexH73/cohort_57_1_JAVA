// TODO: Создать базовый класс `Vehicle` с полями `speed` и `capacity`.
// 1. Реализовать метод `move()`, который выводит "Транспорт движется."
// 2. Создать подкласс `Car`, который переопределяет `move()` и выводит "Машина едет."

package Homework.lesson_24.HomeworkYulia_24;

class Vehicle {
    private int speed;
    private int capacity;

    public Vehicle(int speed, int capacity) {
        this.speed = speed;
        this.capacity = capacity;
    }

    public void move() {

        System.out.println("Транспорт движется");
    }
}
