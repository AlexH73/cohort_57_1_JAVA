package Practice.ThirdParty.polymorphism.the_car_park;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    // Создаем список vehicles для хранения объектов типа Vehicle (машины, велосипеды, лодки и т. д.).
    // Используем ArrayList<>, так как он удобен для динамического хранения объектов.
    private List<Vehicle> vehicles = new ArrayList<>();

    // Метод addVehicle() добавляет транспортное средство в список vehicles.
    // В качестве параметра принимает объект Vehicle, что позволяет хранить любые его подклассы (Car, Bicycle, Boat).
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    // Метод moveAllVehicles() заставляет все транспортные средства двигаться.
    public void moveAllVehicles() {
        // Перебираем все объекты Vehicle в списке vehicles.
        // Вызываем move(), который полиморфно определяет, как именно передвигается каждое транспортное средство.
        // Выводим результат в консоль.
        for (Vehicle v : vehicles) {
            System.out.println(v.move());
        }
    }

    // Метод getAllVehiclesInfo() выводит информацию обо всех транспортных средствах в гараже.
    public void getAllVehiclesInfo() {
        // Перебираем список vehicles и вызываем getInfo() у каждого объекта.
        // Метод getInfo() возвращает строку с маркой, моделью и годом выпуска.
        for (Vehicle v : vehicles) {
            System.out.println(v.getInfo());
        }
    }

    public static void main(String[] args) {
        // Создаем объект garage для управления транспортом.
        Garage garage = new Garage();

        // Добавляем три разных транспортных средства:
        // Car (Автомобиль)
        // Bicycle (Велосипед)
        // Boat (Лодка)
        // Полиморфизм позволяет хранить их в одном списке (List<Vehicle>).
        garage.addVehicle(new Car("Toyota", "Camry", 2020));
        garage.addVehicle(new Bicycle("Giant", "Escape 3", 2022));
        garage.addVehicle(new Boat("Yamaha", "212X", 2018));

        // Выводим заголовок и запускаем метод moveAllVehicles(), чтобы показать, как движется транспорт.
        System.out.println("=== Движение транспорта ===");
        garage.moveAllVehicles();

        // Выводим заголовок и вызываем getAllVehiclesInfo(), чтобы показать характеристики всех транспортных средств.
        System.out.println("\n=== Информация о транспорте ===");
        garage.getAllVehiclesInfo();
    }
}
