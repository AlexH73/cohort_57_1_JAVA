package Homework.lesson_23;

class Car extends Vehicle {

    public Car(int speed, int capacity) {
        super(speed, capacity);
    }

    @Override
    public void move() {
        System.out.println("Машина едет");
    }
}
