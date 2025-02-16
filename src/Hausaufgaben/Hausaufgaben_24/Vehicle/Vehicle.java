package Hausaufgaben.Hausaufgaben_24.Vehicle;

// TODO: Создать базовый класс `Vehicle` с полями `speed` и `capacity`.
// 1. Реализовать метод `move()`, который выводит "Транспорт движется."
// 2. Создать подкласс `Car`, который переопределяет `move()` и выводит "Машина едет."
public class Vehicle {
    private int speed;
    private int capacity;

    public Vehicle(int speed, int capacity) {
        this.speed = speed;
        this.capacity = capacity;
    }

    public int setSpeed() {
        return speed;
    }

    public int setCapacity() {
        return capacity;
    }

    private void setSpeed(int speed) {
        this.speed = speed;
    }

    private void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(120, 50);

        System.out.println("vehicle.setSpeed() = " + vehicle.setSpeed());
        System.out.println("vehiclesetCapacity() = " + vehicle.setCapacity());

        vehicle.setSpeed(140);
        vehicle.setCapacity(70);
        System.out.println("vehicle.setSpeed() = " + vehicle.setSpeed());
        System.out.println("vehicle.setCapacity() = " + vehicle.setCapacity());
    }

    public void move(){
        System.out.println("Транспорт движется.");
    }

}


