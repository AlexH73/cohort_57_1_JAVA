package Homework.lesson_24.VehicleInheritanceClass;
// 2. Создать подкласс `Car`, который переопределяет `move()` и выводит "Машина едет."

//Подкласс Car, который наследует Vehicle
public class CarVehicle extends Vehicle  {

    //Конструктор
    public CarVehicle(int speed, int capacity) {
        super(speed, capacity);
    }
    //Переопределенный метод move()
    @Override
    public void move() {
        System.out.println("Машина едет.");

    }
}
