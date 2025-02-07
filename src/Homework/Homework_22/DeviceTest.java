package Homework.Homework_22;

public class DeviceTest {
    public static void main(String[] args) {

        // Создание объекта Device
        SmartDevice myDevice = new SmartDevice("Smart Light");

        // Вывод начального состояния устройства
        myDevice.displayStatus();

        // Включение устройства
        myDevice.turnOn();
        myDevice.displayStatus();

        // Переключение состояния устройства
        myDevice.togglePower();
        myDevice.displayStatus();

        // Переключение состояния устройства снова
        myDevice.togglePower();
        myDevice.displayStatus();

        // Выключение устройства
        myDevice.turnOff();
        myDevice.displayStatus();
    }
}
