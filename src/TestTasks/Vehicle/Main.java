package TestTasks.Vehicle;

public class Main {
    public static void main(String[] args) {
        // Создаём объект Vehicle
        Vehicle vehicle = new Vehicle("Yamaha", 2015);
        vehicle.displayInfo();

        System.out.println(); // Пустая строка для читаемости

        // Создаём объект Car
        Car car = new Car("BMW", 2022, 250);
        car.displayInfo();

        System.out.println();

        Truck truck = new Truck("Volvo", 2018, 4000 );
        truck.displayInfo();

    }
}
