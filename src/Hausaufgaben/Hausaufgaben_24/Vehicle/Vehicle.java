package Hausaufgaben.Hausaufgaben_24.Vehicle;

public class Vehicle extends Car{
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
    @Override
    public void move(){
        System.out.println("Транспорт движется.");
    }

}


