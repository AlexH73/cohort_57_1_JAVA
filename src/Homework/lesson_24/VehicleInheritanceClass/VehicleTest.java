package Homework.lesson_24.VehicleInheritanceClass;
//Класс для тестирования
public class VehicleTest {
    public static void main(String[] args) {
        Vehicle genericVehicle = new Vehicle(80, 4);
        genericVehicle.displayInfo();
        genericVehicle.move();

        System.out.println();

        CarVehicle myCar = new CarVehicle(120, 5);
        myCar.displayInfo();
        myCar.move();
    }


}
