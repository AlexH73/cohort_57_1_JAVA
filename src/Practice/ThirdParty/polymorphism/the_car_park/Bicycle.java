package Practice.ThirdParty.polymorphism.the_car_park;

class Bicycle extends Vehicle {
    public Bicycle(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public String move() {
        return "Велосипед " + brand + " " + model + " движется с помощью педалей.";
    }
}