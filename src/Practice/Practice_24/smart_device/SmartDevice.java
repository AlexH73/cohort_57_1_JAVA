package Practice.Practice_24.smart_device;

/**
 * Шаг 1: Создание базового класса SmartDevice
 * <p>
 * 🔹 Базовый класс SmartDevice должен содержать:
 * ✔ Поля brand (бренд) и model (модель).
 * ✔ Метод powerOn(), который выводит "Устройство включается...".
 */
public class SmartDevice extends Camera {
    private String brand, model;

    public SmartDevice(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public void powerOn() {
        System.out.println(model + " включается...");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
