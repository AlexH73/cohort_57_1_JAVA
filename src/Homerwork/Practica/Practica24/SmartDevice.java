package Homerwork.Practica.Practica24;
// 2. Создать конструктор, принимающий `deviceName`, который устанавливает `isOn`
// в `false`.
// 3. Реализовать методы:
//- `turnOn()`, который включает устройство (`isOn = true`).
//- `turnOff()`, который выключает устройство (`isOn = false`).
//- `displayStatus()`, который выводит текущее состояние устройства.
public class SmartDevice {
    private String deviceName;
    private boolean isOn;

    public SmartDevice(String deviceName, boolean isOn) {
        this.deviceName = deviceName;
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
        System.out.println(deviceName + "is now On.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println(deviceName + "is now Off.");
    }

    public void displayStatus() {
        String status = isOn ? "On" : "Off";
        System.out.println("Devece: " + deviceName + " is " + status);
    }
}
