package Practice.ThirdParty.polymorphism.the_car_park;

abstract class Vehicle {
    protected String brand; // Марка
    protected String model; // Модель
    protected int year;     // Год выпуска

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public abstract String move();

    public String getInfo() {
        return "Транспортное средство {" +
                "марка='" + brand + '\'' +
                ", модель='" + model + '\'' +
                ", год=" + year +
                '}';
    }
}