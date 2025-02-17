package TestTasks.Vehicle;

public class Truck extends Vehicle {
    private int payload;

    public Truck(String brand, int year, int payload) {
        super(brand, year);
        this.payload = payload;
    }
    @Override
    public void displayInfo() {
     super.displayInfo();
        System.out.println("Грузоподъёмность " + payload + "тонн");
    }

}
