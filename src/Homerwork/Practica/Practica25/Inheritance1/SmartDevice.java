package Homerwork.Practica.Practica25.Inheritance1;
//Шаг 1: Создание базового класса SmartDevice
public class SmartDevice {
   protected String brand;
    protected String model;

    public SmartDevice(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void powerOn() {
        System.out.println(model + " включается...");
    }
}
