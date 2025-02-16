package Hausaufgaben.Hausaufgaben_22.SmartDevice;

// 1. Добавить поля:
//    - `deviceName` (String) - Название устройства
//    - `isOn` (boolean) - Включено ли устройство
// 2. Создать конструктор, принимающий `deviceName`, который устанавливает `isOn` в `false`.
// 3. Реализовать методы:
//    - `turnOn()`, который включает устройство (`isOn = true`).
//    - `turnOff()`, который выключает устройство (`isOn = false`).
//    - `displayStatus()`, который выводит текущее состояние устройства.


public class SmartDevice {
    String deviceName;
    boolean isOn = false;

    public SmartDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    public SmartDevice(String deviceName, boolean isOn) {
        this.deviceName = deviceName;
        this.isOn = isOn;
    }

    public void turnOn() {
        if (!this.isOn) {
            this.isOn = true;
        }
    }

    public void turnOff() {
        if (this.isOn) {
            this.isOn = false;
        }
    }

    public void displayStatus() {
        if (this.isOn) {
            System.out.printf("%s запущен\n", this.deviceName);
        }else {
            System.out.printf("%s остановленo\n", this.deviceName);
        }
    }
}
