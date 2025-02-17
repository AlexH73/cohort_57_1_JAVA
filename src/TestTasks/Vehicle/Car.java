package TestTasks.Vehicle;

public class Car extends Vehicle {
    private int speed; // Скорость автомобиля

    // Конструктор, вызывающий родительский конструктор через `super()`
    public Car(String brand, int year, int speed) {
        super(brand, year); // Вызов конструктора Vehicle
        this.speed = speed;
    }

    // Переопределяем метод displayInfo() для машин
    @Override
    public void displayInfo() {
        super.displayInfo(); // Вызываем метод из Vehicle
        System.out.println("Максимальная скорость: " + speed + " км/ч");
    }
}
