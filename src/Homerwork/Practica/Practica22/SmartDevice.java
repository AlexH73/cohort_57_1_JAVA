package Homerwork.Practica.Practica22;
//    - `turnOff()`, который выключает устройство (`isOn = false`).
//    - `displayStatus()`, который выводит текущее состояние устройства.
public class SmartDevice {
    private String deviceName;
    private boolean isOn;

    public SmartDevice(String deviceName) {
        this.deviceName = deviceName;
        this.isOn = false;
    }

    //Метод для включения устройства
    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println(deviceName + " включено.");
        } else {
            System.out.println(deviceName + " уже включено.");
        }
    }
    
    //Метод для выключения устройства
    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println(deviceName + " выключено.");
        } else {
            System.out.println(deviceName + " уже выключено.");
        }
    }
    
    //Метод для отображения статуса устройства
    public void displayStatus() {
        String status = isOn ? "включено" : "выключено";
        System.out.println("Устройство: " + deviceName + " | Статус: " + status);
    }
}
