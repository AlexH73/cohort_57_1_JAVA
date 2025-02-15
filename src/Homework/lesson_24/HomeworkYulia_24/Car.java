package Homework.lesson_24.HomeworkYulia_24;

public class Car extends Vehicle {
    public Car(int speed, int capacity) {
        super(speed, capacity);
    }

    @Override
    public void move() {
        System.out.println("Машина едет!");
    }
}
