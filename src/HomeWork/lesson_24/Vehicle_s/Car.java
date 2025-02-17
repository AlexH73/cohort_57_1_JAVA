package HomeWork.lesson_24.Vehicle_s;

public class Car extends Vehicle {
    public Car(){
        super();
    }

    public void move(int speed, int capacity) {
        System.out.println("Машина едет со скоростью " + speed + " (kmh)" +
                " и расходует " + capacity + " литров бензина.");
    }
}
