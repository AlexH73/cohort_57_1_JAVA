package Practice.ThirdParty.polymorphism.the_car_park;

class Boat extends Vehicle{
    public Boat(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public String move() {
        return "Лодка " + brand + " " + model + " движется по воде.";
    }
}