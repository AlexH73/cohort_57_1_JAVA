package Homerwork.Practica.ModifiersAccessField;
/*// TODO: Назначить модификаторы доступа для полей.

class Car {
    String brand;
    String model;
    int speed;
    double fuelLevel;
}
Copy*/
public class Car {
    private String brand;
    private String model;
    private int speed;
    private double fuelLevel;

    //Конструктор
    public Car(String brand, String model, int speed, double fuelLevel) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
        this.fuelLevel = fuelLevel;
    }
    //Геттеры
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }
    //Сеттеры с валидацией
    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        } else {
            System.out.println("Ошибка: скорость не может быть отрицательной!");
        }
    }
    public void setFuelLevel(double fuelLevel) {
        if (fuelLevel >= 0 && fuelLevel <= 100){
            this.fuelLevel = fuelLevel;
            System.out.println("Ошибка: уровень топлива должен быть от 0 до 100!");
            fuelLevel -= 5; //Расход топлива
        }
    }
    //Метод для движения машины
    public void drive() {
        if (fuelLevel > 0) {
            System.out.println(brand + " " + model + " едет со скоростью " + speed + " км/ч.");

        } else {
            System.out.println("Ошибка: топлива нет!");
        }
    }
}
