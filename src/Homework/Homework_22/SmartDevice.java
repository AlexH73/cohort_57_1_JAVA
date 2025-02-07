package Homework.Homework_22;
//[х] TODO: Создать класс SmartDevice
//[x] 1. Добавить поля:
//    - `deviceName` (String) - Название устройства
//    - `isOn` (boolean) - Включено ли устройство
//[х] 2. Создать конструктор, принимающий `deviceName`, который устанавливает `isOn` в `false`.
//[х] 3. Реализовать методы:
//    - `turnOn()`, который включает устройство (`isOn = true`).
//    - `turnOff()`, который выключает устройство (`isOn = false`).
//    - `displayStatus()`, который выводит текущее состояние устройства.

/**
 * <h1>Задание 4: Улучшение класса SmartDevice</h1>
 * 1. Добавить метод togglePower(), который переключает устройство между включенным и выключенным состоянием.<br>
 * 2. Изменить displayStatus(), чтобы он показывал, включено ли устройство или нет.<br>
 * 3. Протестировать класс, создав объект SmartDevice и несколько раз переключив его состояние.
 */
class SmartDevice {
    String deviceName;
    boolean isOn;

    // Конструктор, принимающий deviceName и устанавливающий isOn в false
    public SmartDevice(String deviceName) {
        this.deviceName = deviceName;
        this.isOn = false;
    }

    // Метод для включения устройства
    public void turnOn() {
        isOn = true;
    }

    // Метод для выключения устройства
    public void turnOff() {
        isOn = false;
    }

    // Метод для переключения состояния устройства
    public void togglePower() {
        isOn = !isOn;
    }

    // Метод для отображения состояния устройства
    public void displayStatus() {
        System.out.println("Device: " + deviceName + " is " + (isOn ? "On" : "Off"));
    }
}
