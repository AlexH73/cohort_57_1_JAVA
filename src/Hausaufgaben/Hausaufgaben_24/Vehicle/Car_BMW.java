package Hausaufgaben.Hausaufgaben_24.Vehicle;

public class Car_BMW extends Vehicle{
    public Car_BMW() {
        super(180,57);
    }

    public static void main(String[] args) {
        Car_BMW bmw = new Car_BMW();

        System.out.println("bmw.setSpeed() = " + bmw.setSpeed());
        System.out.println("bmw.setCapacity() = " + bmw.setCapacity());

    }
    @Override
    public void move(){
        System.out.println("Транспорт движется.");
    }
}
