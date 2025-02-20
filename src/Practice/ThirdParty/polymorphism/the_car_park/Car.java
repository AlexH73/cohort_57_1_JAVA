package Practice.ThirdParty.polymorphism.the_car_park;

class Car extends Vehicle {
    public Car(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public String move() {
        return "Автомобиль " + brand + " " + model + " движется по дороге на колесах.";
    }
}