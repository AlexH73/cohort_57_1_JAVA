package Homerwork.Practica.Practica25.Inheritance2;

//3. Класс SmartDevice, наследуется от Camera
//🔹 Теперь SmartDevice получает музыкальный плеер и камеру.
public class SmartDevice extends Camera {
    protected String brand;
    protected String model;

    public SmartDevice(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    protected void powerOn() {
        System.out.println(model + "включается...");
    }
}
//Теперь SmartDevice умеет:
//✅ Воспроизводить музыку
//✅ Делать фото
//✅ Включаться