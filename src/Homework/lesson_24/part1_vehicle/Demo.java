package Homework.lesson_24.part1_vehicle;

public class Demo {
    public static void main(String[] args) {

        // Демонстрация вывода родительского класса
        Vehicle vehicle = new Vehicle();
        vehicle.move();

        // Демонстрация вывода подкласса
        Car car = new Car();
        car.move();
    }
}
