package Homework.lesson_27.OldVersion;

public class SmartThermostat extends SmartDevice {
    private int currentTemperature;
    private int targetTemperature;

    public int getCurrentTemperature() {
        return currentTemperature;  // Получает текущую температуру в помещении.
    }

    public void setTemperature(int targetTemp) {
        targetTemperature = targetTemp;
        System.out.println(getDeviceName() + " установлена температура на " + targetTemp);
    }

    @Override
    public String getDeviceName() {
        return "Умный термостат ";
    }
}
