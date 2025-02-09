package Hausaufgaben.Hausaufgaben_22.SmartDevice;

public class SmartDevice {
    // 1. Добавить поля:
//    - `deviceName` (String) - Название устройства
    String deviceName;
//    - `isOn` (boolean) - Включено ли устройство
    boolean isOn = false;
// 2. Создать конструктор, принимающий `deviceName`, который устанавливает `isOn` в `false`.
    public SmartDevice(String deviceName){this.deviceName = deviceName;}

    public SmartDevice(String deviceName, boolean isOn) {
        this.deviceName = deviceName;
        this.isOn = isOn;
    }


// 3. Реализовать методы:
//    - `turnOn()`, который включает устройство (`isOn = true`).
    void turnOn() {
        if (!this.isOn) {
            this.isOn = true;
            System.out.printf("%s запущен\n", this.deviceName);
        }
    }
//    - `turnOff()`, который выключает устройство (`isOn = false`).
    void turnOff() {
        if (this.isOn) {
            this.isOn = false;
            System.out.printf("%s остановленo\n", this.deviceName);
        }
    }
//    - `displayStatus()`, который выводит текущее состояние устройства.
}
