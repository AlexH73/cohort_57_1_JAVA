package Hausaufgaben.Hausaufgaben_24.Vehicle;

public class Car extends Vehicle{
    public Car(int speed, int capacity) {
        super(speed, capacity);
    }

    @Override
    public void move(){
        System.out.println("Транспорт движется.");
    }
}
