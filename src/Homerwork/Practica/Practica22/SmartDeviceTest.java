package Homerwork.Practica.Practica22;

public class SmartDeviceTest {
    public static void main(String[] args) {
        SmartDevice lamp = new SmartDevice("Smart Lamp");
        lamp.displayStatus();
        lamp.turnOn();
        lamp.displayStatus();
        lamp.turnOff();
        lamp.displayStatus();

    }
}
